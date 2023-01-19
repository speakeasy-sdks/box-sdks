package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetWebLinksIdTrashPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public GetWebLinksIdTrashPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}