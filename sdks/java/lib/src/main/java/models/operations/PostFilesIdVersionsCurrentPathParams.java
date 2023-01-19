package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdVersionsCurrentPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PostFilesIdVersionsCurrentPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}