package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataTemplateMetadataFieldWrite
 * A field within a metadata template. Fields can be a basic text, date, or
 * number field, or a list of options.
**/
public class MetadataTemplateMetadataFieldWrite {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public MetadataTemplateMetadataFieldWrite withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonProperty("displayName")
    public String displayName;
    public MetadataTemplateMetadataFieldWrite withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public MetadataTemplateMetadataFieldWrite withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MetadataTemplateMetadataFieldWrite withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("key")
    public String key;
    public MetadataTemplateMetadataFieldWrite withKey(String key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public MetadataTemplateMetadataFieldWriteMetadataOptionWrite[] options;
    public MetadataTemplateMetadataFieldWrite withOptions(MetadataTemplateMetadataFieldWriteMetadataOptionWrite[] options) {
        this.options = options;
        return this;
    }
    @JsonProperty("type")
    public MetadataTemplateMetadataFieldWriteTypeEnum type;
    public MetadataTemplateMetadataFieldWrite withType(MetadataTemplateMetadataFieldWriteTypeEnum type) {
        this.type = type;
        return this;
    }
}