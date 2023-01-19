package .models.shared;


public enum FileConflictTypeEnum {
    FILE("file");

    public final String value;

    private FileConflictTypeEnum(String value) {
        this.value = value;
    }
}
