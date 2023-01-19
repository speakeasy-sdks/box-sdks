package .models.shared;


public enum SignRequestStatusEnum {
    CONVERTING("converting"),
    CREATED("created"),
    SENT("sent"),
    VIEWED("viewed"),
    SIGNED("signed"),
    CANCELLED("cancelled"),
    DECLINED("declined"),
    ERROR_CONVERTING("error_converting"),
    ERROR_SENDING("error_sending"),
    EXPIRED("expired"),
    DOWNLOADED("downloaded"),
    SIGNED_AND_DOWNLOADED("signed and downloaded");

    public final String value;

    private SignRequestStatusEnum(String value) {
        this.value = value;
    }
}
