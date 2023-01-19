package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ZipDownloadRequest
 * A request to create a `zip` archive to download
**/
public class ZipDownloadRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_file_name")
    public String downloadFileName;
    public ZipDownloadRequest withDownloadFileName(String downloadFileName) {
        this.downloadFileName = downloadFileName;
        return this;
    }
    @JsonProperty("items")
    public ZipDownloadRequestItems[] items;
    public ZipDownloadRequest withItems(ZipDownloadRequestItems[] items) {
        this.items = items;
        return this;
    }
}