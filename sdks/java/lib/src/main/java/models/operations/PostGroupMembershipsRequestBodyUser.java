package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostGroupMembershipsRequestBodyUser
 * The user to add to the group.
**/
public class PostGroupMembershipsRequestBodyUser {
    @JsonProperty("id")
    public String id;
    public PostGroupMembershipsRequestBodyUser withId(String id) {
        this.id = id;
        return this;
    }
}