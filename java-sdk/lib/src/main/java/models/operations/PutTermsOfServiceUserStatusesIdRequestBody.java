package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutTermsOfServiceUserStatusesIdRequestBody {
    @JsonProperty("is_accepted")
    public Boolean isAccepted;
    public PutTermsOfServiceUserStatusesIdRequestBody withIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
        return this;
    }
}