package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesContentHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=content-md5")
    public String contentMd5;
    public PostFilesContentHeaders withContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
}