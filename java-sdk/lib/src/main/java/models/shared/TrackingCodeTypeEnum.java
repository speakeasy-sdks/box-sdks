package .models.shared;


public enum TrackingCodeTypeEnum {
    TRACKING_CODE("tracking_code");

    public final String value;

    private TrackingCodeTypeEnum(String value) {
        this.value = value;
    }
}
