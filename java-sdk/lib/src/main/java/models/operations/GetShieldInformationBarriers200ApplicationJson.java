package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class GetShieldInformationBarriers200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public .models.shared.ShieldInformationBarrier[] entries;
    public GetShieldInformationBarriers200ApplicationJson withEntries(.models.shared.ShieldInformationBarrier[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public GetShieldInformationBarriers200ApplicationJson withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public String nextMarker;
    public GetShieldInformationBarriers200ApplicationJson withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}