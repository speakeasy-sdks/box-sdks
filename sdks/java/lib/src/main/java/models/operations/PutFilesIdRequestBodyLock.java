package .models.operations;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

/**
 * PutFilesIdRequestBodyLock
 * Defines a lock on an item. This prevents the item from being
 * moved, renamed, or otherwise changed by anyone other than the user
 * who created the lock.
 * 
 * Set this to `null` to remove the lock.
**/
public class PutFilesIdRequestBodyLock {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access")
    public PutFilesIdRequestBodyLockAccessEnum access;
    public PutFilesIdRequestBodyLock withAccess(PutFilesIdRequestBodyLockAccessEnum access) {
        this.access = access;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("expires_at")
    public OffsetDateTime expiresAt;
    public PutFilesIdRequestBodyLock withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_download_prevented")
    public Boolean isDownloadPrevented;
    public PutFilesIdRequestBodyLock withIsDownloadPrevented(Boolean isDownloadPrevented) {
        this.isDownloadPrevented = isDownloadPrevented;
        return this;
    }
}