package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDMetadataIDIDScopeEnum string

const (
	GetFilesIDMetadataIDIDScopeEnumGlobal     GetFilesIDMetadataIDIDScopeEnum = "global"
	GetFilesIDMetadataIDIDScopeEnumEnterprise GetFilesIDMetadataIDIDScopeEnum = "enterprise"
)

type GetFilesIDMetadataIDIDPathParams struct {
	FileID      string                          `pathParam:"style=simple,explode=false,name=file_id"`
	Scope       GetFilesIDMetadataIDIDScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                          `pathParam:"style=simple,explode=false,name=template_key"`
}

type GetFilesIDMetadataIDIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFilesIDMetadataIDIDPathParams
}

type GetFilesIDMetadataIDIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Metadata    *shared.Metadata
	StatusCode  int64
}
