package .models.operations;



public class OptionsEventsRequest {
    public .models.utils.RetryConfig retries;
    public OptionsEventsRequest withRetries(.models.utils.RetryConfig retries) {
        this.retries = retries;
        return this;
    }
}