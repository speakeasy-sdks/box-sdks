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
 * TimelineSkillCard
 * A Box Skill metadata card that places a list of images on a
 * timeline.
**/
public class TimelineSkillCard {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public TimelineSkillCard withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Long duration;
    public TimelineSkillCard withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    @JsonProperty("entries")
    public TimelineSkillCardEntries[] entries;
    public TimelineSkillCard withEntries(TimelineSkillCardEntries[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("invocation")
    public TimelineSkillCardInvocation invocation;
    public TimelineSkillCard withInvocation(TimelineSkillCardInvocation invocation) {
        this.invocation = invocation;
        return this;
    }
    @JsonProperty("skill")
    public TimelineSkillCardSkill skill;
    public TimelineSkillCard withSkill(TimelineSkillCardSkill skill) {
        this.skill = skill;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skill_card_title")
    public TimelineSkillCardSkillCardTitle skillCardTitle;
    public TimelineSkillCard withSkillCardTitle(TimelineSkillCardSkillCardTitle skillCardTitle) {
        this.skillCardTitle = skillCardTitle;
        return this;
    }
    @JsonProperty("skill_card_type")
    public TimelineSkillCardSkillCardTypeEnum skillCardType;
    public TimelineSkillCard withSkillCardType(TimelineSkillCardSkillCardTypeEnum skillCardType) {
        this.skillCardType = skillCardType;
        return this;
    }
    @JsonProperty("type")
    public TimelineSkillCardTypeEnum type;
    public TimelineSkillCard withType(TimelineSkillCardTypeEnum type) {
        this.type = type;
        return this;
    }
}