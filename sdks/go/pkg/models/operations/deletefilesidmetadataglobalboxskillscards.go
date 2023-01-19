package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteFilesIDMetadataGlobalBoxSkillsCardsPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type DeleteFilesIDMetadataGlobalBoxSkillsCardsRequest struct {
	Retries    *utils.RetryConfig
	PathParams DeleteFilesIDMetadataGlobalBoxSkillsCardsPathParams
}

type DeleteFilesIDMetadataGlobalBoxSkillsCardsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
