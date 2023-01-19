package .models.shared;


public enum ConflictErrorCodeEnum {
    CREATED("created"),
    ACCEPTED("accepted"),
    NO_CONTENT("no_content"),
    REDIRECT("redirect"),
    NOT_MODIFIED("not_modified"),
    BAD_REQUEST("bad_request"),
    UNAUTHORIZED("unauthorized"),
    FORBIDDEN("forbidden"),
    NOT_FOUND("not_found"),
    METHOD_NOT_ALLOWED("method_not_allowed"),
    CONFLICT("conflict"),
    PRECONDITION_FAILED("precondition_failed"),
    TOO_MANY_REQUESTS("too_many_requests"),
    INTERNAL_SERVER_ERROR("internal_server_error"),
    UNAVAILABLE("unavailable"),
    ITEM_NAME_INVALID("item_name_invalid"),
    INSUFFICIENT_SCOPE("insufficient_scope");

    public final String value;

    private ConflictErrorCodeEnum(String value) {
        this.value = value;
    }
}
