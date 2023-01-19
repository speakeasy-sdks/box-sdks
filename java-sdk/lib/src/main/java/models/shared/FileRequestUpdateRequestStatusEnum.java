package .models.shared;


public enum FileRequestUpdateRequestStatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive");

    public final String value;

    private FileRequestUpdateRequestStatusEnum(String value) {
        this.value = value;
    }
}
