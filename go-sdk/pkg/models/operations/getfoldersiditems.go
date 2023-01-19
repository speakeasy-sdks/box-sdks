package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersIDItemsPathParams struct {
	FolderID string `pathParam:"style=simple,explode=false,name=folder_id"`
}

type GetFoldersIDItemsDirectionEnum string

const (
	GetFoldersIDItemsDirectionEnumAsc  GetFoldersIDItemsDirectionEnum = "ASC"
	GetFoldersIDItemsDirectionEnumDesc GetFoldersIDItemsDirectionEnum = "DESC"
)

type GetFoldersIDItemsSortEnum string

const (
	GetFoldersIDItemsSortEnumID   GetFoldersIDItemsSortEnum = "id"
	GetFoldersIDItemsSortEnumName GetFoldersIDItemsSortEnum = "name"
	GetFoldersIDItemsSortEnumDate GetFoldersIDItemsSortEnum = "date"
	GetFoldersIDItemsSortEnumSize GetFoldersIDItemsSortEnum = "size"
)

type GetFoldersIDItemsQueryParams struct {
	Direction *GetFoldersIDItemsDirectionEnum `queryParam:"style=form,explode=true,name=direction"`
	Fields    []string                        `queryParam:"style=form,explode=false,name=fields"`
	Limit     *int64                          `queryParam:"style=form,explode=true,name=limit"`
	Marker    *string                         `queryParam:"style=form,explode=true,name=marker"`
	Offset    *int64                          `queryParam:"style=form,explode=true,name=offset"`
	Sort      *GetFoldersIDItemsSortEnum      `queryParam:"style=form,explode=true,name=sort"`
	Usemarker *bool                           `queryParam:"style=form,explode=true,name=usemarker"`
}

type GetFoldersIDItemsHeaders struct {
	Boxapi *string `header:"style=simple,explode=false,name=boxapi"`
}

type GetFoldersIDItemsRequest struct {
	Retries     *utils.RetryConfig
	PathParams  GetFoldersIDItemsPathParams
	QueryParams GetFoldersIDItemsQueryParams
	Headers     GetFoldersIDItemsHeaders
}

type GetFoldersIDItemsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Items       *shared.Items
	StatusCode  int64
}
