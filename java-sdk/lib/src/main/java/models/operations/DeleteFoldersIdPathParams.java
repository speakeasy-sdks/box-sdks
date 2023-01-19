package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFoldersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public DeleteFoldersIdPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}