package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdWatermarkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public PutFoldersIdWatermarkPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}