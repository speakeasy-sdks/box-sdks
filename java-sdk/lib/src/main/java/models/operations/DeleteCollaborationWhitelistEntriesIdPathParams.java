package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteCollaborationWhitelistEntriesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collaboration_whitelist_entry_id")
    public String collaborationWhitelistEntryId;
    public DeleteCollaborationWhitelistEntriesIdPathParams withCollaborationWhitelistEntryId(String collaborationWhitelistEntryId) {
        this.collaborationWhitelistEntryId = collaborationWhitelistEntryId;
        return this;
    }
}