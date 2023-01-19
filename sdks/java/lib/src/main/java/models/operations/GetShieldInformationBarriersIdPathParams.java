package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetShieldInformationBarriersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shield_information_barrier_id")
    public String shieldInformationBarrierId;
    public GetShieldInformationBarriersIdPathParams withShieldInformationBarrierId(String shieldInformationBarrierId) {
        this.shieldInformationBarrierId = shieldInformationBarrierId;
        return this;
    }
}