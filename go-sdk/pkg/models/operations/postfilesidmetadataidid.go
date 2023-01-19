package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFilesIDMetadataIDIDScopeEnum string

const (
	PostFilesIDMetadataIDIDScopeEnumGlobal     PostFilesIDMetadataIDIDScopeEnum = "global"
	PostFilesIDMetadataIDIDScopeEnumEnterprise PostFilesIDMetadataIDIDScopeEnum = "enterprise"
)

type PostFilesIDMetadataIDIDPathParams struct {
	FileID      string                           `pathParam:"style=simple,explode=false,name=file_id"`
	Scope       PostFilesIDMetadataIDIDScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                           `pathParam:"style=simple,explode=false,name=template_key"`
}

type PostFilesIDMetadataIDIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostFilesIDMetadataIDIDPathParams
	Request    map[string]string `request:"mediaType=application/json"`
}

type PostFilesIDMetadataIDIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Metadata    *shared.Metadata
	StatusCode  int64
}
