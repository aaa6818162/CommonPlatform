/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Tiff model.
 */
public class Tiff {
    /**
     * The artist property.
     */
    @JsonProperty(value = "artist")
    private String artist;

    /**
     * The bitsPerSample property.
     */
    @JsonProperty(value = "bitsPerSample")
    private List<Integer> bitsPerSample;

    /**
     * Possible values include: 'Uncompressed', 'CCITT', 'T4', 'T6', 'LZW',
     * 'OJPEG', 'JPEG', 'Deflate', 'T82', 'T43', 'NeXT', 'ARW', 'RAW', 'SRW',
     * 'Group3_1D', 'PackBits', 'ThunderScan', 'KDC', 'RasterPadding',
     * 'LineWork', 'HighContinuous', 'BinaryLineWork', 'PixarFilm', 'PixarLog',
     * 'DCS', 'JBIG', 'JPEG2000', 'NEF', 'JBIG2', 'DCR', 'PEF'.
     */
    @JsonProperty(value = "compression")
    private String compression;

    /**
     * The copyright property.
     */
    @JsonProperty(value = "copyright")
    private Map<String, String> copyright;

    /**
     * The dateTimeProperty property.
     */
    @JsonProperty(value = "dateTime")
    private DateTime dateTimeProperty;

    /**
     * The imageDescription property.
     */
    @JsonProperty(value = "imageDescription")
    private Map<String, String> imageDescription;

    /**
     * The imageLength property.
     */
    @JsonProperty(value = "imageLength")
    private Integer imageLength;

    /**
     * The imageWidth property.
     */
    @JsonProperty(value = "imageWidth")
    private Integer imageWidth;

    /**
     * The make property.
     */
    @JsonProperty(value = "make")
    private String make;

    /**
     * The model property.
     */
    @JsonProperty(value = "model")
    private String model;

    /**
     * Possible values include: 'None', 'TopRowLeftColumn',
     * 'TopRowRightColumn', 'BottomRowLeftColumn', 'BottomRowRightColumn',
     * 'LeftRowTopColumn', 'RightRowTopColumn', 'RightRowBottomColumn',
     * 'LeftRowBottomColumn', 'Unknown'.
     */
    @JsonProperty(value = "orientation")
    private String orientation;

    /**
     * Possible values include: 'WhiteIsZero', 'BlackIsZero', 'RGB', 'Palette',
     * 'TransparencyMask', 'CMYK', 'YCbCr', 'CIELab', 'ICCLab', 'ITULab',
     * 'ColorFilterArray', 'LogL', 'LogLUV', 'LinearRaw'.
     */
    @JsonProperty(value = "photometricInterpretation")
    private String photometricInterpretation;

    /**
     * Possible values include: 'Chunky', 'Planar', 'Line'.
     */
    @JsonProperty(value = "planarConfiguration")
    private String planarConfiguration;

    /**
     * The primaryChromaticities property.
     */
    @JsonProperty(value = "primaryChromaticities")
    private List<String> primaryChromaticities;

    /**
     * The referenceBlackWhite property.
     */
    @JsonProperty(value = "referenceBlackWhite")
    private List<String> referenceBlackWhite;

    /**
     * Possible values include: 'None', 'Inch', 'Centimeter'.
     */
    @JsonProperty(value = "resolutionUnit")
    private String resolutionUnit;

    /**
     * The samplesPerPixel property.
     */
    @JsonProperty(value = "samplesPerPixel")
    private Integer samplesPerPixel;

    /**
     * The software property.
     */
    @JsonProperty(value = "software")
    private String software;

    /**
     * The transferFunction property.
     */
    @JsonProperty(value = "transferFunction")
    private List<Integer> transferFunction;

    /**
     * The whitePoint property.
     */
    @JsonProperty(value = "whitePoint")
    private List<String> whitePoint;

    /**
     * The xResolution property.
     */
    @JsonProperty(value = "xResolution")
    private String xResolution;

