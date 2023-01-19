package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberUpdateSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public PutFoldersIdNumberUpdateSharedLinkPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}