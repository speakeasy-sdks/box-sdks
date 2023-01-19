package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutFoldersIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_non_owners_invite")
    public Boolean canNonOwnersInvite;
    public PutFoldersIdRequestBody withCanNonOwnersInvite(Boolean canNonOwnersInvite) {
        this.canNonOwnersInvite = canNonOwnersInvite;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_non_owners_view_collaborators")
    public Boolean canNonOwnersViewCollaborators;
    public PutFoldersIdRequestBody withCanNonOwnersViewCollaborators(Boolean canNonOwnersViewCollaborators) {
        this.canNonOwnersViewCollaborators = canNonOwnersViewCollaborators;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("collections")
    public PutFoldersIdRequestBodyReference[] collections;
    public PutFoldersIdRequestBody withCollections(PutFoldersIdRequestBodyReference[] collections) {
        this.collections = collections;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PutFoldersIdRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("folder_upload_email")
    public PutFoldersIdRequestBodyFolderUploadEmail folderUploadEmail;
    public PutFoldersIdRequestBody withFolderUploadEmail(PutFoldersIdRequestBodyFolderUploadEmail folderUploadEmail) {
        this.folderUploadEmail = folderUploadEmail;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_collaboration_restricted_to_enterprise")
    public Boolean isCollaborationRestrictedToEnterprise;
    public PutFoldersIdRequestBody withIsCollaborationRestrictedToEnterprise(Boolean isCollaborationRestrictedToEnterprise) {
        this.isCollaborationRestrictedToEnterprise = isCollaborationRestrictedToEnterprise;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PutFoldersIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public PutFoldersIdRequestBodyParent parent;
    public PutFoldersIdRequestBody withParent(PutFoldersIdRequestBodyParent parent) {
        this.parent = parent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutFoldersIdRequestBodySharedLink sharedLink;
    public PutFoldersIdRequestBody withSharedLink(PutFoldersIdRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sync_state")
    public PutFoldersIdRequestBodySyncStateEnum syncState;
    public PutFoldersIdRequestBody withSyncState(PutFoldersIdRequestBodySyncStateEnum syncState) {
        this.syncState = syncState;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public String[] tags;
    public PutFoldersIdRequestBody withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
}