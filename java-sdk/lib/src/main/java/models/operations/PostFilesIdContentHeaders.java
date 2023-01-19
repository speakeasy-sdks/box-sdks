package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesIdContentHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=content-md5")
    public String contentMd5;
    public PostFilesIdContentHeaders withContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-match")
    public String ifMatch;
    public PostFilesIdContentHeaders withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
}