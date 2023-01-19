package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetSharedItemsNumberWebLinksHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=boxapi")
    public String boxapi;
    public GetSharedItemsNumberWebLinksHeaders withBoxapi(String boxapi) {
        this.boxapi = boxapi;
        return this;
    }
    @SpeakeasyMetadata("header:style=simple,explode=false,name=if-none-match")
    public String ifNoneMatch;
    public GetSharedItemsNumberWebLinksHeaders withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }
}