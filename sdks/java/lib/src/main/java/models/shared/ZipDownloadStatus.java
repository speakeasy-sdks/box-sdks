package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ZipDownloadStatus
 * The status of a `zip` archive being downloaded.
**/
public class ZipDownloadStatus {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downloaded_file_count")
    public Long downloadedFileCount;
    public ZipDownloadStatus withDownloadedFileCount(Long downloadedFileCount) {
        this.downloadedFileCount = downloadedFileCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skipped_file_count")
    public Long skippedFileCount;
    public ZipDownloadStatus withSkippedFileCount(Long skippedFileCount) {
        this.skippedFileCount = skippedFileCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skipped_folder_count")
    public Long skippedFolderCount;
    public ZipDownloadStatus withSkippedFolderCount(Long skippedFolderCount) {
        this.skippedFolderCount = skippedFolderCount;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    public ZipDownloadStatusStateEnum state;
    public ZipDownloadStatus withState(ZipDownloadStatusStateEnum state) {
        this.state = state;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_file_count")
    public Long totalFileCount;
    public ZipDownloadStatus withTotalFileCount(Long totalFileCount) {
        this.totalFileCount = totalFileCount;
        return this;
    }
}