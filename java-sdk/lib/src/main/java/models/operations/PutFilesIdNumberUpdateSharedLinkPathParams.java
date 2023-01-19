package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesIdNumberUpdateSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public PutFilesIdNumberUpdateSharedLinkPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}