package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostFilesUploadSessionsIdCommitHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=digest")
    public String digest;
    public PostFilesUploadSessionsIdCommitHeaders withDigest(String digest) {
        this.digest = digest;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-match")
    public String ifMatch;
    public PostFilesUploadSessionsIdCommitHeaders withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-none-match")
    public String ifNoneMatch;
    public PostFilesUploadSessionsIdCommitHeaders withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
}