package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdVersionsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PutFilesIdVersionsIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_version_id")
    public String fileVersionId;
    public PutFilesIdVersionsIdPathParams withFileVersionId(String fileVersionId) {
        this.fileVersionId = fileVersionId;
        return this;
    }
}