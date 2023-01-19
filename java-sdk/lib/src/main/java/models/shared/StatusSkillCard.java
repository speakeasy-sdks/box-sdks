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
 * StatusSkillCard
 * A Box Skill metadata card that puts a status message in the metadata sidebar.
**/
public class StatusSkillCard {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public StatusSkillCard withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("invocation")
    public StatusSkillCardInvocation invocation;
    public StatusSkillCard withInvocation(StatusSkillCardInvocation invocation) {
        this.invocation = invocation;
        return this;
    }
    @JsonProperty("skill")
    public StatusSkillCardSkill skill;
    public StatusSkillCard withSkill(StatusSkillCardSkill skill) {
        this.skill = skill;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skill_card_title")
    public StatusSkillCardSkillCardTitle skillCardTitle;
    public StatusSkillCard withSkillCardTitle(StatusSkillCardSkillCardTitle skillCardTitle) {
        this.skillCardTitle = skillCardTitle;
        return this;
    }
    @JsonProperty("skill_card_type")
    public StatusSkillCardSkillCardTypeEnum skillCardType;
    public StatusSkillCard withSkillCardType(StatusSkillCardSkillCardTypeEnum skillCardType) {
        this.skillCardType = skillCardType;
        return this;
    }
    @JsonProperty("status")
    public StatusSkillCardStatus status;
    public StatusSkillCard withStatus(StatusSkillCardStatus status) {
        this.status = status;
        return this;
    }
    @JsonProperty("type")
    public StatusSkillCardTypeEnum type;
    public StatusSkillCard withType(StatusSkillCardTypeEnum type) {
        this.type = type;
        return this;
    }
}