package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdTasksPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdTasksPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}