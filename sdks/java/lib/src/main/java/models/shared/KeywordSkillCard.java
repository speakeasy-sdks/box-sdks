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
 * KeywordSkillCard
 * A skill card that contains a set of keywords
**/
public class KeywordSkillCard {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public KeywordSkillCard withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonProperty("entries")
    public KeywordSkillCardEntries[] entries;
    public KeywordSkillCard withEntries(KeywordSkillCardEntries[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonProperty("invocation")
    public KeywordSkillCardInvocation invocation;
    public KeywordSkillCard withInvocation(KeywordSkillCardInvocation invocation) {
        this.invocation = invocation;
        return this;
    }
    @JsonProperty("skill")
    public KeywordSkillCardSkill skill;
    public KeywordSkillCard withSkill(KeywordSkillCardSkill skill) {
        this.skill = skill;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skill_card_title")
    public KeywordSkillCardSkillCardTitle skillCardTitle;
    public KeywordSkillCard withSkillCardTitle(KeywordSkillCardSkillCardTitle skillCardTitle) {
        this.skillCardTitle = skillCardTitle;
        return this;
    }
    @JsonProperty("skill_card_type")
    public KeywordSkillCardSkillCardTypeEnum skillCardType;
    public KeywordSkillCard withSkillCardType(KeywordSkillCardSkillCardTypeEnum skillCardType) {
        this.skillCardType = skillCardType;
        return this;
    }
    @JsonProperty("type")
    public KeywordSkillCardTypeEnum type;
    public KeywordSkillCard withType(KeywordSkillCardTypeEnum type) {
        this.type = type;
        return this;
    }
}