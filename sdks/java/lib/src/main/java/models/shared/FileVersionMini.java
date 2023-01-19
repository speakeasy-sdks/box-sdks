package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * FileVersionMini
 * The bare basic representation of a file version, the minimal
 * amount of fields returned when using the `fields` query
 * parameter.
**/
public class FileVersionMini {
    @JsonProperty("id")
    public String id;
    public FileVersionMini withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sha1")
    public String sha1;
    public FileVersionMini withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }
    @JsonProperty("type")
    public FileVersionMiniTypeEnum type;
    public FileVersionMini withType(FileVersionMiniTypeEnum type) {
        this.type = type;
        return this;
    }
}