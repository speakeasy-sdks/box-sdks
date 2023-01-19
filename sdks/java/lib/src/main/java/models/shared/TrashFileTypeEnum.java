package .models.shared;


public enum TrashFileTypeEnum {
    FILE("file");

    public final String value;

    private TrashFileTypeEnum(String value) {
        this.value = value;
    }
}
