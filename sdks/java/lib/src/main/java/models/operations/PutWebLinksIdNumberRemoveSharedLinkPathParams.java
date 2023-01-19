package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutWebLinksIdNumberRemoveSharedLinkPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public PutWebLinksIdNumberRemoveSharedLinkPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}