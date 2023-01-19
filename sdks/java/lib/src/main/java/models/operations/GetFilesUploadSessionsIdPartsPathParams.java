package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFilesUploadSessionsIdPartsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=upload_session_id")
    public String uploadSessionId;
    public GetFilesUploadSessionsIdPartsPathParams withUploadSessionId(String uploadSessionId) {
        this.uploadSessionId = uploadSessionId;
        return this;
    }
}