package .models.operations;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

public class PostCollaborationsRequestBody {
    @JsonProperty("accessible_by")
    public PostCollaborationsRequestBodyAccessibleBy accessibleBy;
    public PostCollaborationsRequestBody withAccessibleBy(PostCollaborationsRequestBodyAccessibleBy accessibleBy) {
        this.accessibleBy = accessibleBy;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("can_view_path")
    public Boolean canViewPath;
    public PostCollaborationsRequestBody withCanViewPath(Boolean canViewPath) {
        this.canViewPath = canViewPath;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;
    public PostCollaborationsRequestBody withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    @JsonProperty("item")
    public PostCollaborationsRequestBodyItem item;
    public PostCollaborationsRequestBody withItem(PostCollaborationsRequestBodyItem item) {
        this.item = item;
        return this;
    }
    @JsonProperty("role")
    public PostCollaborationsRequestBodyRoleEnum role;
    public PostCollaborationsRequestBody withRole(PostCollaborationsRequestBodyRoleEnum role) {
        this.role = role;
        return this;
    }
}