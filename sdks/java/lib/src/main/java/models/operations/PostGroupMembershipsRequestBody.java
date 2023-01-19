package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostGroupMembershipsRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("configurable_permissions")
    public java.util.Map<String, Boolean> configurablePermissions;
    public PostGroupMembershipsRequestBody withConfigurablePermissions(java.util.Map<String, Boolean> configurablePermissions) {
        this.configurablePermissions = configurablePermissions;
        return this;
    }
    @JsonProperty("group")
    public PostGroupMembershipsRequestBodyGroup group;
    public PostGroupMembershipsRequestBody withGroup(PostGroupMembershipsRequestBodyGroup group) {
        this.group = group;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public PostGroupMembershipsRequestBodyRoleEnum role;
    public PostGroupMembershipsRequestBody withRole(PostGroupMembershipsRequestBodyRoleEnum role) {
        this.role = role;
        return this;
    }
    @JsonProperty("user")
    public PostGroupMembershipsRequestBodyUser user;
    public PostGroupMembershipsRequestBody withUser(PostGroupMembershipsRequestBodyUser user) {
        this.user = user;
        return this;
    }
}