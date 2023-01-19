package .models.shared;


public enum FileRequestCopyRequestStatusEnum {
    ACTIVE("active"),
    INACTIVE("inactive");

    public final String value;

    private FileRequestCopyRequestStatusEnum(String value) {
        this.value = value;
    }
}
