package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SkillCardsMetadata
 * The metadata assigned to a using for Box skills.
**/
public class SkillCardsMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$canEdit")
    public Boolean dollarCanEdit;
    public SkillCardsMetadata withDollarCanEdit(Boolean dollarCanEdit) {
        this.dollarCanEdit = dollarCanEdit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$id")
    public String dollarId;
    public SkillCardsMetadata withDollarId(String dollarId) {
        this.dollarId = dollarId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$parent")
    public String dollarParent;
    public SkillCardsMetadata withDollarParent(String dollarParent) {
        this.dollarParent = dollarParent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$scope")
    public String dollarScope;
    public SkillCardsMetadata withDollarScope(String dollarScope) {
        this.dollarScope = dollarScope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$template")
    public String dollarTemplate;
    public SkillCardsMetadata withDollarTemplate(String dollarTemplate) {
        this.dollarTemplate = dollarTemplate;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$type")
    public String dollarType;
    public SkillCardsMetadata withDollarType(String dollarType) {
        this.dollarType = dollarType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$typeVersion")
    public Long dollarTypeVersion;
    public SkillCardsMetadata withDollarTypeVersion(Long dollarTypeVersion) {
        this.dollarTypeVersion = dollarTypeVersion;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$version")
    public Long dollarVersion;
    public SkillCardsMetadata withDollarVersion(Long dollarVersion) {
        this.dollarVersion = dollarVersion;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cards")
    public Object[] cards;
    public SkillCardsMetadata withCards(Object[] cards) {
        this.cards = cards;
        return this;
    }
}