package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment
 * The `type` and `id` of the requested
 * shield information barrier segment.
**/
public class PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum type;
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegment withType(PostShieldInformationBarrierSegmentRestrictionsRequestBodyShieldInformationBarrierSegmentTypeEnum type) {
        this.type = type;
        return this;
    }
}