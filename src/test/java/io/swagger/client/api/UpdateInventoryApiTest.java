/*
 * Selling Partner API for Direct Fulfillment Inventory Updates
 * The Selling Partner API for Direct Fulfillment Inventory Updates provides programmatic access to a direct fulfillment vendor's inventory updates.
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
import io.swagger.client.model.SubmitInventoryUpdateRequest;
import io.swagger.client.model.SubmitInventoryUpdateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UpdateInventoryApi
 */
@Ignore
public class UpdateInventoryApiTest {

    private final UpdateInventoryApi api = new UpdateInventoryApi();

    
    /**
     * 
     *
     * Submits inventory updates for the specified warehouse for either a partial or full feed of inventory items.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 10 | 10 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitInventoryUpdateTest() throws ApiException {
        SubmitInventoryUpdateRequest body = null;
        String warehouseId = null;
        SubmitInventoryUpdateResponse response = api.submitInventoryUpdate(body, warehouseId);

        // TODO: test validations
    }
    
}
