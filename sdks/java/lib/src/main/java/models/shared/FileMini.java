package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileMini
 * The bare basic representation of a file, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
public class FileMini {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("etag")
    public String etag;
    public FileMini withEtag(String etag) {
        this.etag = etag;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_version")
    public FileVersionMini fileVersion;
    public FileMini withFileVersion(FileVersionMini fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }
    @JsonProperty("id")
    public String id;
    public FileMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public FileMini withName(String name) {
        this.name = name;
        return this;
    }
    @JsonProperty("sequence_id")
    public java.util.Map<String, Object> sequenceId;
    public FileMini withSequenceId(java.util.Map<String, Object> sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }
    @JsonProperty("sha1")
    public String sha1;
    public FileMini withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }
    @JsonProperty("type")
    public FileMiniTypeEnum type;
    public FileMini withType(FileMiniTypeEnum type) {
        this.type = type;
        return this;
    }
}