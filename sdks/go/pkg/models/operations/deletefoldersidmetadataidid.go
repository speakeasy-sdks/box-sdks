package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFoldersIDMetadataIDIDScopeEnum string

const (
	DeleteFoldersIDMetadataIDIDScopeEnumGlobal     DeleteFoldersIDMetadataIDIDScopeEnum = "global"
	DeleteFoldersIDMetadataIDIDScopeEnumEnterprise DeleteFoldersIDMetadataIDIDScopeEnum = "enterprise"
)

type DeleteFoldersIDMetadataIDIDPathParams struct {
	FolderID    string                               `pathParam:"style=simple,explode=false,name=folder_id"`
	Scope       DeleteFoldersIDMetadataIDIDScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                               `pathParam:"style=simple,explode=false,name=template_key"`
}

type DeleteFoldersIDMetadataIDIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFoldersIDMetadataIDIDPathParams
}

type DeleteFoldersIDMetadataIDIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
