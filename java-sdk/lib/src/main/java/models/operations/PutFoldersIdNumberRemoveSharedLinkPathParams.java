package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdNumberRemoveSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public PutFoldersIdNumberRemoveSharedLinkPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}