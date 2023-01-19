package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetTermsOfServicesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tos_type")
    public GetTermsOfServicesTosTypeEnum tosType;
    public GetTermsOfServicesQueryParams withTosType(GetTermsOfServicesTosTypeEnum tosType) {
        this.tosType = tosType;
        return this;
    }
}