package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFileRequestsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=file_request_id")
    public String fileRequestId;
    public DeleteFileRequestsIdPathParams withFileRequestId(String fileRequestId) {
        this.fileRequestId = fileRequestId;
        return this;
    }
}