package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutUsersIDFolders0PathParams struct {
	UserID string `pathParam:"style=simple,explode=false,name=user_id"`
}

type PutUsersIDFolders0QueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
	Notify *bool    `queryParam:"style=form,explode=true,name=notify"`
}

// PutUsersIDFolders0RequestBodyOwnedBy
// The user who the folder will be transferred to
type PutUsersIDFolders0RequestBodyOwnedBy struct {
	ID string `json:"id"`
}

type PutUsersIDFolders0RequestBody struct {
	OwnedBy PutUsersIDFolders0RequestBodyOwnedBy `json:"owned_by"`
}

type PutUsersIDFolders0Request struct {
	Retries     *utils.RetryConfig
	PathParams  PutUsersIDFolders0PathParams
	QueryParams PutUsersIDFolders0QueryParams
	Request     *PutUsersIDFolders0RequestBody `request:"mediaType=application/json"`
}

type PutUsersIDFolders0Response struct {
	ClientError *shared.ClientError
	ContentType string
	Folder      *shared.Folder
	StatusCode  int64
}
