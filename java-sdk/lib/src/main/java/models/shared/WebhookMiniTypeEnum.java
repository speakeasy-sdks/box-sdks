package .models.shared;


public enum WebhookMiniTypeEnum {
    WEBHOOK("webhook");

    public final String value;

    private WebhookMiniTypeEnum(String value) {
        this.value = value;
    }
}
