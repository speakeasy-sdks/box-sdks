package .models.shared;


public enum GroupMiniGroupTypeEnum {
    MANAGED_GROUP("managed_group"),
    ALL_USERS_GROUP("all_users_group");

    public final String value;

    private GroupMiniGroupTypeEnum(String value) {
        this.value = value;
    }
}
