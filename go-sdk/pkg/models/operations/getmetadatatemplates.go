package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataTemplatesQueryParams struct {
	MetadataInstanceID string `queryParam:"style=form,explode=true,name=metadata_instance_id"`
}

type GetMetadataTemplatesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetMetadataTemplatesQueryParams
}

type GetMetadataTemplatesResponse struct {
	ClientError       *shared.ClientError
	ContentType       string
	MetadataTemplates *shared.MetadataTemplates
	StatusCode        int64
}
