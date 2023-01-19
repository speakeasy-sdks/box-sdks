package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdContentRequestBodyFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public PostFilesIdContentRequestBodyFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;
    public PostFilesIdContentRequestBodyFile withFile(String file) {
        this.file = file;
        return this;
    }
}