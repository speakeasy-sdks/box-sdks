package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteDevicePinnersIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=device_pinner_id")
    public String devicePinnerId;
    public DeleteDevicePinnersIdPathParams withDevicePinnerId(String devicePinnerId) {
        this.devicePinnerId = devicePinnerId;
        return this;
    }
}