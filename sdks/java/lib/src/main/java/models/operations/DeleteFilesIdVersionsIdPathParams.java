package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesIdVersionsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public DeleteFilesIdVersionsIdPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_version_id")
    public String fileVersionId;
    public DeleteFilesIdVersionsIdPathParams withFileVersionId(String fileVersionId) {
        this.fileVersionId = fileVersionId;
        return this;
    }
}