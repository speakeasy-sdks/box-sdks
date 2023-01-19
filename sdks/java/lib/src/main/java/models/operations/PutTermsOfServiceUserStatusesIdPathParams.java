package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutTermsOfServiceUserStatusesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=terms_of_service_user_status_id")
    public String termsOfServiceUserStatusId;
    public PutTermsOfServiceUserStatusesIdPathParams withTermsOfServiceUserStatusId(String termsOfServiceUserStatusId) {
        this.termsOfServiceUserStatusId = termsOfServiceUserStatusId;
        return this;
    }
}