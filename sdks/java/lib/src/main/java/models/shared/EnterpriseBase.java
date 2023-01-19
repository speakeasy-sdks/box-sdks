package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * EnterpriseBase
 * A mini representation of a enterprise, used when
 * nested within another resource.
**/
public class EnterpriseBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public EnterpriseBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public EnterpriseBaseTypeEnum type;
    public EnterpriseBase withType(EnterpriseBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}