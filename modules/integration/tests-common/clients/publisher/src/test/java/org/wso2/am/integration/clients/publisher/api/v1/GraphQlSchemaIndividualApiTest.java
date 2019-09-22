/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1;

import org.wso2.am.integration.clients.publisher.api.ApiException;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ErrorDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.GraphQLSchemaDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GraphQlSchemaIndividualApi
 */
@Ignore
public class GraphQlSchemaIndividualApiTest {

    private final GraphQlSchemaIndividualApi api = new GraphQlSchemaIndividualApi();

    
    /**
     * Get the Schema of a GraphQL API
     *
     * This operation can be used to retrieve the Schema definition of a GraphQL API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdGraphqlSchemaGetTest() throws ApiException {
        String apiId = null;
        String accept = null;
        String ifNoneMatch = null;
        GraphQLSchemaDTO response = api.apisApiIdGraphqlSchemaGet(apiId, accept, ifNoneMatch);

        // TODO: test validations
    }
    
}
