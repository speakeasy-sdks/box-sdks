package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdUploadSessionsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PostFilesIdUploadSessionsPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}