package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * UploadSession
 * An upload session for chunk uploading a file.
**/
public class UploadSession {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public UploadSession withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("num_parts_processed")
    public Integer numPartsProcessed;
    public UploadSession withNumPartsProcessed(Integer numPartsProcessed) {
        this.numPartsProcessed = numPartsProcessed;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("part_size")
    public Long partSize;
    public UploadSession withPartSize(Long partSize) {
        this.partSize = partSize;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("session_endpoints")
    public UploadSessionSessionEndpoints sessionEndpoints;
    public UploadSession withSessionEndpoints(UploadSessionSessionEndpoints sessionEndpoints) {
        this.sessionEndpoints = sessionEndpoints;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("session_expires_at")
    public OffsetDateTime sessionExpiresAt;
    public UploadSession withSessionExpiresAt(OffsetDateTime sessionExpiresAt) {
        this.sessionExpiresAt = sessionExpiresAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_parts")
    public Integer totalParts;
    public UploadSession withTotalParts(Integer totalParts) {
        this.totalParts = totalParts;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public UploadSessionTypeEnum type;
    public UploadSession withType(UploadSessionTypeEnum type) {
        this.type = type;
        return this;
    }
}