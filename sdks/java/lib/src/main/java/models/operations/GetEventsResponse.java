package .models.operations;



public class GetEventsResponse {
    public .models.shared.ClientError clientError;
    public GetEventsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public GetEventsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.Events events;
    public GetEventsResponse withEvents(.models.shared.Events events) {
        this.events = events;
        return this;
    }
    public Long statusCode;
    public GetEventsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}