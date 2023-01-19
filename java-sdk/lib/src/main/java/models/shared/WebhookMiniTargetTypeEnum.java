package .models.shared;


public enum WebhookMiniTargetTypeEnum {
    FILE("file"),
    FOLDER("folder");

    public final String value;

    private WebhookMiniTargetTypeEnum(String value) {
        this.value = value;
    }
}
