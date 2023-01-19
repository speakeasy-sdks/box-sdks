package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutFilesIDNumberRemoveSharedLinkPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PutFilesIDNumberRemoveSharedLinkQueryParams struct {
	Fields string `queryParam:"style=form,explode=true,name=fields"`
}

type PutFilesIDNumberRemoveSharedLinkRequestBody struct {
	SharedLink map[string]interface{} `json:"shared_link,omitempty"`
}

type PutFilesIDNumberRemoveSharedLinkRequest struct {
	Retries     *utils.RetryConfig
	PathParams  PutFilesIDNumberRemoveSharedLinkPathParams
	QueryParams PutFilesIDNumberRemoveSharedLinkQueryParams
	Request     *PutFilesIDNumberRemoveSharedLinkRequestBody `request:"mediaType=application/json"`
}

type PutFilesIDNumberRemoveSharedLinkResponse struct {
	ClientError *shared.ClientError
	ContentType string
	File        *shared.File
	StatusCode  int64
}
