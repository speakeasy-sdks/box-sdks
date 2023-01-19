package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostGroupMembershipsRequestBodyGroup
 * The group to add the user to.
**/
public class PostGroupMembershipsRequestBodyGroup {
    @JsonProperty("id")
    public String id;
    public PostGroupMembershipsRequestBodyGroup withId(String id) {
        this.id = id;
        return this;
    }
}