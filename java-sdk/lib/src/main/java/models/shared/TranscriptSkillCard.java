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
 * TranscriptSkillCard
 * A Box Skill metadata card that adds a transcript to a file.
**/
public class TranscriptSkillCard {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public TranscriptSkillCard withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Long duration;
    public TranscriptSkillCard withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    @JsonProperty("entries")
    public TranscriptSkillCardEntries[] entries;
    public TranscriptSkillCard withEntries(TranscriptSkillCardEntries[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("invocation")
    public TranscriptSkillCardInvocation invocation;
    public TranscriptSkillCard withInvocation(TranscriptSkillCardInvocation invocation) {
        this.invocation = invocation;
        return this;
    }
    @JsonProperty("skill")
    public TranscriptSkillCardSkill skill;
    public TranscriptSkillCard withSkill(TranscriptSkillCardSkill skill) {
        this.skill = skill;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skill_card_title")
    public TranscriptSkillCardSkillCardTitle skillCardTitle;
    public TranscriptSkillCard withSkillCardTitle(TranscriptSkillCardSkillCardTitle skillCardTitle) {
        this.skillCardTitle = skillCardTitle;
        return this;
    }
    @JsonProperty("skill_card_type")
    public TranscriptSkillCardSkillCardTypeEnum skillCardType;
    public TranscriptSkillCard withSkillCardType(TranscriptSkillCardSkillCardTypeEnum skillCardType) {
        this.skillCardType = skillCardType;
        return this;
    }
    @JsonProperty("type")
    public TranscriptSkillCardTypeEnum type;
    public TranscriptSkillCard withType(TranscriptSkillCardTypeEnum type) {
        this.type = type;
        return this;
    }
}