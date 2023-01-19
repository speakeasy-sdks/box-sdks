package .models.shared;


public enum SignRequestSignatureColorEnum {
    BLUE("blue"),
    BLACK("black"),
    RED("red");

    public final String value;

    private SignRequestSignatureColorEnum(String value) {
        this.value = value;
    }
}
