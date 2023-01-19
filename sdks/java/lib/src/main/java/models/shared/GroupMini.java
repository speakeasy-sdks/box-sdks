package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * GroupMini
 * A base representation of a group.
**/
public class GroupMini {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group_type")
    public GroupMiniGroupTypeEnum groupType;
    public GroupMini withGroupType(GroupMiniGroupTypeEnum groupType) {
        this.groupType = groupType;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public GroupMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public GroupMini withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public GroupMiniTypeEnum type;
    public GroupMini withType(GroupMiniTypeEnum type) {
        this.type = type;
        return this;
    }
}