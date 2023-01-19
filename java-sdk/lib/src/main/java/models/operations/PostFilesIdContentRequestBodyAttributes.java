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
 * PostFilesIdContentRequestBodyAttributes
 * The additional attributes of the file being uploaded. Mainly the
 * name and the parent folder. These attributes are part of the multi
 * part request body and are in JSON format.
 * 
 * <Message warning>
 * 
 *   The `attributes` part of the body must come **before** the
 *   `file` part. Requests that do not follow this format when
 *   uploading the file will receive a HTTP `400` error with a
 *   `metadata_after_file_contents` error code.
 * 
 * </Message>
**/
public class PostFilesIdContentRequestBodyAttributes {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("content_modified_at")
    public OffsetDateTime contentModifiedAt;
    public PostFilesIdContentRequestBodyAttributes withContentModifiedAt(OffsetDateTime contentModifiedAt) {
        this.contentModifiedAt = contentModifiedAt;
        return this;
    }
    @JsonProperty("name")
    public String name;
    public PostFilesIdContentRequestBodyAttributes withName(String name) {
        this.name = name;
        return this;
    }
}