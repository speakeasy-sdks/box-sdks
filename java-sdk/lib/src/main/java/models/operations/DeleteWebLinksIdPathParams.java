package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteWebLinksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public DeleteWebLinksIdPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}