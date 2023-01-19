package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdContentPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdContentPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}