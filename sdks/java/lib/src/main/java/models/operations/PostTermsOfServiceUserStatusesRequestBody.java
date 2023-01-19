package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostTermsOfServiceUserStatusesRequestBody {
    @JsonProperty("is_accepted")
    public Boolean isAccepted;
    public PostTermsOfServiceUserStatusesRequestBody withIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
        return this;
    }
    @JsonProperty("tos")
    public PostTermsOfServiceUserStatusesRequestBodyTos tos;
    public PostTermsOfServiceUserStatusesRequestBody withTos(PostTermsOfServiceUserStatusesRequestBodyTos tos) {
        this.tos = tos;
        return this;
    }
    @JsonProperty("user")
    public PostTermsOfServiceUserStatusesRequestBodyUser user;
    public PostTermsOfServiceUserStatusesRequestBody withUser(PostTermsOfServiceUserStatusesRequestBodyUser user) {
        this.user = user;
        return this;
    }
}