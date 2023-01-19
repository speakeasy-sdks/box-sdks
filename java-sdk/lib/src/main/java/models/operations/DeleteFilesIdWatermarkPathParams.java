package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesIdWatermarkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public DeleteFilesIdWatermarkPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}