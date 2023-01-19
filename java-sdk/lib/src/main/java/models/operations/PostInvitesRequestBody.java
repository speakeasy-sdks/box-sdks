package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostInvitesRequestBody {
    @JsonProperty("actionable_by")
    public PostInvitesRequestBodyActionableBy actionableBy;
    public PostInvitesRequestBody withActionableBy(PostInvitesRequestBodyActionableBy actionableBy) {
        this.actionableBy = actionableBy;
        return this;
    }
    @JsonProperty("enterprise")
    public PostInvitesRequestBodyEnterprise enterprise;
    public PostInvitesRequestBody withEnterprise(PostInvitesRequestBodyEnterprise enterprise) {
        this.enterprise = enterprise;
        return this;
    }
}