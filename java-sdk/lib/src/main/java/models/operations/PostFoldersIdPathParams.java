package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public PostFoldersIdPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}