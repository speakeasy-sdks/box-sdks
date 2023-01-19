package .models.shared;


public enum SignRequestSignerRoleEnum {
    SIGNER("signer"),
    APPROVER("approver"),
    FINAL_COPY_READER("final_copy_reader");

    public final String value;

    private SignRequestSignerRoleEnum(String value) {
        this.value = value;
    }
}
