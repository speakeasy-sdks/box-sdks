package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataTemplate
 * A template for metadata that can be applied to files and folders
**/
public class MetadataTemplate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("copyInstanceOnItemCopy")
    public Boolean copyInstanceOnItemCopy;
    public MetadataTemplate withCopyInstanceOnItemCopy(Boolean copyInstanceOnItemCopy) {
        this.copyInstanceOnItemCopy = copyInstanceOnItemCopy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayName")
    public String displayName;
    public MetadataTemplate withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    public MetadataTemplateMetadataFieldWrite[] fields;
    public MetadataTemplate withFields(MetadataTemplateMetadataFieldWrite[] fields) {
        this.fields = fields;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public MetadataTemplate withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MetadataTemplate withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    public String scope;
    public MetadataTemplate withScope(String scope) {
        this.scope = scope;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("templateKey")
    public String templateKey;
    public MetadataTemplate withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }
    @JsonProperty("type")
    public MetadataTemplateTypeEnum type;
    public MetadataTemplate withType(MetadataTemplateTypeEnum type) {
        this.type = type;
        return this;
    }
}