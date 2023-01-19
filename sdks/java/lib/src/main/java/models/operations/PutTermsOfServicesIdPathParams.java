package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutTermsOfServicesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=terms_of_service_id")
    public String termsOfServiceId;
    public PutTermsOfServicesIdPathParams withTermsOfServiceId(String termsOfServiceId) {
        this.termsOfServiceId = termsOfServiceId;
        return this;
    }
}