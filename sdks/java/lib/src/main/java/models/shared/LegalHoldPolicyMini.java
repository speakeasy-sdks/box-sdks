package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * LegalHoldPolicyMini
 * A mini legal hold policy
**/
public class LegalHoldPolicyMini {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public LegalHoldPolicyMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public LegalHoldPolicyMiniTypeEnum type;
    public LegalHoldPolicyMini withType(LegalHoldPolicyMiniTypeEnum type) {
        this.type = type;
        return this;
    }
}