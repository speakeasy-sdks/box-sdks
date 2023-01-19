package shared

import (
	"time"
)

type TermsOfServiceUserStatusTypeEnum string

const (
	TermsOfServiceUserStatusTypeEnumTermsOfServiceUserStatus TermsOfServiceUserStatusTypeEnum = "terms_of_service_user_status"
)

// TermsOfServiceUserStatus
// The association between a Terms of Service and a user
type TermsOfServiceUserStatus struct {
	CreatedAt  *time.Time                        `json:"created_at,omitempty"`
	ID         *string                           `json:"id,omitempty"`
	IsAccepted *bool                             `json:"is_accepted,omitempty"`
	ModifiedAt *time.Time                        `json:"modified_at,omitempty"`
	Tos        *TermsOfServiceBase               `json:"tos,omitempty"`
	Type       *TermsOfServiceUserStatusTypeEnum `json:"type,omitempty"`
	User       *UserMini                         `json:"user,omitempty"`
}
