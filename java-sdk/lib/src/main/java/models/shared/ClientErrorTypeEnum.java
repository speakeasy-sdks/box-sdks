package .models.shared;


public enum ClientErrorTypeEnum {
    ERROR("error");

    public final String value;

    private ClientErrorTypeEnum(String value) {
        this.value = value;
    }
}
