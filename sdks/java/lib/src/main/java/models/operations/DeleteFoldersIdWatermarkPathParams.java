package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFoldersIdWatermarkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=folder_id")
    public String folderId;
    public DeleteFoldersIdWatermarkPathParams withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}