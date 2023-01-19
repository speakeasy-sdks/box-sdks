package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteFoldersIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=recursive")
    public Boolean recursive;
    public DeleteFoldersIdQueryParams withRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
}