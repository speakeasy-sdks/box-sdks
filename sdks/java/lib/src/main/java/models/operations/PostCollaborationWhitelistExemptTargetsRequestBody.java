package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostCollaborationWhitelistExemptTargetsRequestBody {
    @JsonProperty("user")
    public PostCollaborationWhitelistExemptTargetsRequestBodyUser user;
    public PostCollaborationWhitelistExemptTargetsRequestBody withUser(PostCollaborationWhitelistExemptTargetsRequestBodyUser user) {
        this.user = user;
        return this;
    }
}