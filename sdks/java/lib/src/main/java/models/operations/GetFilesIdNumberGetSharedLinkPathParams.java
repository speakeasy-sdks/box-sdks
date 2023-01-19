package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesIdNumberGetSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_id")
    public String fileId;
    public GetFilesIdNumberGetSharedLinkPathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
}