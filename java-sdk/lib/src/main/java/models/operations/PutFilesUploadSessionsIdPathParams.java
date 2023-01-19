package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesUploadSessionsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=upload_session_id")
    public String uploadSessionId;
    public PutFilesUploadSessionsIdPathParams withUploadSessionId(String uploadSessionId) {
        this.uploadSessionId = uploadSessionId;
        return this;
    }
}