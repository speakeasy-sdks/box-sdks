package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostTermsOfServicesRequestBody {
    @JsonProperty("status")
    public PostTermsOfServicesRequestBodyStatusEnum status;
    public PostTermsOfServicesRequestBody withStatus(PostTermsOfServicesRequestBodyStatusEnum status) {
        this.status = status;
        return this;
    }
    @JsonProperty("text")
    public String text;
    public PostTermsOfServicesRequestBody withText(String text) {
        this.text = text;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tos_type")
    public PostTermsOfServicesRequestBodyTosTypeEnum tosType;
    public PostTermsOfServicesRequestBody withTosType(PostTermsOfServicesRequestBodyTosTypeEnum tosType) {
        this.tosType = tosType;
        return this;
    }
}