package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutUsersIdFolders0RequestBodyOwnedBy
 * The user who the folder will be transferred to
**/
public class PutUsersIdFolders0RequestBodyOwnedBy {
    @JsonProperty("id")
    public String id;
    public PutUsersIdFolders0RequestBodyOwnedBy withId(String id) {
        this.id = id;
        return this;
    }
}