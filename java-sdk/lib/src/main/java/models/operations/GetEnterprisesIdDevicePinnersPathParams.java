package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetEnterprisesIdDevicePinnersPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=enterprise_id")
    public String enterpriseId;
    public GetEnterprisesIdDevicePinnersPathParams withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
}