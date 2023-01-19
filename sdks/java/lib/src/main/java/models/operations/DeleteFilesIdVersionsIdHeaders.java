package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFilesIdVersionsIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-match")
    public String ifMatch;
    public DeleteFilesIdVersionsIdHeaders withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
}