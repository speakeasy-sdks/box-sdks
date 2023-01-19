package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetLegalHoldPoliciesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetLegalHoldPoliciesQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetLegalHoldPoliciesQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetLegalHoldPoliciesQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=policy_name")
    public String policyName;
    public GetLegalHoldPoliciesQueryParams withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
}