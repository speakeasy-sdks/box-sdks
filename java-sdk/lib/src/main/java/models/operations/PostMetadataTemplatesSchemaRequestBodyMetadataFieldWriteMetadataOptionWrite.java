package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite
 * An option for a Metadata Template Field.
 * 
 * Options only need to be provided for fields of type `enum` and `multiSelect`.
 * Options represent the value(s) a user can select for the field either through
 * the UI or through the API.
**/
public class PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite {
    @JsonProperty("key")
    public String key;
    public PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite withKey(String key) {
        this.key = key;
        return this;
    }
}