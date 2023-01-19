package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-match")
    public String ifMatch;
    public DeleteFilesIdHeaders withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
}