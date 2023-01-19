package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostFilesUploadSessionsRequestBody {
    @JsonProperty("file_name")
    public String fileName;
    public PostFilesUploadSessionsRequestBody withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    @JsonProperty("file_size")
    public Long fileSize;
    public PostFilesUploadSessionsRequestBody withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    @JsonProperty("folder_id")
    public String folderId;
    public PostFilesUploadSessionsRequestBody withFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
}