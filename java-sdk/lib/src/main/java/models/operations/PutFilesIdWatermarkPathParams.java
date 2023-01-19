package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdWatermarkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PutFilesIdWatermarkPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}