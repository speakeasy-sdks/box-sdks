package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutCollaborationsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collaboration_id")
    public String collaborationId;
    public PutCollaborationsIdPathParams withCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
        return this;
    }
}