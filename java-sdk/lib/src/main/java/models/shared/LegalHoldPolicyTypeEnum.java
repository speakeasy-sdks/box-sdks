package .models.shared;


public enum LegalHoldPolicyTypeEnum {
    LEGAL_HOLD_POLICY("legal_hold_policy");

    public final String value;

    private LegalHoldPolicyTypeEnum(String value) {
        this.value = value;
    }
}
