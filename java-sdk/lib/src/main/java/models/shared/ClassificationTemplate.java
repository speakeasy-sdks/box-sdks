package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ClassificationTemplate
 * A metadata template that holds the security classifications
 * defined by an enterprise.
**/
public class ClassificationTemplate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("copyInstanceOnItemCopy")
    public Boolean copyInstanceOnItemCopy;
    public ClassificationTemplate withCopyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
        this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    public ClassificationTemplateDisplayNameEnum displayName;
    public ClassificationTemplate withDisplayName(ClassificationTemplateDisplayNameEnum displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public ClassificationTemplateFields[] fields;
    public ClassificationTemplate withFields(ClassificationTemplateFields[] fields) {
        this.fields = fields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public ClassificationTemplate withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ClassificationTemplate withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    public String scope;
    public ClassificationTemplate withScope(String scope) {
        this.scope = scope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("templateKey")
    public ClassificationTemplateTemplateKeyEnum templateKey;
    public ClassificationTemplate withTemplateKey(ClassificationTemplateTemplateKeyEnum templateKey) {
        this.templateKey = templateKey;
        return this;
    }
    @JsonProperty("type")
    public ClassificationTemplateTypeEnum type;
    public ClassificationTemplate withType(ClassificationTemplateTypeEnum type) {
        this.type = type;
        return this;
    }
}