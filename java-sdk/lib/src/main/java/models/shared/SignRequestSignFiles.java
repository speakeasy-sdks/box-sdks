package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * SignRequestSignFiles
 * List of files that will be signed, which are copies of the original
 * source files. A new version of these files are created as signers sign
 * and can be downloaded at any point in the signing process.
**/
public class SignRequestSignFiles {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("files")
    public FileMini[] files;
    public SignRequestSignFiles withFiles(FileMini[] files) {
        this.files = files;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_ready_for_download")
    public Boolean isReadyForDownload;
    public SignRequestSignFiles withIsReadyForDownload(Boolean isReadyForDownload) {
        this.isReadyForDownload = isReadyForDownload;
        return this;
    }
}