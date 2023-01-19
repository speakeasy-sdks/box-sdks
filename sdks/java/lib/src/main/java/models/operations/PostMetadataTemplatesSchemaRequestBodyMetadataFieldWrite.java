package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite
 * A field within a metadata template. Fields can be a basic text, date, or
 * number field, or a list of options.
**/
public class PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonProperty("displayName")
    public String displayName;
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Boolean hidden;
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    @JsonProperty("key")
    public String key;
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite withKey(String key) {
        this.key = key;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite[] options;
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite withOptions(PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite[] options) {
        this.options = options;
        return this;
    }
    @JsonProperty("type")
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum type;
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite withType(PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum type) {
        this.type = type;
        return this;
    }
}