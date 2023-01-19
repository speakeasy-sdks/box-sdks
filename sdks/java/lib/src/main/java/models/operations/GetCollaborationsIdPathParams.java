package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetCollaborationsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collaboration_id")
    public String collaborationId;
    public GetCollaborationsIdPathParams withCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
        return this;
    }
}