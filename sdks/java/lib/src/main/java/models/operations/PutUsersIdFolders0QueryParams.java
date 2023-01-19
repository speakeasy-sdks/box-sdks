package .models.operations;

import .utils.SpeakeasyMetadata;

public class PutUsersIdFolders0QueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public PutUsersIdFolders0QueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=notify")
    public Boolean notify;
    public PutUsersIdFolders0QueryParams withNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }
}