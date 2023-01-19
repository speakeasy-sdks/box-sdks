package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetFoldersIdCollaborationsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetFoldersIdCollaborationsQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
}