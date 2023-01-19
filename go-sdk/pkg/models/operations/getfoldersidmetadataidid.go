package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDMetadataIDIDScopeEnum string

const (
	GetFoldersIDMetadataIDIDScopeEnumGlobal     GetFoldersIDMetadataIDIDScopeEnum = "global"
	GetFoldersIDMetadataIDIDScopeEnumEnterprise GetFoldersIDMetadataIDIDScopeEnum = "enterprise"
)

type GetFoldersIDMetadataIDIDPathParams struct {
	FolderID    string                            `pathParam:"style=simple,explode=false,name=folder_id"`
	Scope       GetFoldersIDMetadataIDIDScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                            `pathParam:"style=simple,explode=false,name=template_key"`
}

type GetFoldersIDMetadataIDIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFoldersIDMetadataIDIDPathParams
}

type GetFoldersIDMetadataIDIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Metadata    *shared.Metadata
	StatusCode  int64
}
