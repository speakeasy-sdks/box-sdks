package .models.operations;



public class OptionsEventsResponse {
    public .models.shared.ClientError clientError;
    public OptionsEventsResponse withClientError(.models.shared.ClientError clientError) {
        this.clientError = clientError;
        return this;
    }
    public String contentType;
    public OptionsEventsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public .models.shared.RealtimeServers realtimeServers;
    public OptionsEventsResponse withRealtimeServers(.models.shared.RealtimeServers realtimeServers) {
        this.realtimeServers = realtimeServers;
        return this;
    }
    public Long statusCode;
    public OptionsEventsResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}