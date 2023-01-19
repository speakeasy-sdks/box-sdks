package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdNumberGetSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public GetFoldersIdNumberGetSharedLinkPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}