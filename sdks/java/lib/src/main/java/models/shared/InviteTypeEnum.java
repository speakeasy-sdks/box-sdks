package .models.shared;


public enum InviteTypeEnum {
    INVITE("invite");

    public final String value;

    private InviteTypeEnum(String value) {
        this.value = value;
    }
}
