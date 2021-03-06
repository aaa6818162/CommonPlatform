/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ExifMetadata model.
 */
public class ExifMetadata {
    /**
     * The exif property.
     */
    @JsonProperty(value = "exif")
    private Exif exif;

    /**
     * The exifAux property.
     */
    @JsonProperty(value = "exifAux")
    private ExifAux exifAux;

    /**
     * Get the exif value.
     *
     * @return the exif value
     */
    public Exif exif() {
        return this.exif;
    }

    /**
     * Set the exif value.
     *
     * @param exif the exif value to set
     * @return the ExifMetadata object itself.
     */
    public ExifMetadata withExif(Exif exif) {
        this.exif = exif;
        return this;
    }

    /**
     * Get the exifAux value.
     *
     * @return the exifAux value
     */
    public ExifAux exifAux() {
        return this.exifAux;
    }

    /**
     * Set the exifAux value.
     *
     * @param exifAux the exifAux value to set
     * @return the ExifMetadata object itself.
     */
    public ExifMetadata withExifAux(ExifAux exifAux) {
        this.exifAux = exifAux;
        return this;
    }

}
