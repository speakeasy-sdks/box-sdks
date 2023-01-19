package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetTermsOfServiceUserStatusesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tos_id")
    public String tosId;
    public GetTermsOfServiceUserStatusesQueryParams withTosId(String tosId) {
        this.tosId = tosId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user_id")
    public String userId;
    public GetTermsOfServiceUserStatusesQueryParams withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}