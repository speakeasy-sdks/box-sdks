package .models.operations;


public enum GetEventsStreamTypeEnum {
    ALL("all"),
    CHANGES("changes"),
    SYNC("sync"),
    ADMIN_LOGS("admin_logs"),
    ADMIN_LOGS_STREAMING("admin_logs_streaming");

    public final String value;

    private GetEventsStreamTypeEnum(String value) {
        this.value = value;
    }
}
