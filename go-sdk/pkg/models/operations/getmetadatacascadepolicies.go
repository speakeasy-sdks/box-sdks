package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataCascadePoliciesQueryParams struct {
	FolderID          string  `queryParam:"style=form,explode=true,name=folder_id"`
	Marker            *string `queryParam:"style=form,explode=true,name=marker"`
	Offset            *int64  `queryParam:"style=form,explode=true,name=offset"`
	OwnerEnterpriseID *string `queryParam:"style=form,explode=true,name=owner_enterprise_id"`
}

type GetMetadataCascadePoliciesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetMetadataCascadePoliciesQueryParams
}

type GetMetadataCascadePoliciesResponse struct {
	ClientError             *shared.ClientError
	ContentType             string
	MetadataCascadePolicies *shared.MetadataCascadePolicies
	StatusCode              int64
}
