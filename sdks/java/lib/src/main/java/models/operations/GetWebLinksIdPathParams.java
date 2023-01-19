package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWebLinksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public GetWebLinksIdPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}