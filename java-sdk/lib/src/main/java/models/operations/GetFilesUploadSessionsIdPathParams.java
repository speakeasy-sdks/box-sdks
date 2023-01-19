package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesUploadSessionsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=upload_session_id")
    public String uploadSessionId;
    public GetFilesUploadSessionsIdPathParams withUploadSessionId(String uploadSessionId) {
        this.uploadSessionId = uploadSessionId;
        return this;
    }
}