package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetFileVersionRetentionsDispositionActionEnum string

const (
	GetFileVersionRetentionsDispositionActionEnumPermanentlyDelete GetFileVersionRetentionsDispositionActionEnum = "permanently_delete"
	GetFileVersionRetentionsDispositionActionEnumRemoveRetention   GetFileVersionRetentionsDispositionActionEnum = "remove_retention"
)

type GetFileVersionRetentionsQueryParams struct {
	DispositionAction *GetFileVersionRetentionsDispositionActionEnum `queryParam:"style=form,explode=true,name=disposition_action"`
	DispositionAfter  *string                                        `queryParam:"style=form,explode=true,name=disposition_after"`
	DispositionBefore *string                                        `queryParam:"style=form,explode=true,name=disposition_before"`
	FileID            *string                                        `queryParam:"style=form,explode=true,name=file_id"`
	FileVersionID     *string                                        `queryParam:"style=form,explode=true,name=file_version_id"`
	Limit             *int64                                         `queryParam:"style=form,explode=true,name=limit"`
	Marker            *string                                        `queryParam:"style=form,explode=true,name=marker"`
	PolicyID          *string                                        `queryParam:"style=form,explode=true,name=policy_id"`
}

type GetFileVersionRetentionsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams GetFileVersionRetentionsQueryParams
}

type GetFileVersionRetentionsResponse struct {
	ClientError           *shared.ClientError
	ContentType           string
	FileVersionRetentions *shared.FileVersionRetentions
	StatusCode            int64
}
