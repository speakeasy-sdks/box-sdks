package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostTermsOfServiceUserStatusesRequestBodyUser
 * The user to set the status for.
**/
public class PostTermsOfServiceUserStatusesRequestBodyUser {
    @JsonProperty("id")
    public String id;
    public PostTermsOfServiceUserStatusesRequestBodyUser withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum type;
    public PostTermsOfServiceUserStatusesRequestBodyUser withType(PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum type) {
        this.type = type;
        return this;
    }
}