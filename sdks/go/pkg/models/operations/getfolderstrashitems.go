package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFoldersTrashItemsDirectionEnum string

const (
	GetFoldersTrashItemsDirectionEnumAsc  GetFoldersTrashItemsDirectionEnum = "ASC"
	GetFoldersTrashItemsDirectionEnumDesc GetFoldersTrashItemsDirectionEnum = "DESC"
)

type GetFoldersTrashItemsSortEnum string

const (
	GetFoldersTrashItemsSortEnumID   GetFoldersTrashItemsSortEnum = "id"
	GetFoldersTrashItemsSortEnumName GetFoldersTrashItemsSortEnum = "name"
	GetFoldersTrashItemsSortEnumDate GetFoldersTrashItemsSortEnum = "date"
	GetFoldersTrashItemsSortEnumSize GetFoldersTrashItemsSortEnum = "size"
)

type GetFoldersTrashItemsQueryParams struct {
	Direction *GetFoldersTrashItemsDirectionEnum `queryParam:"style=form,explode=true,name=direction"`
	Fields    []string                           `queryParam:"style=form,explode=false,name=fields"`
	Limit     *int64                             `queryParam:"style=form,explode=true,name=limit"`
	Marker    *string                            `queryParam:"style=form,explode=true,name=marker"`
	Offset    *int64                             `queryParam:"style=form,explode=true,name=offset"`
	Sort      *GetFoldersTrashItemsSortEnum      `queryParam:"style=form,explode=true,name=sort"`
	Usemarker *bool                              `queryParam:"style=form,explode=true,name=usemarker"`
}

type GetFoldersTrashItemsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetFoldersTrashItemsQueryParams
}

type GetFoldersTrashItemsResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Items       *shared.Items
	StatusCode  int64
}
