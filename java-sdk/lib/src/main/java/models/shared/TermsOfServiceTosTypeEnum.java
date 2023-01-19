package .models.shared;


public enum TermsOfServiceTosTypeEnum {
    MANAGED("managed"),
    EXTERNAL("external");

    public final String value;

    private TermsOfServiceTosTypeEnum(String value) {
        this.value = value;
    }
}
