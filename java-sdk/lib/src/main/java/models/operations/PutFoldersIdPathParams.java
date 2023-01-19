package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public PutFoldersIdPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}