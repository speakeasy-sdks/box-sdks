package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdContentRequestBody {
    @SpeakeasyMetadata("multipartForm:name=attributes,json")
    public PostFilesIdContentRequestBodyAttributes attributes;
    public PostFilesIdContentRequestBody withAttributes(PostFilesIdContentRequestBodyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }
    @SpeakeasyMetadata("multipartForm:file")
    public PostFilesIdContentRequestBodyFile file;
    public PostFilesIdContentRequestBody withFile(PostFilesIdContentRequestBodyFile file) {
        this.file = file;
        return this;
    }
}