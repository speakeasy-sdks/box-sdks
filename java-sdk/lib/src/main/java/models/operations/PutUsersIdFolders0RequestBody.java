package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutUsersIdFolders0RequestBody {
    @JsonProperty("owned_by")
    public PutUsersIdFolders0RequestBodyOwnedBy ownedBy;
    public PutUsersIdFolders0RequestBody withOwnedBy(PutUsersIdFolders0RequestBodyOwnedBy ownedBy) {
        this.ownedBy = ownedBy;
        return this;
    }
}