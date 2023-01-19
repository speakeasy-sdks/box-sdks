package .models.operations;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

public class PutCollaborationsIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_view_path")
    public Boolean canViewPath;
    public PutCollaborationsIdRequestBody withCanViewPath(Boolean canViewPath) {
        this.canViewPath = canViewPath;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;
    public PutCollaborationsIdRequestBody withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    @JsonProperty("role")
    public PutCollaborationsIdRequestBodyRoleEnum role;
    public PutCollaborationsIdRequestBody withRole(PutCollaborationsIdRequestBodyRoleEnum role) {
        this.role = role;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public PutCollaborationsIdRequestBodyStatusEnum status;
    public PutCollaborationsIdRequestBody withStatus(PutCollaborationsIdRequestBodyStatusEnum status) {
        this.status = status;
        return this;
    }
}