    /**
     * The yResolution property.
     */
    @JsonProperty(value = "yResolution")
    private String yResolution;

    /**
     * The yCbCrCoefficients property.
     */
    @JsonProperty(value = "yCbCrCoefficients")
    private List<String> yCbCrCoefficients;

    /**
     * Possible values include: 'Centered', 'Cosited'.
     */
    @JsonProperty(value = "yCbCrPositioning")
    private String yCbCrPositioning;

    /**
     * Possible values include: 'YCbCr111', 'YCbCr422', 'YCbCr420'.
     */
    @JsonProperty(value = "yCbCrSubSampling")
    private String yCbCrSubSampling;

    /**
     * The nativeDigest property.
     */
    @JsonProperty(value = "nativeDigest")
    private String nativeDigest;

    /**
     * Get the artist value.
     *
     * @return the artist value
     */
    public String artist() {
        return this.artist;
    }

    /**
     * Set the artist value.
     *
     * @param artist the artist value to set
     * @return the Tiff object itself.
     */
    public Tiff withArtist(String artist) {
        this.artist = artist;
        return this;
    }

    /**
     * Get the bitsPerSample value.
     *
     * @return the bitsPerSample value
     */
    public List<Integer> bitsPerSample() {
        return this.bitsPerSample;
    }

    /**
     * Set the bitsPerSample value.
     *
     * @param bitsPerSample the bitsPerSample value to set
     * @return the Tiff object itself.
     */
    public Tiff withBitsPerSample(List<Integer> bitsPerSample) {
        this.bitsPerSample = bitsPerSample;
        return this;
    }

    /**
     * Get the compression value.
     *
     * @return the compression value
     */
    public String compression() {
        return this.compression;
    }

    /**
     * Set the compression value.
     *
     * @param compression the compression value to set
     * @return the Tiff object itself.
     */
    public Tiff withCompression(String compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get the copyright value.
     *
     * @return the copyright value
     */
    public Map<String, String> copyright() {
        return this.copyright;
    }

    /**
     * Set the copyright value.
     *
     * @param copyright the copyright value to set
     * @return the Tiff object itself.
     */
    public Tiff withCopyright(Map<String, String> copyright) {
        this.copyright = copyright;
        return this;
    }

    /**
     * Get the dateTimeProperty value.
     *
     * @return the dateTimeProperty value
     */
    public DateTime dateTimeProperty() {
        return this.dateTimeProperty;
    }

    /**
     * Set the dateTimeProperty value.
     *
     * @param dateTimeProperty the dateTimeProperty value to set
     * @return the Tiff object itself.
     */
    public Tiff withDateTimeProperty(DateTime dateTimeProperty) {
        this.dateTimeProperty = dateTimeProperty;
        return this;
    }

    /**
     * Get the imageDescription value.
     *
     * @return the imageDescription value
     */
    public Map<String, String> imageDescription() {
        return this.imageDescription;
    }

    /**
     * Set the imageDescription value.
     *
     * @param imageDescription the imageDescription value to set
     * @return the Tiff object itself.
     */
    public Tiff withImageDescription(Map<String, String> imageDescription) {
        this.imageDescription = imageDescription;
        return this;
    }

    /**
     * Get the imageLength value.
     *
     * @return the imageLength value
     */
    public Integer imageLength() {
        return this.imageLength;
    }

    /**
     * Set the imageLength value.
     *
     * @param imageLength the imageLength value to set
     * @return the Tiff object itself.
     */
    public Tiff withImageLength(Integer imageLength) {
        this.imageLength = imageLength;
        return this;
    }

    /**
     * Get the imageWidth value.
     *
     * @return the imageWidth value
     */
    public Integer imageWidth() {
        return this.imageWidth;
    }

    /**
     * Set the imageWidth value.
     *
     * @param imageWidth the imageWidth value to set
     * @return the Tiff object itself.
     */
    public Tiff withImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }

