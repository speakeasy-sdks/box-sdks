package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetDevicePinnersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=device_pinner_id")
    public String devicePinnerId;
    public GetDevicePinnersIdPathParams withDevicePinnerId(String devicePinnerId) {
        this.devicePinnerId = devicePinnerId;
        return this;
    }
}