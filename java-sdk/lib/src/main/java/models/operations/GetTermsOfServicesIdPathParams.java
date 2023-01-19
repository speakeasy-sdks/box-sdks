package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetTermsOfServicesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=terms_of_service_id")
    public String termsOfServiceId;
    public GetTermsOfServicesIdPathParams withTermsOfServiceId(String termsOfServiceId) {
        this.termsOfServiceId = termsOfServiceId;
        return this;
    }
}