package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetCollaborationWhitelistEntriesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collaboration_whitelist_entry_id")
    public String collaborationWhitelistEntryId;
    public GetCollaborationWhitelistEntriesIdPathParams withCollaborationWhitelistEntryId(String collaborationWhitelistEntryId) {
        this.collaborationWhitelistEntryId = collaborationWhitelistEntryId;
        return this;
    }
}