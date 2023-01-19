package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ConflictError
 * A generic error
**/
public class ConflictError {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public ConflictErrorCodeEnum code;
    public ConflictError withCode(ConflictErrorCodeEnum code) {
        this.code = code;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("context_info")
    public ConflictErrorContextInfo contextInfo;
    public ConflictError withContextInfo(ConflictErrorContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("help_url")
    public String helpUrl;
    public ConflictError withHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public ConflictError withMessage(String message) {
        this.message = message;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("request_id")
    public String requestId;
    public ConflictError withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public Integer status;
    public ConflictError withStatus(Integer status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ConflictErrorTypeEnum type;
    public ConflictError withType(ConflictErrorTypeEnum type) {
        this.type = type;
        return this;
    }
}