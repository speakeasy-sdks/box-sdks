package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdContentPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PostFilesIdContentPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}