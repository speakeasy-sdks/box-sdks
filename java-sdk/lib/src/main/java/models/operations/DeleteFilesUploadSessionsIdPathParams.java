package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesUploadSessionsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=upload_session_id")
    public String uploadSessionId;
    public DeleteFilesUploadSessionsIdPathParams withUploadSessionId(String uploadSessionId) {
        this.uploadSessionId = uploadSessionId;
        return this;
    }
}