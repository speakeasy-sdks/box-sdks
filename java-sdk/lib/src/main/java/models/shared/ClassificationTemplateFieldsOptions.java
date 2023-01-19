package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ClassificationTemplateFieldsOptions
 * A single classification available in this enterprise.
**/
public class ClassificationTemplateFieldsOptions {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ClassificationTemplateFieldsOptions withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;
    public ClassificationTemplateFieldsOptions withKey(String key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("staticConfig")
    public ClassificationTemplateFieldsOptionsStaticConfig staticConfig;
    public ClassificationTemplateFieldsOptions withStaticConfig(ClassificationTemplateFieldsOptionsStaticConfig staticConfig) {
        this.staticConfig = staticConfig;
        return this;
    }
}