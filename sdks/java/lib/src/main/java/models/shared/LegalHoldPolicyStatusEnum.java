package .models.shared;


public enum LegalHoldPolicyStatusEnum {
    ACTIVE("active"),
    APPLYING("applying"),
    RELEASING("releasing"),
    RELEASED("released");

    public final String value;

    private LegalHoldPolicyStatusEnum(String value) {
        this.value = value;
    }
}
