package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFoldersIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-match")
    public String ifMatch;
    public PutFoldersIdHeaders withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
}