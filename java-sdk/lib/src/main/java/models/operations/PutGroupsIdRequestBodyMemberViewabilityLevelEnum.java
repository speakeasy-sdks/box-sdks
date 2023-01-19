package .models.operations;


public enum PutGroupsIdRequestBodyMemberViewabilityLevelEnum {
    ADMINS_ONLY("admins_only"),
    ADMINS_AND_MEMBERS("admins_and_members"),
    ALL_MANAGED_USERS("all_managed_users");

    public final String value;

    private PutGroupsIdRequestBodyMemberViewabilityLevelEnum(String value) {
        this.value = value;
    }
}
