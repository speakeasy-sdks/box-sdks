package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdNumberUpdateSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public PutWebLinksIdNumberUpdateSharedLinkPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}