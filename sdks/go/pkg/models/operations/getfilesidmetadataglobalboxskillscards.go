package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFilesIDMetadataGlobalBoxSkillsCardsPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type GetFilesIDMetadataGlobalBoxSkillsCardsRequest struct {
	Retries    *utils.RetryConfig
	PathParams GetFilesIDMetadataGlobalBoxSkillsCardsPathParams
}

type GetFilesIDMetadataGlobalBoxSkillsCardsResponse struct {
	ClientError        *shared.ClientError
	ContentType        string
	SkillCardsMetadata *shared.SkillCardsMetadata
	StatusCode         int64
}
