package .models.shared;


public enum FileRequestStatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive");

    public final String value;

    private FileRequestStatusEnum(String value) {
        this.value = value;
    }
}
