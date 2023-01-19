package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=boxapi")
    public String boxapi;
    public GetFoldersIdHeaders withBoxapi(String boxapi) {
        this.boxapi = boxapi;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-none-match")
    public String ifNoneMatch;
    public GetFoldersIdHeaders withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
}