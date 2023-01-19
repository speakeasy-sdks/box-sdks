package .models.operations;


public enum PostCollaborationWhitelistEntriesRequestBodyDirectionEnum {
    INBOUND("inbound"),
    OUTBOUND("outbound"),
    BOTH("both");

    public final String value;

    private PostCollaborationWhitelistEntriesRequestBodyDirectionEnum(String value) {
        this.value = value;
    }
}
