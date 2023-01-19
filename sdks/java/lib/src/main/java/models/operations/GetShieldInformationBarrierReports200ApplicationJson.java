package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class GetShieldInformationBarrierReports200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public .models.shared.ShieldInformationBarrierReport[] entries;
    public GetShieldInformationBarrierReports200ApplicationJson withEntries(.models.shared.ShieldInformationBarrierReport[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public GetShieldInformationBarrierReports200ApplicationJson withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public String nextMarker;
    public GetShieldInformationBarrierReports200ApplicationJson withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}