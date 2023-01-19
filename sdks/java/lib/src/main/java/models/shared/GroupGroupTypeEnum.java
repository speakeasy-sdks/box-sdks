package .models.shared;


public enum GroupGroupTypeEnum {
    MANAGED_GROUP("managed_group"),
    ALL_USERS_GROUP("all_users_group");

    public final String value;

    private GroupGroupTypeEnum(String value) {
        this.value = value;
    }
}
