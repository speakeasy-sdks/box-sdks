package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFoldersIdRequestBodyParent
 * The parent folder for this folder. Use this to move
 * the folder or to restore it out of the trash.
**/
public class PutFoldersIdRequestBodyParent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PutFoldersIdRequestBodyParent withId(String id) {
        this.id = id;
        return this;
    }
}