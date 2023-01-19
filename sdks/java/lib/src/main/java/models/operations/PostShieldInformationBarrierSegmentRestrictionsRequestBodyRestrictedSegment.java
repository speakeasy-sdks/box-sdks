package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment
 * The `type` and `id` of the restricted
 * shield information barrier segment.
**/
public class PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum type;
    public PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegment withType(PostShieldInformationBarrierSegmentRestrictionsRequestBodyRestrictedSegmentTypeEnum type) {
        this.type = type;
        return this;
    }
}