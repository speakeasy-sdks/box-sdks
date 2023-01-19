package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * RealtimeServer
 * A real-time server that can be used for
 * long polling user events
**/
public class RealtimeServer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_retries")
    public Long maxRetries;
    public RealtimeServer withMaxRetries(Long maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("retry_timeout")
    public Long retryTimeout;
    public RealtimeServer withRetryTimeout(Long retryTimeout) {
        this.retryTimeout = retryTimeout;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ttl")
    public Long ttl;
    public RealtimeServer withTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;
    public RealtimeServer withType(String type) {
        this.type = type;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;
    public RealtimeServer withUrl(String url) {
        this.url = url;
        return this;
    }
}