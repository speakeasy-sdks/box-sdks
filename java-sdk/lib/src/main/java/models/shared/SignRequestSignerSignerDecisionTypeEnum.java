package .models.shared;


public enum SignRequestSignerSignerDecisionTypeEnum {
    SIGNED("signed"),
    DECLINED("declined");

    public final String value;

    private SignRequestSignerSignerDecisionTypeEnum(String value) {
        this.value = value;
    }
}
