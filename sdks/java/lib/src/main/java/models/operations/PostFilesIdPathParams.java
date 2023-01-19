package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PostFilesIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}