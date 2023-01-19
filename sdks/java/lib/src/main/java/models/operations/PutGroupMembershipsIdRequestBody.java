package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutGroupMembershipsIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("configurable_permissions")
    public java.util.Map<String, Boolean> configurablePermissions;
    public PutGroupMembershipsIdRequestBody withConfigurablePermissions(java.util.Map<String, Boolean> configurablePermissions) {
        this.configurablePermissions = configurablePermissions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public PutGroupMembershipsIdRequestBodyRoleEnum role;
    public PutGroupMembershipsIdRequestBody withRole(PutGroupMembershipsIdRequestBodyRoleEnum role) {
        this.role = role;
        return this;
    }
}