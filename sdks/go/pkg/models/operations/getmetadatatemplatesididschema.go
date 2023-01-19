package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataTemplatesIDIDSchemaScopeEnum string

const (
	GetMetadataTemplatesIDIDSchemaScopeEnumGlobal     GetMetadataTemplatesIDIDSchemaScopeEnum = "global"
	GetMetadataTemplatesIDIDSchemaScopeEnumEnterprise GetMetadataTemplatesIDIDSchemaScopeEnum = "enterprise"
)

type GetMetadataTemplatesIDIDSchemaPathParams struct {
	Scope       GetMetadataTemplatesIDIDSchemaScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                                  `pathParam:"style=simple,explode=false,name=template_key"`
}

type GetMetadataTemplatesIDIDSchemaRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetMetadataTemplatesIDIDSchemaPathParams
}

type GetMetadataTemplatesIDIDSchemaResponse struct {
	ClientError      *shared.ClientError
	ContentType      string
	MetadataTemplate *shared.MetadataTemplate
	StatusCode       int64
}
