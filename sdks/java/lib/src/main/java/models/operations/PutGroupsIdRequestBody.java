package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PutGroupsIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PutGroupsIdRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_sync_identifier")
    public String externalSyncIdentifier;
    public PutGroupsIdRequestBody withExternalSyncIdentifier(String externalSyncIdentifier) {
        this.externalSyncIdentifier = externalSyncIdentifier;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invitability_level")
    public PutGroupsIdRequestBodyInvitabilityLevelEnum invitabilityLevel;
    public PutGroupsIdRequestBody withInvitabilityLevel(PutGroupsIdRequestBodyInvitabilityLevelEnum invitabilityLevel) {
        this.invitabilityLevel = invitabilityLevel;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("member_viewability_level")
    public PutGroupsIdRequestBodyMemberViewabilityLevelEnum memberViewabilityLevel;
    public PutGroupsIdRequestBody withMemberViewabilityLevel(PutGroupsIdRequestBodyMemberViewabilityLevelEnum memberViewabilityLevel) {
        this.memberViewabilityLevel = memberViewabilityLevel;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PutGroupsIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provenance")
    public String provenance;
    public PutGroupsIdRequestBody withProvenance(String provenance) {
        this.provenance = provenance;
        return this;
    }
}