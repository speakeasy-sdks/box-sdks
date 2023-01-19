package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostSignRequestsIdCancelPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sign_request_id")
    public String signRequestId;
    public PostSignRequestsIdCancelPathParams withSignRequestId(String signRequestId) {
        this.signRequestId = signRequestId;
        return this;
    }
}