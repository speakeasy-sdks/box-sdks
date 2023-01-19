package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetMetadataTemplatesIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=template_id")
    public String templateId;
    public GetMetadataTemplatesIdPathParams withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
}