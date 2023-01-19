package .models.shared;


public enum ConflictErrorTypeEnum {
    ERROR("error");

    public final String value;

    private ConflictErrorTypeEnum(String value) {
        this.value = value;
    }
}
