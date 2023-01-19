package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesIdTrashPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public DeleteFilesIdTrashPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}