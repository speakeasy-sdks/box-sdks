package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberAddSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public PutFoldersIdNumberAddSharedLinkPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}