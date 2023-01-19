package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}