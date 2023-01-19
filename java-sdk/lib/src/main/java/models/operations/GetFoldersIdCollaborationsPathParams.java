package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdCollaborationsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public GetFoldersIdCollaborationsPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}