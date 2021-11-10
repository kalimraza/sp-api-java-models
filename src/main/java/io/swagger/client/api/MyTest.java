package io.swagger.client.api;

import java.io.BufferedReader;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.model.CreateReportResponse;
import io.swagger.client.model.CreateReportScheduleResponse;
import io.swagger.client.model.CreateReportScheduleSpecification;
import io.swagger.client.model.CreateReportSpecification;
import io.swagger.client.model.ErrorList;
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

import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationSigner;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials.LWAAuthorizationCredentialsBuilder;
import com.amazon.SellingPartnerAPIAA.AWSSigV4Signer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import java.io.BufferedWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MyTest {
  
  //public void service(HttpRequest request, HttpResponse httpresponse) throws Exception {

   public static void main(String[] args) {

	 try
      {

        LWAAuthorizationCredentials lwaAuthorizationCredentials = LWAAuthorizationCredentials.builder()
        .clientId("amzn1.application-oa2-client.xxxxxxxxxxxxxxxxxxxxxxx")
        .clientSecret("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
        .refreshToken("Atzr|xxxxxxxxxxxxxxxxxxxxxxxx")
        .endpoint("https://api.amazon.com/auth/o2/token")
        .build();

        AWSAuthenticationCredentials awsAuthenticationCredentials = AWSAuthenticationCredentials.builder()
        .accessKeyId("AKIAXXXXXXXXXXXXXXXXXX")
        .secretKey("XXXXXXXXXXXXXXXXXXXXXXXXXXXX")
        .region("us-east-1")
        .build();   
            
        LWAAuthorizationSigner  lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
        AWSSigV4Signer  awsAuthorizationSigner = new AWSSigV4Signer(awsAuthenticationCredentials);
        ApiClient client = new ApiClient();
        client.setLWAAuthorizationSigner(lwaAuthorizationSigner);
        client.setAWSSigV4Signer(awsAuthorizationSigner);

        ReportsApi api = new ReportsApi(client);
        List<String> reportTypes = new ArrayList<String>();            
        reportTypes.add("GET_FBA_MYI_UNSUPPRESSED_INVENTORY_DATA");        
        
        List<String> processingStatuses = null;
        List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER");
        
        Integer pageSize = null;
        OffsetDateTime createdSince = null;
        OffsetDateTime createdUntil = null;
        String nextToken = null;
        
        System.out.println("Fetching reports...");
        GetReportsResponse response = api.getReports(reportTypes, processingStatuses, marketplaceIds, pageSize, createdSince, createdUntil, nextToken);
        System.out.println(response.toString());

        
        } catch(Exception x ) {        
          System.out.println(x.getMessage());
        }
  }
}

