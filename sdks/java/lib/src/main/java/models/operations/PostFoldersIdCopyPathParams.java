package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFoldersIdCopyPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public PostFoldersIdCopyPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}