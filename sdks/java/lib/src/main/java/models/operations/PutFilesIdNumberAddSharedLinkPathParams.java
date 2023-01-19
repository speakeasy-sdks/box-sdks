package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberAddSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PutFilesIdNumberAddSharedLinkPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}