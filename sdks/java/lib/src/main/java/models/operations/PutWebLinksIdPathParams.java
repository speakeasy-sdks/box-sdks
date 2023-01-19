package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public PutWebLinksIdPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}