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
 * ShieldInformationBarrier
 * A standard representation of a
 * shield information barrier object
**/
public class ShieldInformationBarrier {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public ShieldInformationBarrier withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public UserBase createdBy;
    public ShieldInformationBarrier withCreatedBy(UserBase createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("enabled_at")
    public OffsetDateTime enabledAt;
    public ShieldInformationBarrier withEnabledAt(OffsetDateTime enabledAt) {
        this.enabledAt = enabledAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled_by")
    public UserBase enabledBy;
    public ShieldInformationBarrier withEnabledBy(UserBase enabledBy) {
        this.enabledBy = enabledBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enterprise")
    public EnterpriseBase enterprise;
    public ShieldInformationBarrier withEnterprise(EnterpriseBase enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ShieldInformationBarrier withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public ShieldInformationBarrierStatusEnum status;
    public ShieldInformationBarrier withStatus(ShieldInformationBarrierStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ShieldInformationBarrierTypeEnum type;
    public ShieldInformationBarrier withType(ShieldInformationBarrierTypeEnum type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public ShieldInformationBarrier withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_by")
    public UserBase updatedBy;
    public ShieldInformationBarrier withUpdatedBy(UserBase updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
}