package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * UserBase
 * A mini representation of a user, used when
 * nested within another resource.
**/
public class UserBase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public UserBase withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public UserBaseTypeEnum type;
    public UserBase withType(UserBaseTypeEnum type) {
        this.type = type;
        return this;
    }
}