package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFoldersIDMetadataIDIDScopeEnum string

const (
	PostFoldersIDMetadataIDIDScopeEnumGlobal     PostFoldersIDMetadataIDIDScopeEnum = "global"
	PostFoldersIDMetadataIDIDScopeEnumEnterprise PostFoldersIDMetadataIDIDScopeEnum = "enterprise"
)

type PostFoldersIDMetadataIDIDPathParams struct {
	FolderID    string                             `pathParam:"style=simple,explode=false,name=folder_id"`
	Scope       PostFoldersIDMetadataIDIDScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                             `pathParam:"style=simple,explode=false,name=template_key"`
}

type PostFoldersIDMetadataIDIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostFoldersIDMetadataIDIDPathParams
	Request    map[string]string `request:"mediaType=application/json"`
}

type PostFoldersIDMetadataIDIDResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Metadata    *shared.Metadata
	StatusCode  int64
}
