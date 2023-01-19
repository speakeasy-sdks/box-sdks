package .models.shared;


public enum CollaborationAllowlistEntryDirectionEnum {
    INBOUND("inbound"),
    OUTBOUND("outbound"),
    BOTH("both");

    public final String value;

    private CollaborationAllowlistEntryDirectionEnum(String value) {
        this.value = value;
    }
}
