package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ClassificationTemplateFields
 * The metadata template field that represents the available
 * classifications.
**/
public class ClassificationTemplateFields {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    public ClassificationTemplateFieldsDisplayNameEnum displayName;
    public ClassificationTemplateFields withDisplayName(ClassificationTemplateFieldsDisplayNameEnum displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public ClassificationTemplateFields withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ClassificationTemplateFields withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public ClassificationTemplateFieldsKeyEnum key;
    public ClassificationTemplateFields withKey(ClassificationTemplateFieldsKeyEnum key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public ClassificationTemplateFieldsOptions[] options;
    public ClassificationTemplateFields withOptions(ClassificationTemplateFieldsOptions[] options) {
        this.options = options;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ClassificationTemplateFieldsTypeEnum type;
    public ClassificationTemplateFields withType(ClassificationTemplateFieldsTypeEnum type) {
        this.type = type;
        return this;
    }
}