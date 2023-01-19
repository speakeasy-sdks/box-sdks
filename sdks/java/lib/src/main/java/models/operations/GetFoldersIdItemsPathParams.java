package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdItemsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public GetFoldersIdItemsPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}