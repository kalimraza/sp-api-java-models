// DownloadExample.java
package io.swagger.client.api;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import com.amazon.spapi.documents.CompressionAlgorithm;
import com.amazon.spapi.documents.DownloadBundle;
import com.amazon.spapi.documents.DownloadHelper;
import com.amazon.spapi.documents.DownloadSpecification;
import com.amazon.spapi.documents.exception.CryptoException;
import com.amazon.spapi.documents.exception.HttpResponseException;
import com.amazon.spapi.documents.exception.MissingCharsetException;
import com.amazon.spapi.documents.impl.AESCryptoStreamFactory;

public class DownloadReport {
  final DownloadHelper downloadHelper = new DownloadHelper.Builder().build();

  // The key, initializationVector, url, and compressionAlgorithm are obtained from the response to
  // the getReportDocument operation.
  public void downloadAndDecrypt(String key, String initializationVector, String url, String compressionAlgorithm, BufferedWriter writer) {
    AESCryptoStreamFactory aesCryptoStreamFactory = null;
    if (key.length()!=0) {
       aesCryptoStreamFactory =
        new AESCryptoStreamFactory.Builder(key, initializationVector).build();
    } 
      
    DownloadSpecification downloadSpec = new DownloadSpecification.Builder(aesCryptoStreamFactory, url)
      .withCompressionAlgorithm(CompressionAlgorithm.fromEquivalent(compressionAlgorithm))
      .build();
      

      //DownloadSpecification downloadSpec = new DownloadSpecification.Builder (aesCryptoStreamFactory, url).build();
      //.withCompressionAlgorithm(CompressionAlgorithm.fromEquivalent(compressionAlgorithm))
      //.build();  

    try (DownloadBundle downloadBundle = downloadHelper.download(downloadSpec)) {
      // This example assumes that the downloaded file has a charset in the content type, e.g.
      // text/plain; charset=UTF-8
      try (BufferedReader reader = downloadBundle.newBufferedReader()) {
        String line;
        do {
          line = reader.readLine();

          writer.write(line);
          writer.newLine();
          // Process the decrypted line.
        } while (line != null);
        
      }
      
    }
    catch (CryptoException | HttpResponseException | IOException | MissingCharsetException e) {
        // Handle exception here.
        //return null;
    }
  }


  public void download(String url, BufferedWriter writer) {
    
    try (DownloadBundle downloadBundle = downloadHelper.download(url)) {
      // This example assumes that the downloaded file has a charset in the content type, e.g.
      // text/plain; charset=UTF-8
      try (BufferedReader reader = downloadBundle.newBufferedReader()) {
        
        //return reader;
        String line;
        do {
          line = reader.readLine();
          if (line != null){
            writer.write(line);
            writer.newLine();
            
          }  
          // Process the decrypted line.
        } while (line != null);
      }
    }
    catch (CryptoException | HttpResponseException | IOException | MissingCharsetException e) {
        // Handle exception here.
        //return null;
    }
  }



}
