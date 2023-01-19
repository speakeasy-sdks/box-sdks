package .models.shared;


public enum FileTypeEnum {
    FILE("file");

    public final String value;

    private FileTypeEnum(String value) {
        this.value = value;
    }
}
