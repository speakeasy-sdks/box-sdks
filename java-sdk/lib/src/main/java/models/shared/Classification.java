package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Classification
 * An instance of the classification metadata template, containing
 * the classification applied to the file or folder.
 * 
 * To get more details about the classification applied to an item,
 * request the classification metadata template.
**/
public class Classification {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$canEdit")
    public Boolean dollarCanEdit;
    public Classification withDollarCanEdit(Boolean dollarCanEdit) {
        this.dollarCanEdit = dollarCanEdit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$parent")
    public String dollarParent;
    public Classification withDollarParent(String dollarParent) {
        this.dollarParent = dollarParent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$scope")
    public String dollarScope;
    public Classification withDollarScope(String dollarScope) {
        this.dollarScope = dollarScope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$template")
    public ClassificationDollarTemplateEnum dollarTemplate;
    public Classification withDollarTemplate(ClassificationDollarTemplateEnum dollarTemplate) {
        this.dollarTemplate = dollarTemplate;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$type")
    public String dollarType;
    public Classification withDollarType(String dollarType) {
        this.dollarType = dollarType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$typeVersion")
    public Double dollarTypeVersion;
    public Classification withDollarTypeVersion(Double dollarTypeVersion) {
        this.dollarTypeVersion = dollarTypeVersion;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("$version")
    public Long dollarVersion;
    public Classification withDollarVersion(Long dollarVersion) {
        this.dollarVersion = dollarVersion;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Box__Security__Classification__Key")
    public String boxSecurityClassificationKey;
    public Classification withBoxSecurityClassificationKey(String boxSecurityClassificationKey) {
        this.boxSecurityClassificationKey = boxSecurityClassificationKey;
        return this;
    }
}