    /**
     * Get the make value.
     *
     * @return the make value
     */
    public String make() {
        return this.make;
    }

    /**
     * Set the make value.
     *
     * @param make the make value to set
     * @return the Tiff object itself.
     */
    public Tiff withMake(String make) {
        this.make = make;
        return this;
    }

    /**
     * Get the model value.
     *
     * @return the model value
     */
    public String model() {
        return this.model;
    }

    /**
     * Set the model value.
     *
     * @param model the model value to set
     * @return the Tiff object itself.
     */
    public Tiff withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Get the orientation value.
     *
     * @return the orientation value
     */
    public String orientation() {
        return this.orientation;
    }

    /**
     * Set the orientation value.
     *
     * @param orientation the orientation value to set
     * @return the Tiff object itself.
     */
    public Tiff withOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    /**
     * Get the photometricInterpretation value.
     *
     * @return the photometricInterpretation value
     */
    public String photometricInterpretation() {
        return this.photometricInterpretation;
    }

    /**
     * Set the photometricInterpretation value.
     *
     * @param photometricInterpretation the photometricInterpretation value to set
     * @return the Tiff object itself.
     */
    public Tiff withPhotometricInterpretation(String photometricInterpretation) {
        this.photometricInterpretation = photometricInterpretation;
        return this;
    }

    /**
     * Get the planarConfiguration value.
     *
     * @return the planarConfiguration value
     */
    public String planarConfiguration() {
        return this.planarConfiguration;
    }

    /**
     * Set the planarConfiguration value.
     *
     * @param planarConfiguration the planarConfiguration value to set
     * @return the Tiff object itself.
     */
    public Tiff withPlanarConfiguration(String planarConfiguration) {
        this.planarConfiguration = planarConfiguration;
        return this;
    }

    /**
     * Get the primaryChromaticities value.
     *
     * @return the primaryChromaticities value
     */
    public List<String> primaryChromaticities() {
        return this.primaryChromaticities;
    }

    /**
     * Set the primaryChromaticities value.
     *
     * @param primaryChromaticities the primaryChromaticities value to set
     * @return the Tiff object itself.
     */
    public Tiff withPrimaryChromaticities(List<String> primaryChromaticities) {
        this.primaryChromaticities = primaryChromaticities;
        return this;
    }

    /**
     * Get the referenceBlackWhite value.
     *
     * @return the referenceBlackWhite value
     */
    public List<String> referenceBlackWhite() {
        return this.referenceBlackWhite;
    }

    /**
     * Set the referenceBlackWhite value.
     *
     * @param referenceBlackWhite the referenceBlackWhite value to set
     * @return the Tiff object itself.
     */
    public Tiff withReferenceBlackWhite(List<String> referenceBlackWhite) {
        this.referenceBlackWhite = referenceBlackWhite;
        return this;
    }

    /**
     * Get the resolutionUnit value.
     *
     * @return the resolutionUnit value
     */
    public String resolutionUnit() {
        return this.resolutionUnit;
    }

    /**
     * Set the resolutionUnit value.
     *
     * @param resolutionUnit the resolutionUnit value to set
     * @return the Tiff object itself.
     */
    public Tiff withResolutionUnit(String resolutionUnit) {
        this.resolutionUnit = resolutionUnit;
        return this;
    }

    /**
     * Get the samplesPerPixel value.
     *
     * @return the samplesPerPixel value
     */
    public Integer samplesPerPixel() {
        return this.samplesPerPixel;
    }

    /**
     * Set the samplesPerPixel value.
     *
     * @param samplesPerPixel the samplesPerPixel value to set
     * @return the Tiff object itself.
     */
    public Tiff withSamplesPerPixel(Integer samplesPerPixel) {
        this.samplesPerPixel = samplesPerPixel;
        return this;
    }

    /**
     * Get the software value.
     *
     * @return the software value
     */
    public String software() {
        return this.software;
    }

