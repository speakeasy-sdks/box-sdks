package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MetadataTemplateMetadataFieldWriteMetadataOptionWrite
 * An option for a Metadata Template Field.
 * 
 * Options only need to be provided for fields of type `enum` and `multiSelect`.
 * Options represent the value(s) a user can select for the field either through
 * the UI or through the API.
**/
public class MetadataTemplateMetadataFieldWriteMetadataOptionWrite {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MetadataTemplateMetadataFieldWriteMetadataOptionWrite withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("key")
    public String key;
    public MetadataTemplateMetadataFieldWriteMetadataOptionWrite withKey(String key) {
        this.key = key;
        return this;
    }
}