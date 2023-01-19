package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteWebLinksIdTrashPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=web_link_id")
    public String webLinkId;
    public DeleteWebLinksIdTrashPathParams withWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
        return this;
    }
}