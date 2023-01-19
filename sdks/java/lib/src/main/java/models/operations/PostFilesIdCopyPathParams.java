package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdCopyPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PostFilesIdCopyPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}