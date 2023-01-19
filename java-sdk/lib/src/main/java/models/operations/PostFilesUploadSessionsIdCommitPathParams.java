package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesUploadSessionsIdCommitPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=upload_session_id")
    public String uploadSessionId;
    public PostFilesUploadSessionsIdCommitPathParams withUploadSessionId(String uploadSessionId) {
        this.uploadSessionId = uploadSessionId;
        return this;
    }
}