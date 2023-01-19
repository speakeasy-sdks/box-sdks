package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataTemplatesGlobalQueryParams struct {
	Limit  *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker *string `queryParam:"style=form,explode=true,name=marker"`
}

type GetMetadataTemplatesGlobalRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetMetadataTemplatesGlobalQueryParams
}

type GetMetadataTemplatesGlobalResponse struct {
	ClientError       *shared.ClientError
	ContentType       string
	MetadataTemplates *shared.MetadataTemplates
	StatusCode        int64
}
