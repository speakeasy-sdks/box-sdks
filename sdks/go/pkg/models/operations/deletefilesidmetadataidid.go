package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFilesIDMetadataIDIDScopeEnum string

const (
	DeleteFilesIDMetadataIDIDScopeEnumGlobal     DeleteFilesIDMetadataIDIDScopeEnum = "global"
	DeleteFilesIDMetadataIDIDScopeEnumEnterprise DeleteFilesIDMetadataIDIDScopeEnum = "enterprise"
)

type DeleteFilesIDMetadataIDIDPathParams struct {
	FileID      string                             `pathParam:"style=simple,explode=false,name=file_id"`
	Scope       DeleteFilesIDMetadataIDIDScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                             `pathParam:"style=simple,explode=false,name=template_key"`
}

type DeleteFilesIDMetadataIDIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFilesIDMetadataIDIDPathParams
}

type DeleteFilesIDMetadataIDIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
