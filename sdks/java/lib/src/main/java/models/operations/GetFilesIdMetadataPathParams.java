package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdMetadataPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdMetadataPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}