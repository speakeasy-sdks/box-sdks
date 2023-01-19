package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostShieldInformationBarriersChangeStatusRequestBody {
    @JsonProperty("id")
    public String id;
    public PostShieldInformationBarriersChangeStatusRequestBody withId(String id) {
        this.id = id;
        return this;
    }
    @JsonProperty("status")
    public PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum status;
    public PostShieldInformationBarriersChangeStatusRequestBody withStatus(PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum status) {
        this.status = status;
        return this;
    }
}