    /**
     * Set the software value.
     *
     * @param software the software value to set
     * @return the Tiff object itself.
     */
    public Tiff withSoftware(String software) {
        this.software = software;
        return this;
    }

    /**
     * Get the transferFunction value.
     *
     * @return the transferFunction value
     */
    public List<Integer> transferFunction() {
        return this.transferFunction;
    }

    /**
     * Set the transferFunction value.
     *
     * @param transferFunction the transferFunction value to set
     * @return the Tiff object itself.
     */
    public Tiff withTransferFunction(List<Integer> transferFunction) {
        this.transferFunction = transferFunction;
        return this;
    }

    /**
     * Get the whitePoint value.
     *
     * @return the whitePoint value
     */
    public List<String> whitePoint() {
        return this.whitePoint;
    }

    /**
     * Set the whitePoint value.
     *
     * @param whitePoint the whitePoint value to set
     * @return the Tiff object itself.
     */
    public Tiff withWhitePoint(List<String> whitePoint) {
        this.whitePoint = whitePoint;
        return this;
    }

    /**
     * Get the xResolution value.
     *
     * @return the xResolution value
     */
    public String xResolution() {
        return this.xResolution;
    }

    /**
     * Set the xResolution value.
     *
     * @param xResolution the xResolution value to set
     * @return the Tiff object itself.
     */
    public Tiff withXResolution(String xResolution) {
        this.xResolution = xResolution;
        return this;
    }

    /**
     * Get the yResolution value.
     *
     * @return the yResolution value
     */
    public String yResolution() {
        return this.yResolution;
    }

    /**
     * Set the yResolution value.
     *
     * @param yResolution the yResolution value to set
     * @return the Tiff object itself.
     */
    public Tiff withYResolution(String yResolution) {
        this.yResolution = yResolution;
        return this;
    }

    /**
     * Get the yCbCrCoefficients value.
     *
     * @return the yCbCrCoefficients value
     */
    public List<String> yCbCrCoefficients() {
        return this.yCbCrCoefficients;
    }

    /**
     * Set the yCbCrCoefficients value.
     *
     * @param yCbCrCoefficients the yCbCrCoefficients value to set
     * @return the Tiff object itself.
     */
    public Tiff withYCbCrCoefficients(List<String> yCbCrCoefficients) {
        this.yCbCrCoefficients = yCbCrCoefficients;
        return this;
    }

    /**
     * Get the yCbCrPositioning value.
     *
     * @return the yCbCrPositioning value
     */
    public String yCbCrPositioning() {
        return this.yCbCrPositioning;
    }

    /**
     * Set the yCbCrPositioning value.
     *
     * @param yCbCrPositioning the yCbCrPositioning value to set
     * @return the Tiff object itself.
     */
    public Tiff withYCbCrPositioning(String yCbCrPositioning) {
        this.yCbCrPositioning = yCbCrPositioning;
        return this;
    }

    /**
     * Get the yCbCrSubSampling value.
     *
     * @return the yCbCrSubSampling value
     */
    public String yCbCrSubSampling() {
        return this.yCbCrSubSampling;
    }

    /**
     * Set the yCbCrSubSampling value.
     *
     * @param yCbCrSubSampling the yCbCrSubSampling value to set
     * @return the Tiff object itself.
     */
    public Tiff withYCbCrSubSampling(String yCbCrSubSampling) {
        this.yCbCrSubSampling = yCbCrSubSampling;
        return this;
    }

    /**
     * Get the nativeDigest value.
     *
     * @return the nativeDigest value
     */
    public String nativeDigest() {
        return this.nativeDigest;
    }

    /**
     * Set the nativeDigest value.
     *
     * @param nativeDigest the nativeDigest value to set
     * @return the Tiff object itself.
     */
    public Tiff withNativeDigest(String nativeDigest) {
        this.nativeDigest = nativeDigest;
        return this;
    }

}
