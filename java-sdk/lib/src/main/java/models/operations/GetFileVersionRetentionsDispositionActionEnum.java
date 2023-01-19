package .models.operations;


public enum GetFileVersionRetentionsDispositionActionEnum {
    PERMANENTLY_DELETE("permanently_delete"),
    REMOVE_RETENTION("remove_retention");

    public final String value;

    private GetFileVersionRetentionsDispositionActionEnum(String value) {
        this.value = value;
    }
}
