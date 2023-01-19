package .models.shared;


public enum SignRequestSignerInputContentTypeEnum {
    INITIAL("initial"),
    STAMP("stamp"),
    SIGNATURE("signature"),
    COMPANY("company"),
    TITLE("title"),
    EMAIL("email"),
    FULL_NAME("full_name"),
    FIRST_NAME("first_name"),
    LAST_NAME("last_name"),
    TEXT("text"),
    DATE("date"),
    CHECKBOX("checkbox");

    public final String value;

    private SignRequestSignerInputContentTypeEnum(String value) {
        this.value = value;
    }
}
