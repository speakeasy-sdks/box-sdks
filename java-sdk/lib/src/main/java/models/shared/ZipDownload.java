package .models.shared;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * ZipDownload
 * Represents a successful request to create a `zip` archive of a list of files
 * and folders.
**/
public class ZipDownload {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_url")
    public String downloadUrl;
    public ZipDownload withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;
    public ZipDownload withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name_conflicts")
    public ZipDownloadNameConflicts[][] nameConflicts;
    public ZipDownload withNameConflicts(ZipDownloadNameConflicts[][] nameConflicts) {
        this.nameConflicts = nameConflicts;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status_url")
    public String statusUrl;
    public ZipDownload withStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
        return this;
    }
}