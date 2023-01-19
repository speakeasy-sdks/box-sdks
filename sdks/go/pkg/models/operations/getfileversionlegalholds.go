package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFileVersionLegalHoldsQueryParams struct {
	Limit    *int64  `queryParam:"style=form,explode=true,name=limit"`
	Marker   *string `queryParam:"style=form,explode=true,name=marker"`
	PolicyID string  `queryParam:"style=form,explode=true,name=policy_id"`
}

type GetFileVersionLegalHoldsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetFileVersionLegalHoldsQueryParams
}

type GetFileVersionLegalHoldsResponse struct {
	ClientError           *shared.ClientError
	ContentType           string
	FileVersionLegalHolds *shared.FileVersionLegalHolds
	StatusCode            int64
}
