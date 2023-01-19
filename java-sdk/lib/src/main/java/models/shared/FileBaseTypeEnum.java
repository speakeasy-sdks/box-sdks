package .models.shared;


public enum FileBaseTypeEnum {
    FILE("file");

    public final String value;

    private FileBaseTypeEnum(String value) {
        this.value = value;
    }
}
