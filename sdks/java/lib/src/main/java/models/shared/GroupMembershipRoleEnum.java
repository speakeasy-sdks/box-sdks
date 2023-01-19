package .models.shared;


public enum GroupMembershipRoleEnum {
    MEMBER("member"),
    ADMIN("admin");

    public final String value;

    private GroupMembershipRoleEnum(String value) {
        this.value = value;
    }
}
