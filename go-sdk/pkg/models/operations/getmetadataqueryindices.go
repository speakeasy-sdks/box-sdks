package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataQueryIndicesScopeEnum string

const (
	GetMetadataQueryIndicesScopeEnumGlobal     GetMetadataQueryIndicesScopeEnum = "global"
	GetMetadataQueryIndicesScopeEnumEnterprise GetMetadataQueryIndicesScopeEnum = "enterprise"
)

type GetMetadataQueryIndicesQueryParams struct {
	Scope       GetMetadataQueryIndicesScopeEnum `queryParam:"style=form,explode=true,name=scope"`
	TemplateKey string                           `queryParam:"style=form,explode=true,name=template_key"`
}

type GetMetadataQueryIndicesRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetMetadataQueryIndicesQueryParams
}

type GetMetadataQueryIndicesResponse struct {
	ClientError          *shared.ClientError
	ContentType          string
	MetadataQueryIndices *shared.MetadataQueryIndices
	StatusCode           int64
}
