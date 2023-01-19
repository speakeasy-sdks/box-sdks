package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Webhooks
 * The part of an API response that describes marker
 * based pagination
**/
public class Webhooks {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entries")
    public WebhookMini[] entries;
    public Webhooks withEntries(WebhookMini[] entries) {
        this.entries = entries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;
    public Webhooks withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_marker")
    public Long nextMarker;
    public Webhooks withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prev_marker")
    public Long prevMarker;
    public Webhooks withPrevMarker(Long prevMarker) {
        this.prevMarker = prevMarker;
        return this;
    }
}