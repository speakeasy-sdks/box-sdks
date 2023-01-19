package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class PostFilesIdUploadSessionsRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_name")
    public String fileName;
    public PostFilesIdUploadSessionsRequestBody withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    @JsonProperty("file_size")
    public Long fileSize;
    public PostFilesIdUploadSessionsRequestBody withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}