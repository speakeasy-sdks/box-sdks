package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public DeleteFilesIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}