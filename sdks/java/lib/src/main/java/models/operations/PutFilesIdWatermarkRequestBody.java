package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutFilesIdWatermarkRequestBody {
    @JsonProperty("watermark")
    public PutFilesIdWatermarkRequestBodyWatermark watermark;
    public PutFilesIdWatermarkRequestBody withWatermark(PutFilesIdWatermarkRequestBodyWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
}