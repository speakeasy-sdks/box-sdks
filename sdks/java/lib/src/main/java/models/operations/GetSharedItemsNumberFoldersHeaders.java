package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetSharedItemsNumberFoldersHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=boxapi")
    public String boxapi;
    public GetSharedItemsNumberFoldersHeaders withBoxapi(String boxapi) {
        this.boxapi = boxapi;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-none-match")
    public String ifNoneMatch;
    public GetSharedItemsNumberFoldersHeaders withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
}