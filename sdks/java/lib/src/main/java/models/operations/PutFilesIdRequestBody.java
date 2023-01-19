package .models.operations;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import .utils.DateTimeSerializer;
import .utils.DateTimeDeserializer;

public class PutFilesIdRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PutFilesIdRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("disposition_at")
    public OffsetDateTime dispositionAt;
    public PutFilesIdRequestBody withDispositionAt(OffsetDateTime dispositionAt) {
        this.dispositionAt = dispositionAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lock")
    public PutFilesIdRequestBodyLock lock;
    public PutFilesIdRequestBody withLock(PutFilesIdRequestBodyLock lock) {
        this.lock = lock;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PutFilesIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent")
    public PutFilesIdRequestBodyParent parent;
    public PutFilesIdRequestBody withParent(PutFilesIdRequestBodyParent parent) {
        this.parent = parent;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("permissions")
    public PutFilesIdRequestBodyPermissions permissions;
    public PutFilesIdRequestBody withPermissions(PutFilesIdRequestBodyPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shared_link")
    public PutFilesIdRequestBodySharedLink sharedLink;
    public PutFilesIdRequestBody withSharedLink(PutFilesIdRequestBodySharedLink sharedLink) {
        this.sharedLink = sharedLink;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public String[] tags;
    public PutFilesIdRequestBody withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
}