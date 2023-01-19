package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesContentRequestBody {
    @SpeakeasyMetadata("multipartForm:name=attributes,json")
    public PostFilesContentRequestBodyAttributes attributes;
    public PostFilesContentRequestBody withAttributes(PostFilesContentRequestBodyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }
    @SpeakeasyMetadata("multipartForm:file")
    public PostFilesContentRequestBodyFile file;
    public PostFilesContentRequestBody withFile(PostFilesContentRequestBodyFile file) {
        this.file = file;
        return this;
    }
}