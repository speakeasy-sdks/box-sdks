package .models.shared;


public enum FileRequestUserBaseTypeEnum {
    USER("user");

    public final String value;

    private FileRequestUserBaseTypeEnum(String value) {
        this.value = value;
    }
}
