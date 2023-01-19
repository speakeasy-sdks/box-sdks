package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataTemplatesIDPathParams struct {
	TemplateID string `pathParam:"style=simple,explode=false,name=template_id"`
}

type GetMetadataTemplatesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetMetadataTemplatesIDPathParams
}

type GetMetadataTemplatesIDResponse struct {
	ClientError      *shared.ClientError
	ContentType      string
	MetadataTemplate *shared.MetadataTemplate
	StatusCode       int64
}
