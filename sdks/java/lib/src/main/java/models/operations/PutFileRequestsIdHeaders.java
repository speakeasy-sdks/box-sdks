package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutFileRequestsIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-match")
    public String ifMatch;
    public PutFileRequestsIdHeaders withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
}