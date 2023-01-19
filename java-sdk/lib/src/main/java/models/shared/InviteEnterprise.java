package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * InviteEnterprise
 * A representation of a Box enterprise
**/
public class InviteEnterprise {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public InviteEnterprise withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public InviteEnterprise withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public InviteEnterpriseTypeEnum type;
    public InviteEnterprise withType(InviteEnterpriseTypeEnum type) {
        this.type = type;
        return this;
    }
}