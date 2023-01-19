package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteCollaborationsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collaboration_id")
    public String collaborationId;
    public DeleteCollaborationsIdPathParams withCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
        return this;
    }
}