package .models.shared;


public enum GroupMembershipsOrderDirectionEnum {
    ASC("ASC"),
    DESC("DESC");

    public final String value;

    private GroupMembershipsOrderDirectionEnum(String value) {
        this.value = value;
    }
}
