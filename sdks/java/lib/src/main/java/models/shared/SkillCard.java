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
 * SkillCard
 * A generic Box Skill metadata card.
**/
public class SkillCard {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public SkillCard withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Long duration;
    public SkillCard withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public SkillCardEntries[] entries;
    public SkillCard withEntries(SkillCardEntries[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("invocation")
    public SkillCardInvocation invocation;
    public SkillCard withInvocation(SkillCardInvocation invocation) {
        this.invocation = invocation;
        return this;
    }
    @JsonProperty("skill")
    public SkillCardSkill skill;
    public SkillCard withSkill(SkillCardSkill skill) {
        this.skill = skill;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skill_card_title")
    public SkillCardSkillCardTitle skillCardTitle;
    public SkillCard withSkillCardTitle(SkillCardSkillCardTitle skillCardTitle) {
        this.skillCardTitle = skillCardTitle;
        return this;
    }
    @JsonProperty("skill_card_type")
    public SkillCardSkillCardTypeEnum skillCardType;
    public SkillCard withSkillCardType(SkillCardSkillCardTypeEnum skillCardType) {
        this.skillCardType = skillCardType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public SkillCardStatus status;
    public SkillCard withStatus(SkillCardStatus status) {
        this.status = status;
        return this;
    }
    @JsonProperty("type")
    public SkillCardTypeEnum type;
    public SkillCard withType(SkillCardTypeEnum type) {
        this.type = type;
        return this;
    }
}