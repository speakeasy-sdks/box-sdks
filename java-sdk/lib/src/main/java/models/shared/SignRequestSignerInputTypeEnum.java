package .models.shared;


public enum SignRequestSignerInputTypeEnum {
    SIGNATURE("signature"),
    DATE("date"),
    TEXT("text"),
    CHECKBOX("checkbox");

    public final String value;

    private SignRequestSignerInputTypeEnum(String value) {
        this.value = value;
    }
}
