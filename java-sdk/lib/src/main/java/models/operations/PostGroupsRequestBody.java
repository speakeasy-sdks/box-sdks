package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostGroupsRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PostGroupsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_sync_identifier")
    public String externalSyncIdentifier;
    public PostGroupsRequestBody withExternalSyncIdentifier(String externalSyncIdentifier) {
        this.externalSyncIdentifier = externalSyncIdentifier;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invitability_level")
    public PostGroupsRequestBodyInvitabilityLevelEnum invitabilityLevel;
    public PostGroupsRequestBody withInvitabilityLevel(PostGroupsRequestBodyInvitabilityLevelEnum invitabilityLevel) {
        this.invitabilityLevel = invitabilityLevel;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("member_viewability_level")
    public PostGroupsRequestBodyMemberViewabilityLevelEnum memberViewabilityLevel;
    public PostGroupsRequestBody withMemberViewabilityLevel(PostGroupsRequestBodyMemberViewabilityLevelEnum memberViewabilityLevel) {
        this.memberViewabilityLevel = memberViewabilityLevel;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public PostGroupsRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provenance")
    public String provenance;
    public PostGroupsRequestBody withProvenance(String provenance) {
        this.provenance = provenance;
        return this;
    }
}