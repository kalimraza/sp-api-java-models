package io.swagger.client.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.io.InputStream;
import java.util.Properties;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.CreateReportResponse;
import io.swagger.client.model.CreateReportScheduleResponse;
import io.swagger.client.model.CreateReportScheduleSpecification;
import io.swagger.client.model.CreateReportSpecification;
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.GetReportDocumentResponse;
import io.swagger.client.model.GetReportsResponse;

import org.apache.commons.io.output.WriterOutputStream;
//import org.apache.commons.lang3.RandomStringUtils;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.Report;
import io.swagger.client.model.ReportDocument;
import io.swagger.client.model.ReportList;
import io.swagger.client.model.ReportSchedule;
import io.swagger.client.model.ReportScheduleList;
import io.swagger.client.model.Report.ProcessingStatusEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentialsProvider;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationSigner;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials.LWAAuthorizationCredentialsBuilder;
import com.amazon.SellingPartnerAPIAA.AWSSigV4Signer;

public class MyTest {  

   public static void main(String[] args) {

	 try
      {
        Properties prop = new Properties();        
        String projdir = System.getProperty("user.dir");
        String propFileName = projdir+"\\config\\"+"config.properties";        
        prop.load(new FileInputStream(propFileName));        

        LWAAuthorizationCredentials lwaAuthorizationCredentials = LWAAuthorizationCredentials.builder()
        .clientId(prop.getProperty("clientId"))
        .clientSecret(prop.getProperty("clientSecret"))
        .refreshToken(prop.getProperty("refreshToken"))
        .endpoint(prop.getProperty("endpoint"))
        .build();

        AWSAuthenticationCredentials awsAuthenticationCredentials = AWSAuthenticationCredentials.builder()
        .accessKeyId(prop.getProperty("accessKeyId"))
        .secretKey(prop.getProperty("secretKey"))
        .region(prop.getProperty("region"))
        .build();

        UUID uuid = UUID.randomUUID();
        AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider=AWSAuthenticationCredentialsProvider.builder()
          .roleArn(prop.getProperty("roleArn"))
          .roleSessionName(uuid.toString())
          .build();
        
        LWAAuthorizationSigner  lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);                       
        AWSSigV4Signer  awsAuthorizationSigner = new AWSSigV4Signer(awsAuthenticationCredentials, awsAuthenticationCredentialsProvider);



        ApiClient client = new ApiClient();
        client.setLWAAuthorizationSigner(lwaAuthorizationSigner);
        client.setAWSSigV4Signer(awsAuthorizationSigner);        

        ReportsApi api = new ReportsApi(client);
        List<String> reportTypes = new ArrayList<String>();            
        reportTypes.add("GET_FBA_MYI_UNSUPPRESSED_INVENTORY_DATA");        
        
        List<String> processingStatuses = null;
        List<String> marketplaceIds = Arrays.asList(prop.getProperty("marketplaceId")); 
        
        Integer pageSize = null;
        OffsetDateTime createdSince = null;
        OffsetDateTime createdUntil = null;
        String nextToken = null;
        
        System.out.println("Fetching reports...");
        
        GetReportsResponse response = api.getReports(reportTypes, processingStatuses, marketplaceIds, pageSize, createdSince, createdUntil, nextToken);
       
        System.out.println(response.toString());

        String documentId = "";
         
        if (response.getReports().size() > 0) {
          for (Report l : response.getReports()) {
            if (l.getProcessingStatus() == ProcessingStatusEnum.DONE) {              
              documentId = l.getReportDocumentId();
              break; //pick latest report  
            }
          }
        } else {
          System.out.println("No report found");     
          return;     
        }

        ReportDocument doc = api.getReportDocument(documentId);
        File file = new File("tmp_report.txt");
        if (!file.exists()) {
            file.createNewFile();
        }   
        FileWriter fw = new FileWriter(file);              

        BufferedWriter writer = new BufferedWriter(fw);
        DownloadReport d = new DownloadReport();
        if (doc.getCompressionAlgorithm() == null ) {            
            d.download(doc.getUrl(), writer);  
        } 
        writer.flush();
        writer.close();
        

        
        } catch(Exception x ) {        
          System.out.println(x.getMessage());
        }
  }
}

