package .models.operations;


public enum PutWebhooksIdRequestBodyTargetTypeEnum {
    FILE("file"),
    FOLDER("folder");

    public final String value;

    private PutWebhooksIdRequestBodyTargetTypeEnum(String value) {
        this.value = value;
    }
}
