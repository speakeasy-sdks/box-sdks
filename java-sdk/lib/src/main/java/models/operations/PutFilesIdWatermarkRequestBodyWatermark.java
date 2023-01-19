package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutFilesIdWatermarkRequestBodyWatermark
 * The watermark to imprint on the file
**/
public class PutFilesIdWatermarkRequestBodyWatermark {
    @JsonProperty("imprint")
    public PutFilesIdWatermarkRequestBodyWatermarkImprintEnum imprint;
    public PutFilesIdWatermarkRequestBodyWatermark withImprint(PutFilesIdWatermarkRequestBodyWatermarkImprintEnum imprint) {
        this.imprint = imprint;
        return this;
    }
}