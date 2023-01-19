package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdWatermarkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public GetFoldersIdWatermarkPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}