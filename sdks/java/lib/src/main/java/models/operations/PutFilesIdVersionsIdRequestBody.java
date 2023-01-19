package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutFilesIdVersionsIdRequestBody
 * The file version to be
 * restored
**/
public class PutFilesIdVersionsIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trashed_at")
    public String trashedAt;
    public PutFilesIdVersionsIdRequestBody withTrashedAt(String trashedAt) {
        this.trashedAt = trashedAt;
        return this;
    }
}