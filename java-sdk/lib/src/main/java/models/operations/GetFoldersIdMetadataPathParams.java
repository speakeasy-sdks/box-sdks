package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdMetadataPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public GetFoldersIdMetadataPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}