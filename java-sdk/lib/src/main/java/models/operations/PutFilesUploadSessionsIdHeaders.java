package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFilesUploadSessionsIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=content-range")
    public String contentRange;
    public PutFilesUploadSessionsIdHeaders withContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=digest")
    public String digest;
    public PutFilesUploadSessionsIdHeaders withDigest(String digest) {
        this.digest = digest;
        return this;
    }
}