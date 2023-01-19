package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesContentRequestBodyFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public PostFilesContentRequestBodyFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;
    public PostFilesContentRequestBodyFile withFile(String file) {
        this.file = file;
        return this;
    }
}