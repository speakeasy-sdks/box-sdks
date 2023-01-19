package .models.shared;


public enum ShieldInformationBarrierReportStatusEnum {
    PENDING("pending"),
    ERROR("error"),
    DONE("done"),
    CANCELLED("cancelled");

    public final String value;

    private ShieldInformationBarrierReportStatusEnum(String value) {
        this.value = value;
    }
}
