package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UploadSessionSessionEndpoints
 * A list of endpoints for a chunked upload session.
**/
public class UploadSessionSessionEndpoints {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("abort")
    public String abort;
    public UploadSessionSessionEndpoints withAbort(String abort) {
        this.abort = abort;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("commit")
    public String commit;
    public UploadSessionSessionEndpoints withCommit(String commit) {
        this.commit = commit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_parts")
    public String listParts;
    public UploadSessionSessionEndpoints withListParts(String listParts) {
        this.listParts = listParts;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("log_event")
    public String logEvent;
    public UploadSessionSessionEndpoints withLogEvent(String logEvent) {
        this.logEvent = logEvent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public String status;
    public UploadSessionSessionEndpoints withStatus(String status) {
        this.status = status;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("upload_part")
    public String uploadPart;
    public UploadSessionSessionEndpoints withUploadPart(String uploadPart) {
        this.uploadPart = uploadPart;
        return this;
    }
}