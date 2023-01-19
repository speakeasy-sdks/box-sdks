package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdVersionsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdVersionsPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}