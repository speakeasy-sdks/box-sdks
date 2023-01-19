package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

type PostLegalHoldPoliciesRequestBody struct {
	Description     *string    `json:"description,omitempty"`
	FilterEndedAt   *time.Time `json:"filter_ended_at,omitempty"`
	FilterStartedAt *time.Time `json:"filter_started_at,omitempty"`
	IsOngoing       *bool      `json:"is_ongoing,omitempty"`
	PolicyName      string     `json:"policy_name"`
}

type PostLegalHoldPoliciesRequest struct {
	Retries *utils.RetryConfig
	Request *PostLegalHoldPoliciesRequestBody `request:"mediaType=application/json"`
}

type PostLegalHoldPoliciesResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	LegalHoldPolicy *shared.LegalHoldPolicy
	StatusCode      int64
}
