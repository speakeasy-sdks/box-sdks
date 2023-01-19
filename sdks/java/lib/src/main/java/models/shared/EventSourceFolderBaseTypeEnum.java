package .models.shared;


public enum EventSourceFolderBaseTypeEnum {
    FOLDER("folder");

    public final String value;

    private EventSourceFolderBaseTypeEnum(String value) {
        this.value = value;
    }
}
