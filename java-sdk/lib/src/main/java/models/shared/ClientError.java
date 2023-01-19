package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ClientError
 * A generic error
**/
public class ClientError {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public ClientErrorCodeEnum code;
    public ClientError withCode(ClientErrorCodeEnum code) {
        this.code = code;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("context_info")
    public ClientErrorContextInfo contextInfo;
    public ClientError withContextInfo(ClientErrorContextInfo contextInfo) {
        this.contextInfo = contextInfo;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("help_url")
    public String helpUrl;
    public ClientError withHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;
    public ClientError withMessage(String message) {
        this.message = message;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("request_id")
    public String requestId;
    public ClientError withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public Integer status;
    public ClientError withStatus(Integer status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ClientErrorTypeEnum type;
    public ClientError withType(ClientErrorTypeEnum type) {
        this.type = type;
        return this;
    }
}