package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment
 * The `type` and `id` of the
 * requested shield information barrier segment.
**/
public class PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum type;
    public PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment withType(PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegmentTypeEnum type) {
        this.type = type;
        return this;
    }
}