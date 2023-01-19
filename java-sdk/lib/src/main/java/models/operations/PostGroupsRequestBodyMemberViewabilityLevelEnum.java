package .models.operations;


public enum PostGroupsRequestBodyMemberViewabilityLevelEnum {
    ADMINS_ONLY("admins_only"),
    ADMINS_AND_MEMBERS("admins_and_members"),
    ALL_MANAGED_USERS("all_managed_users");

    public final String value;

    private PostGroupsRequestBodyMemberViewabilityLevelEnum(String value) {
        this.value = value;
    }
}
