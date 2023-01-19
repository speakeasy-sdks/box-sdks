package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetSignRequestsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sign_request_id")
    public String signRequestId;
    public GetSignRequestsIdPathParams withSignRequestId(String signRequestId) {
        this.signRequestId = signRequestId;
        return this;
    }
}