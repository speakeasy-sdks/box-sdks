package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostMetadataCascadePoliciesRequestBodyScopeEnum string

const (
	PostMetadataCascadePoliciesRequestBodyScopeEnumGlobal     PostMetadataCascadePoliciesRequestBodyScopeEnum = "global"
	PostMetadataCascadePoliciesRequestBodyScopeEnumEnterprise PostMetadataCascadePoliciesRequestBodyScopeEnum = "enterprise"
)

type PostMetadataCascadePoliciesRequestBody struct {
	FolderID    string                                          `json:"folder_id"`
	Scope       PostMetadataCascadePoliciesRequestBodyScopeEnum `json:"scope"`
	TemplateKey string                                          `json:"templateKey"`
}

type PostMetadataCascadePoliciesRequest struct {
	Retries *utils.RetryConfig
	Request *PostMetadataCascadePoliciesRequestBody `request:"mediaType=application/json"`
}

type PostMetadataCascadePoliciesResponse struct {
	ClientError           *shared.ClientError
	ConflictError         *shared.ConflictError
	ContentType           string
	MetadataCascadePolicy *shared.MetadataCascadePolicy
	StatusCode            int64
}
