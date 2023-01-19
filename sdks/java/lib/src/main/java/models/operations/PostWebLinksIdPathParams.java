package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostWebLinksIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public PostWebLinksIdPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}