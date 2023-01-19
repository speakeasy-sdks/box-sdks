package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberRemoveSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PutFilesIdNumberRemoveSharedLinkPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}