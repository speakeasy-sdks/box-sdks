package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetStoragePoliciesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=storage_policy_id")
    public String storagePolicyId;
    public GetStoragePoliciesIdPathParams withStoragePolicyId(String storagePolicyId) {
        this.storagePolicyId = storagePolicyId;
        return this;
    }
}