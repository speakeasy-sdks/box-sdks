package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostFilesIDMetadataGlobalBoxSkillsCardsPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PostFilesIDMetadataGlobalBoxSkillsCardsRequestBody struct {
	Cards []interface{} `json:"cards"`
}

type PostFilesIDMetadataGlobalBoxSkillsCardsRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostFilesIDMetadataGlobalBoxSkillsCardsPathParams
	Request    *PostFilesIDMetadataGlobalBoxSkillsCardsRequestBody `request:"mediaType=application/json"`
}

type PostFilesIDMetadataGlobalBoxSkillsCardsResponse struct {
	ClientError        *shared.ClientError
	ContentType        string
	SkillCardsMetadata *shared.SkillCardsMetadata
	StatusCode         int64
}
