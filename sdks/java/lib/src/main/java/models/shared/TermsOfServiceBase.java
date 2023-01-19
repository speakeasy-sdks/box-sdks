package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * TermsOfServiceBase
 * The root-level record that is supposed to represent a
 * single Terms of Service.
**/
public class TermsOfServiceBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public TermsOfServiceBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public TermsOfServiceBaseTypeEnum type;
    public TermsOfServiceBase withType(TermsOfServiceBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}