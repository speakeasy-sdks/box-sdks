package .models.operations;

import .utils.SpeakeasyMetadata;

public class PostCollaborationsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PostCollaborationsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=notify")
    public Boolean notify;
    public PostCollaborationsQueryParams withNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }
}