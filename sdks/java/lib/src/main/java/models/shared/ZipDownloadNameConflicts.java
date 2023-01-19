package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ZipDownloadNameConflicts
 * A file or folder for which a conflict was encountered, This object provides the type and identifier of the original item, as well as a mapping between its original name and it's new name as it will appear in the archive.
**/
public class ZipDownloadNameConflicts {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_name")
    public String downloadName;
    public ZipDownloadNameConflicts withDownloadName(String downloadName) {
        this.downloadName = downloadName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public ZipDownloadNameConflicts withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("original_name")
    public String originalName;
    public ZipDownloadNameConflicts withOriginalName(String originalName) {
        this.originalName = originalName;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ZipDownloadNameConflictsTypeEnum type;
    public ZipDownloadNameConflicts withType(ZipDownloadNameConflictsTypeEnum type) {
        this.type = type;
        return this;
    }
}