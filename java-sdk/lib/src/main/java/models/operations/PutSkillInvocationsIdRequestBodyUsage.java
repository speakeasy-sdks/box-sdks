package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutSkillInvocationsIdRequestBodyUsage
 * A descriptor that defines what items are affected by this call.
 * 
 * Set this to the default values when setting a card to a `success`
 * state, and leave it out in most other situations.
**/
public class PutSkillInvocationsIdRequestBodyUsage {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit")
    public String unit;
    public PutSkillInvocationsIdRequestBodyUsage withUnit(String unit) {
        this.unit = unit;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public Double value;
    public PutSkillInvocationsIdRequestBodyUsage withValue(Double value) {
        this.value = value;
        return this;
    }
}