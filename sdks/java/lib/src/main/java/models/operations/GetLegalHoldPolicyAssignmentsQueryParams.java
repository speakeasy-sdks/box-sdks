package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetLegalHoldPolicyAssignmentsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=assign_to_id")
    public String assignToId;
    public GetLegalHoldPolicyAssignmentsQueryParams withAssignToId(String assignToId) {
        this.assignToId = assignToId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=assign_to_type")
    public GetLegalHoldPolicyAssignmentsAssignToTypeEnum assignToType;
    public GetLegalHoldPolicyAssignmentsQueryParams withAssignToType(GetLegalHoldPolicyAssignmentsAssignToTypeEnum assignToType) {
        this.assignToType = assignToType;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetLegalHoldPolicyAssignmentsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetLegalHoldPolicyAssignmentsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetLegalHoldPolicyAssignmentsQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=policy_id")
    public String policyId;
    public GetLegalHoldPolicyAssignmentsQueryParams withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
}