package .models.shared;


public enum WebhookTypeEnum {
    WEBHOOK("webhook");

    public final String value;

    private WebhookTypeEnum(String value) {
        this.value = value;
    }
}
