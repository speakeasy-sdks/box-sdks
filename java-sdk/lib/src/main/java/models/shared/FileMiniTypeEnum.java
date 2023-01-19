package .models.shared;


public enum FileMiniTypeEnum {
    FILE("file");

    public final String value;

    private FileMiniTypeEnum(String value) {
        this.value = value;
    }
}
