package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileRequestCopyRequestFolder
 * The folder to associate the new file request to.
**/
public class FileRequestCopyRequestFolder {
    @JsonProperty("id")
    public String id;
    public FileRequestCopyRequestFolder withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public FileRequestCopyRequestFolderTypeEnum type;
    public FileRequestCopyRequestFolder withType(FileRequestCopyRequestFolderTypeEnum type) {
        this.type = type;
        return this;
    }
}