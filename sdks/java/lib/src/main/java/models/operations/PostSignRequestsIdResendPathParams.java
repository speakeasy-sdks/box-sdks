package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostSignRequestsIdResendPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sign_request_id")
    public String signRequestId;
    public PostSignRequestsIdResendPathParams withSignRequestId(String signRequestId) {
        this.signRequestId = signRequestId;
        return this;
    }
}