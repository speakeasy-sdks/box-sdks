package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFileRequestsIdCopyPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_request_id")
    public String fileRequestId;
    public PostFileRequestsIdCopyPathParams withFileRequestId(String fileRequestId) {
        this.fileRequestId = fileRequestId;
        return this;
    }
}