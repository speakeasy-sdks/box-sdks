package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * ShieldInformationBarrierSegmentMember
 * A base representation of a
 * shield information barrier segment member object
**/
public class ShieldInformationBarrierSegmentMember {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public ShieldInformationBarrierSegmentMember withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserBase createdBy;
    public ShieldInformationBarrierSegmentMember withCreatedBy(UserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ShieldInformationBarrierSegmentMember withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shield_information_barrier")
    public ShieldInformationBarrierBase shieldInformationBarrier;
    public ShieldInformationBarrierSegmentMember withShieldInformationBarrier(ShieldInformationBarrierBase shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shield_information_barrier_segment")
    public ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment shieldInformationBarrierSegment;
    public ShieldInformationBarrierSegmentMember withShieldInformationBarrierSegment(ShieldInformationBarrierSegmentMemberShieldInformationBarrierSegment shieldInformationBarrierSegment) {
        this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ShieldInformationBarrierSegmentMemberTypeEnum type;
    public ShieldInformationBarrierSegmentMember withType(ShieldInformationBarrierSegmentMemberTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public ShieldInformationBarrierSegmentMember withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_by")
    public UserBase updatedBy;
    public ShieldInformationBarrierSegmentMember withUpdatedBy(UserBase updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public UserBase user;
    public ShieldInformationBarrierSegmentMember withUser(UserBase user) {
        this.user = user;
        return this;
    }
}