package .models.shared;


public enum EventSourceItemTypeEnum {
    FILE("file"),
    FOLDER("folder");

    public final String value;

    private EventSourceItemTypeEnum(String value) {
        this.value = value;
    }
}
