package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFoldersIdRequestBodyReference
 * The bare basic reference for an object
**/
public class PutFoldersIdRequestBodyReference {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PutFoldersIdRequestBodyReference withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public PutFoldersIdRequestBodyReference withType(String type) {
        this.type = type;
        return this;
    }
}