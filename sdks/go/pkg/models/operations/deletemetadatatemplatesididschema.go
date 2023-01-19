package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteMetadataTemplatesIDIDSchemaScopeEnum string

const (
	DeleteMetadataTemplatesIDIDSchemaScopeEnumGlobal     DeleteMetadataTemplatesIDIDSchemaScopeEnum = "global"
	DeleteMetadataTemplatesIDIDSchemaScopeEnumEnterprise DeleteMetadataTemplatesIDIDSchemaScopeEnum = "enterprise"
)

type DeleteMetadataTemplatesIDIDSchemaPathParams struct {
	Scope       DeleteMetadataTemplatesIDIDSchemaScopeEnum `pathParam:"style=simple,explode=false,name=scope"`
	TemplateKey string                                     `pathParam:"style=simple,explode=false,name=template_key"`
}

type DeleteMetadataTemplatesIDIDSchemaRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteMetadataTemplatesIDIDSchemaPathParams
}

type DeleteMetadataTemplatesIDIDSchemaResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
