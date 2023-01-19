package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PutFilesIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}