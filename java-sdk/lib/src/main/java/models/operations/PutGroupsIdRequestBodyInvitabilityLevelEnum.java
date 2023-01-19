package .models.operations;


public enum PutGroupsIdRequestBodyInvitabilityLevelEnum {
    ADMINS_ONLY("admins_only"),
    ADMINS_AND_MEMBERS("admins_and_members"),
    ALL_MANAGED_USERS("all_managed_users");

    public final String value;

    private PutGroupsIdRequestBodyInvitabilityLevelEnum(String value) {
        this.value = value;
    }
}
