package .models.shared;


public enum SignRequestCreateSignerRoleEnum {
    SIGNER("signer"),
    APPROVER("approver"),
    FINAL_COPY_READER("final_copy_reader");

    public final String value;

    private SignRequestCreateSignerRoleEnum(String value) {
        this.value = value;
    }
}
