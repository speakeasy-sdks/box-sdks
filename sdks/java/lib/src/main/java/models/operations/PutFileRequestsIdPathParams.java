package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFileRequestsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_request_id")
    public String fileRequestId;
    public PutFileRequestsIdPathParams withFileRequestId(String fileRequestId) {
        this.fileRequestId = fileRequestId;
        return this;
    }
}