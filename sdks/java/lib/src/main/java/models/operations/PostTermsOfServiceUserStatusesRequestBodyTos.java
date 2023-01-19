package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostTermsOfServiceUserStatusesRequestBodyTos
 * The terms of service to set the status for.
**/
public class PostTermsOfServiceUserStatusesRequestBodyTos {
    @JsonProperty("id")
    public String id;
    public PostTermsOfServiceUserStatusesRequestBodyTos withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum type;
    public PostTermsOfServiceUserStatusesRequestBodyTos withType(PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum type) {
        this.type = type;
        return this;
    }
}