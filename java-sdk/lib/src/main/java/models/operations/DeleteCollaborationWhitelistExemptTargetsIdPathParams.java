package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteCollaborationWhitelistExemptTargetsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collaboration_whitelist_exempt_target_id")
    public String collaborationWhitelistExemptTargetId;
    public DeleteCollaborationWhitelistExemptTargetsIdPathParams withCollaborationWhitelistExemptTargetId(String collaborationWhitelistExemptTargetId) {
        this.collaborationWhitelistExemptTargetId = collaborationWhitelistExemptTargetId;
        return this;
    }
}