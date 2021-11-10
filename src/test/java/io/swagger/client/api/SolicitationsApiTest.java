/*
 * Selling Partner API for Solicitations
 * With the Solicitations API you can build applications that send non-critical solicitations to buyers. You can get a list of solicitation types that are available for an order that you specify, then call an operation that sends a solicitation to the buyer for that order. Buyers cannot respond to solicitations sent by this API, and these solicitations do not appear in the Messaging section of Seller Central or in the recipient's Message Center. The Solicitations API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateProductReviewAndSellerFeedbackSolicitationResponse;
import io.swagger.client.model.GetSolicitationActionsForOrderResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SolicitationsApi
 */
@Ignore
public class SolicitationsApiTest {

    private final SolicitationsApi api = new SolicitationsApi();

    
    /**
     * 
     *
     * Sends a solicitation to a buyer asking for seller feedback and a product review for the specified order. Send only one productReviewAndSellerFeedback or free form proactive message per order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProductReviewAndSellerFeedbackSolicitationTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        CreateProductReviewAndSellerFeedbackSolicitationResponse response = api.createProductReviewAndSellerFeedbackSolicitation(amazonOrderId, marketplaceIds);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of solicitation types that are available for an order that you specify. A solicitation type is represented by an actions object, which contains a path and query parameter(s). You can use the path and parameter(s) to call an operation that sends a solicitation. Currently only the productReviewAndSellerFeedbackSolicitation solicitation type is available.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSolicitationActionsForOrderTest() throws ApiException {
        String amazonOrderId = null;
        List<String> marketplaceIds = null;
        GetSolicitationActionsForOrderResponse response = api.getSolicitationActionsForOrder(amazonOrderId, marketplaceIds);

        // TODO: test validations
    }
    
}
