package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutFoldersIdWatermarkRequestBody {
    @JsonProperty("watermark")
    public PutFoldersIdWatermarkRequestBodyWatermark watermark;
    public PutFoldersIdWatermarkRequestBody withWatermark(PutFoldersIdWatermarkRequestBodyWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
}