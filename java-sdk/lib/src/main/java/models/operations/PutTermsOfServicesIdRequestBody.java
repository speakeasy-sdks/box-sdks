package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutTermsOfServicesIdRequestBody {
    @JsonProperty("status")
    public PutTermsOfServicesIdRequestBodyStatusEnum status;
    public PutTermsOfServicesIdRequestBody withStatus(PutTermsOfServicesIdRequestBodyStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonProperty("text")
    public String text;
    public PutTermsOfServicesIdRequestBody withText(String text) {
        this.text = text;
        return this;
    }
}