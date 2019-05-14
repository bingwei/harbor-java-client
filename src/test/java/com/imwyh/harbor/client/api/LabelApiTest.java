/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.imwyh.harbor.client.api;

import com.imwyh.harbor.client.ApiException;
import com.imwyh.harbor.client.model.Label;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LabelApi
 */
@Ignore
public class LabelApiTest {

    private final LabelApi api = new LabelApi();

    /**
     * Return the attahced labels of chart.
     *
     * Return the attahced labels of the specified chart version.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartreporepoChartsnameversionLabelsGetTest() throws ApiException {
        String repo = null;
        String name = null;
        String version = null;
        api.chartreporepoChartsnameversionLabelsGet(repo, name, version);

        // TODO: test validations
    }
    /**
     * Mark label to chart.
     *
     * Mark label to the specified chart version.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartreporepoChartsnameversionLabelsPostTest() throws ApiException {
        Label body = null;
        String repo = null;
        String name = null;
        String version = null;
        api.chartreporepoChartsnameversionLabelsPost(body, repo, name, version);

        // TODO: test validations
    }
    /**
     * Remove label from chart.
     *
     * Remove label from the specified chart version.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chartreporepoChartsnameversionLabelsidDeleteTest() throws ApiException {
        String repo = null;
        String name = null;
        String version = null;
        Integer id = null;
        api.chartreporepoChartsnameversionLabelsidDelete(repo, name, version, id);

        // TODO: test validations
    }
}
