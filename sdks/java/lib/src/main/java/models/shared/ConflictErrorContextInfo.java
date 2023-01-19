package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ConflictErrorContextInfo {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conflicts")
    public FileConflict[] conflicts;
    public ConflictErrorContextInfo withConflicts(FileConflict[] conflicts) {
        this.conflicts = conflicts;
        return this;
    }
}