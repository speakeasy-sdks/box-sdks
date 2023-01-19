package .models.shared;


public enum TrashFileRestoredTypeEnum {
    FILE("file");

    public final String value;

    private TrashFileRestoredTypeEnum(String value) {
        this.value = value;
    }
}
