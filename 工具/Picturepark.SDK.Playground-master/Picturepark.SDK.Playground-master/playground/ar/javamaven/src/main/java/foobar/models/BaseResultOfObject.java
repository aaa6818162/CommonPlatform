/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BaseResultOfObject model.
 */
public class BaseResultOfObject {
    /**
     * The totalResults property.
     */
    @JsonProperty(value = "totalResults", required = true)
    private long totalResults;

    /**
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Object> results;

    /**
     * The pageToken property.
     */
    @JsonProperty(value = "pageToken")
    private String pageToken;

    /**
     * Get the totalResults value.
     *
     * @return the totalResults value
     */
    public long totalResults() {
        return this.totalResults;
    }

    /**
     * Set the totalResults value.
     *
     * @param totalResults the totalResults value to set
     * @return the BaseResultOfObject object itself.
     */
    public BaseResultOfObject withTotalResults(long totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * Get the results value.
     *
     * @return the results value
     */
    public List<Object> results() {
        return this.results;
    }

    /**
     * Set the results value.
     *
     * @param results the results value to set
     * @return the BaseResultOfObject object itself.
     */
    public BaseResultOfObject withResults(List<Object> results) {
        this.results = results;
        return this;
    }

    /**
     * Get the pageToken value.
     *
     * @return the pageToken value
     */
    public String pageToken() {
        return this.pageToken;
    }

    /**
     * Set the pageToken value.
     *
     * @param pageToken the pageToken value to set
     * @return the BaseResultOfObject object itself.
     */
    public BaseResultOfObject withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

}
