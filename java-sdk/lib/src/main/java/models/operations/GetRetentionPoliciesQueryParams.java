package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetRetentionPoliciesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=created_by_user_id")
    public String createdByUserId;
    public GetRetentionPoliciesQueryParams withCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetRetentionPoliciesQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetRetentionPoliciesQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetRetentionPoliciesQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=policy_name")
    public String policyName;
    public GetRetentionPoliciesQueryParams withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=policy_type")
    public GetRetentionPoliciesPolicyTypeEnum policyType;
    public GetRetentionPoliciesQueryParams withPolicyType(GetRetentionPoliciesPolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }
}