package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * DevicePinners
 * A list of device pins
**/
public class DevicePinners {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public DevicePinner[] entries;
    public DevicePinners withEntries(DevicePinner[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public DevicePinners withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public DevicePinners withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public DevicePinnersOrder[] order;
    public DevicePinners withOrder(DevicePinnersOrder[] order) {
        this.order = order;
        return this;
    }
}