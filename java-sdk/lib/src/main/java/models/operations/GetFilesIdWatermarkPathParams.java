package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdWatermarkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdWatermarkPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}