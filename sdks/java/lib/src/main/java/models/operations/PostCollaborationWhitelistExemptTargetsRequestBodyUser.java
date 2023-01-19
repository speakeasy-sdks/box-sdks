package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostCollaborationWhitelistExemptTargetsRequestBodyUser
 * The user to exempt.
**/
public class PostCollaborationWhitelistExemptTargetsRequestBodyUser {
    @JsonProperty("id")
    public String id;
    public PostCollaborationWhitelistExemptTargetsRequestBodyUser withId(String id) {
        this.id = id;
        return this;
    }
}