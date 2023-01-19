package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostFilesUploadSessionsIdCommitRequestBody {
    @JsonProperty("parts")
    public .models.shared.UploadPart[] parts;
    public PostFilesUploadSessionsIdCommitRequestBody withParts(.models.shared.UploadPart[] parts) {
        this.parts = parts;
        return this;
    }
}