package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataTemplatesEnterpriseQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetMetadataTemplatesEnterpriseRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetMetadataTemplatesEnterpriseQueryParams
}

type GetMetadataTemplatesEnterpriseResponse struct {
	ClientError       *shared.ClientError
	ContentType       string
	MetadataTemplates *shared.MetadataTemplates
	StatusCode        int64
}
