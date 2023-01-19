package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class GetShieldInformationBarrierSegmentMembers200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public .models.shared.ShieldInformationBarrierSegmentMember[] entries;
    public GetShieldInformationBarrierSegmentMembers200ApplicationJson withEntries(.models.shared.ShieldInformationBarrierSegmentMember[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public GetShieldInformationBarrierSegmentMembers200ApplicationJson withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public String nextMarker;
    public GetShieldInformationBarrierSegmentMembers200ApplicationJson withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}