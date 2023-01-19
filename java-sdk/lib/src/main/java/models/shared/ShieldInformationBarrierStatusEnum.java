package .models.shared;


public enum ShieldInformationBarrierStatusEnum {
    DRAFT("draft"),
    PENDING("pending"),
    DISABLED("disabled"),
    ENABLED("enabled"),
    INVALID("invalid");

    public final String value;

    private ShieldInformationBarrierStatusEnum(String value) {
        this.value = value;
    }
}
