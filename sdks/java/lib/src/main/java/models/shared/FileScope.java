package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileScope
 * A relation between a file and the scopes for which the file can be accessed
**/
public class FileScope {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public FileMini object;
    public FileScope withObject(FileMini object) {
        this.object = object;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    public FileScopeScopeEnum scope;
    public FileScope withScope(FileScopeScopeEnum scope) {
        this.scope = scope;
        return this;
    }
}