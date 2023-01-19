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
 * ShieldInformationBarrierSegmentRestriction
 * A base representation of
 * a segment restriction object for
 * the shield information barrier
**/
public class ShieldInformationBarrierSegmentRestriction {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public ShieldInformationBarrierSegmentRestriction withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserBase createdBy;
    public ShieldInformationBarrierSegmentRestriction withCreatedBy(UserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ShieldInformationBarrierSegmentRestriction withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("restricted_segment")
    public ShieldInformationBarrierSegmentRestrictionRestrictedSegment restrictedSegment;
    public ShieldInformationBarrierSegmentRestriction withRestrictedSegment(ShieldInformationBarrierSegmentRestrictionRestrictedSegment restrictedSegment) {
        this.restrictedSegment = restrictedSegment;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shield_information_barrier")
    public ShieldInformationBarrierBase shieldInformationBarrier;
    public ShieldInformationBarrierSegmentRestriction withShieldInformationBarrier(ShieldInformationBarrierBase shieldInformationBarrier) {
        this.shieldInformationBarrier = shieldInformationBarrier;
        return this;
    }
    @JsonProperty("shield_information_barrier_segment")
    public ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment shieldInformationBarrierSegment;
    public ShieldInformationBarrierSegmentRestriction withShieldInformationBarrierSegment(ShieldInformationBarrierSegmentRestrictionShieldInformationBarrierSegment shieldInformationBarrierSegment) {
        this.shieldInformationBarrierSegment = shieldInformationBarrierSegment;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ShieldInformationBarrierSegmentRestrictionTypeEnum type;
    public ShieldInformationBarrierSegmentRestriction withType(ShieldInformationBarrierSegmentRestrictionTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public ShieldInformationBarrierSegmentRestriction withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_by")
    public UserBase updatedBy;
    public ShieldInformationBarrierSegmentRestriction withUpdatedBy(UserBase updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
}