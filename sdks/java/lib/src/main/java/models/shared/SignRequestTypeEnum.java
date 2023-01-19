package .models.shared;


public enum SignRequestTypeEnum {
    SIGN_REQUEST("sign-request");

    public final String value;

    private SignRequestTypeEnum(String value) {
        this.value = value;
    }
}
