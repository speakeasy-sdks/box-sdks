package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class FolderFolderUploadEmail {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public FolderFolderUploadEmailAccessEnum access;
    public FolderFolderUploadEmail withAccess(FolderFolderUploadEmailAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;
    public FolderFolderUploadEmail withEmail(String email) {
        this.email = email;
        return this;
    }
}