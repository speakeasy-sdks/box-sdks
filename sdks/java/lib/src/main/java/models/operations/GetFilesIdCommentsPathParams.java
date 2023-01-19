package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdCommentsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdCommentsPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}