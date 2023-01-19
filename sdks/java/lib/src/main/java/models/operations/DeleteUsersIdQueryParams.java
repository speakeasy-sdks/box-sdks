package .models.operations;

import .utils.SpeakeasyMetadata;

public class DeleteUsersIdQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=force")
    public Boolean force;
    public DeleteUsersIdQueryParams withForce(Boolean force) {
        this.force = force;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=notify")
    public Boolean notify;
    public DeleteUsersIdQueryParams withNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }
}