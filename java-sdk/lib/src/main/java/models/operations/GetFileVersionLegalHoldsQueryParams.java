package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFileVersionLegalHoldsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetFileVersionLegalHoldsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetFileVersionLegalHoldsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=policy_id")
    public String policyId;
    public GetFileVersionLegalHoldsQueryParams withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
}