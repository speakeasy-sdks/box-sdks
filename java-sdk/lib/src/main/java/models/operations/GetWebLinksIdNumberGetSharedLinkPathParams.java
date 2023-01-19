package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWebLinksIdNumberGetSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public GetWebLinksIdNumberGetSharedLinkPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}