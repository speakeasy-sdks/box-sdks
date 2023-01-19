package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutFoldersIdWatermarkRequestBodyWatermark
 * The watermark to imprint on the folder
**/
public class PutFoldersIdWatermarkRequestBodyWatermark {
    @JsonProperty("imprint")
    public PutFoldersIdWatermarkRequestBodyWatermarkImprintEnum imprint;
    public PutFoldersIdWatermarkRequestBodyWatermark withImprint(PutFoldersIdWatermarkRequestBodyWatermarkImprintEnum imprint) {
        this.imprint = imprint;
        return this;
    }
}