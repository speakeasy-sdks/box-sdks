package .models.operations;



public class PostTermsOfServicesResponse {
    public .models.shared.ClientError clientError;
    public PostTermsOfServicesResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public PostTermsOfServicesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public Long statusCode;
    public PostTermsOfServicesResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public .models.shared.Task task;
    public PostTermsOfServicesResponse withTask(.models.shared.Task task) {
        this.task = task;
        return this;
    }
}