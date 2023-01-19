package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TermsOfServiceEnterprise
 * A representation of a Box enterprise
**/
public class TermsOfServiceEnterprise {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TermsOfServiceEnterprise withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public TermsOfServiceEnterprise withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TermsOfServiceEnterpriseTypeEnum type;
    public TermsOfServiceEnterprise withType(TermsOfServiceEnterpriseTypeEnum type) {
        this.type = type;
        return this;
    }
}