package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWebLinksIdHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=boxapi")
    public String boxapi;
    public GetWebLinksIdHeaders withBoxapi(String boxapi) {
        this.boxapi = boxapi;
        return this;
    }
}