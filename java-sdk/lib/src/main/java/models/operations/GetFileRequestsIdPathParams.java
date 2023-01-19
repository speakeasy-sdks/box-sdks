package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFileRequestsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_request_id")
    public String fileRequestId;
    public GetFileRequestsIdPathParams withFileRequestId(String fileRequestId) {
        this.fileRequestId = fileRequestId;
        return this;
    }
}