package .models.shared;


public enum WebhookTargetTypeEnum {
    FILE("file"),
    FOLDER("folder");

    public final String value;

    private WebhookTargetTypeEnum(String value) {
        this.value = value;
    }
}
