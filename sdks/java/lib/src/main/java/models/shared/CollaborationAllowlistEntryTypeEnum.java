package .models.shared;


public enum CollaborationAllowlistEntryTypeEnum {
    COLLABORATION_WHITELIST_ENTRY("collaboration_whitelist_entry");

    public final String value;

    private CollaborationAllowlistEntryTypeEnum(String value) {
        this.value = value;
    }
}
