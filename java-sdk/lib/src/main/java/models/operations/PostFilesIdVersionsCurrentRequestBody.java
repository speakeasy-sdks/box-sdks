package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PostFilesIdVersionsCurrentRequestBody
 * The file version to promote
**/
public class PostFilesIdVersionsCurrentRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public PostFilesIdVersionsCurrentRequestBody withId(String id) {
        this.id = id;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostFilesIdVersionsCurrentRequestBodyTypeEnum type;
    public PostFilesIdVersionsCurrentRequestBody withType(PostFilesIdVersionsCurrentRequestBodyTypeEnum type) {
        this.type = type;
        return this;
    }
}