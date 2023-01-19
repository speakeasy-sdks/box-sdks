package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFoldersIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-match")
    public String ifMatch;
    public DeleteFoldersIdHeaders withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
}