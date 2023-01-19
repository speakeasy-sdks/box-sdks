package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type OptionsEventsRequest struct {
	Retries *utils.RetryConfig
}

type OptionsEventsResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	RealtimeServers *shared.RealtimeServers
	StatusCode      int64
}
