package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Watermark
 * A watermark is a semi-transparent overlay on an embedded file
 * preview that displays a viewer's email address or user ID
 * and the time of access over a file's content
**/
public class Watermark {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("watermark")
    public WatermarkWatermark watermark;
    public Watermark withWatermark(WatermarkWatermark watermark) {
        this.watermark = watermark;
        return this;
    }
}