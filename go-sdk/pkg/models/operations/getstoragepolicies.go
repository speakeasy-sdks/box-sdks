package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetStoragePoliciesQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Limit  *int64   `queryParam:"style=form,explode=true,name=limit"`
	Marker *string  `queryParam:"style=form,explode=true,name=marker"`
}

type GetStoragePoliciesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetStoragePoliciesQueryParams
}

type GetStoragePoliciesResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	StatusCode      int64
	StoragePolicies *shared.StoragePolicies
}
