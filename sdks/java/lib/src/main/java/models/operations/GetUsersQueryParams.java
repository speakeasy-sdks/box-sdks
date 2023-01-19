package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetUsersQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=external_app_user_id")
    public String externalAppUserId;
    public GetUsersQueryParams withExternalAppUserId(String externalAppUserId) {
        this.externalAppUserId = externalAppUserId;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields")
    public String[] fields;
    public GetUsersQueryParams withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter_term")
    public String filterTerm;
    public GetUsersQueryParams withFilterTerm(String filterTerm) {
        this.filterTerm = filterTerm;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public GetUsersQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=marker")
    public String marker;
    public GetUsersQueryParams withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public GetUsersQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=usemarker")
    public Boolean usemarker;
    public GetUsersQueryParams withUsemarker(Boolean usemarker) {
        this.usemarker = usemarker;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user_type")
    public GetUsersUserTypeEnum userType;
    public GetUsersQueryParams withUserType(GetUsersUserTypeEnum userType) {
        this.userType = userType;
        return this;
    }
}