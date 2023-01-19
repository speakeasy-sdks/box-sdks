package .models.operations;


public enum PostWebhooksRequestBodyTargetTypeEnum {
    FILE("file"),
    FOLDER("folder");

    public final String value;

    private PostWebhooksRequestBodyTargetTypeEnum(String value) {
        this.value = value;
    }
}
