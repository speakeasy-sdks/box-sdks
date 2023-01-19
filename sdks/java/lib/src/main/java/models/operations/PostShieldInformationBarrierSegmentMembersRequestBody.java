package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostShieldInformationBarrierSegmentMembersRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shield_information_barrier")
    public .models.shared.ShieldInformationBarrierBase shieldInformationBarrier;
    public PostShieldInformationBarrierSegmentMembersRequestBody withShieldInformationBarrier(.models.shared.ShieldInformationBarrierBase shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
    @JsonProperty("shield_information_barrier_segment")
    public PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment shieldInformationBarrierSegment;
    public PostShieldInformationBarrierSegmentMembersRequestBody withShieldInformationBarrierSegment(PostShieldInformationBarrierSegmentMembersRequestBodyShieldInformationBarrierSegment shieldInformationBarrierSegment) {
        this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum type;
    public PostShieldInformationBarrierSegmentMembersRequestBody withType(PostShieldInformationBarrierSegmentMembersRequestBodyTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonProperty("user")
    public .models.shared.UserBase user;
    public PostShieldInformationBarrierSegmentMembersRequestBody withUser(.models.shared.UserBase user) {
        this.user = user;
        return this;
    }
}