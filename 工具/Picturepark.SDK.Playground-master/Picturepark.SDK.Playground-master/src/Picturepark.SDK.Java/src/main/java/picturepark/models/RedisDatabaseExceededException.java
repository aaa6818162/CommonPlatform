/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The RedisDatabaseExceededException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("RedisDatabaseExceededException")
public class RedisDatabaseExceededException extends PictureparkException {
    /**
     * The customerId property.
     */
    @JsonProperty(value = "customerId")
    private String customerId;

    /**
     * The customerCount property.
     */
    @JsonProperty(value = "customerCount", required = true)
    private int customerCount;

    /**
     * The maxCount property.
     */
    @JsonProperty(value = "maxCount", required = true)
    private int maxCount;

    /**
     * The startIndex property.
     */
    @JsonProperty(value = "startIndex", required = true)
    private int startIndex;

    /**
     * The redisDatabaseCount property.
     */
    @JsonProperty(value = "redisDatabaseCount", required = true)
    private int redisDatabaseCount;

    /**
     * Get the customerId value.
     *
     * @return the customerId value
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Set the customerId value.
     *
     * @param customerId the customerId value to set
     * @return the RedisDatabaseExceededException object itself.
     */
    public RedisDatabaseExceededException withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Get the customerCount value.
     *
     * @return the customerCount value
     */
    public int customerCount() {
        return this.customerCount;
    }

    /**
     * Set the customerCount value.
     *
     * @param customerCount the customerCount value to set
     * @return the RedisDatabaseExceededException object itself.
     */
    public RedisDatabaseExceededException withCustomerCount(int customerCount) {
        this.customerCount = customerCount;
        return this;
    }

    /**
     * Get the maxCount value.
     *
     * @return the maxCount value
     */
    public int maxCount() {
        return this.maxCount;
    }

    /**
     * Set the maxCount value.
     *
     * @param maxCount the maxCount value to set
     * @return the RedisDatabaseExceededException object itself.
     */
    public RedisDatabaseExceededException withMaxCount(int maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Get the startIndex value.
     *
     * @return the startIndex value
     */
    public int startIndex() {
        return this.startIndex;
    }

    /**
     * Set the startIndex value.
     *
     * @param startIndex the startIndex value to set
     * @return the RedisDatabaseExceededException object itself.
     */
    public RedisDatabaseExceededException withStartIndex(int startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Get the redisDatabaseCount value.
     *
     * @return the redisDatabaseCount value
     */
    public int redisDatabaseCount() {
        return this.redisDatabaseCount;
    }

    /**
     * Set the redisDatabaseCount value.
     *
     * @param redisDatabaseCount the redisDatabaseCount value to set
     * @return the RedisDatabaseExceededException object itself.
     */
    public RedisDatabaseExceededException withRedisDatabaseCount(int redisDatabaseCount) {
        this.redisDatabaseCount = redisDatabaseCount;
        return this;
    }

}
