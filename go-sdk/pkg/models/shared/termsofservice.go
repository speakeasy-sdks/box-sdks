package shared

import (
	"time"
)

type TermsOfServiceEnterpriseTypeEnum string

const (
	TermsOfServiceEnterpriseTypeEnumEnterprise TermsOfServiceEnterpriseTypeEnum = "enterprise"
)

// TermsOfServiceEnterprise
// A representation of a Box enterprise
type TermsOfServiceEnterprise struct {
	ID   *string                           `json:"id,omitempty"`
	Name *string                           `json:"name,omitempty"`
	Type *TermsOfServiceEnterpriseTypeEnum `json:"type,omitempty"`
}

type TermsOfServiceStatusEnum string

const (
	TermsOfServiceStatusEnumEnabled  TermsOfServiceStatusEnum = "enabled"
	TermsOfServiceStatusEnumDisabled TermsOfServiceStatusEnum = "disabled"
)

type TermsOfServiceTosTypeEnum string

const (
	TermsOfServiceTosTypeEnumManaged  TermsOfServiceTosTypeEnum = "managed"
	TermsOfServiceTosTypeEnumExternal TermsOfServiceTosTypeEnum = "external"
)

type TermsOfServiceTypeEnum string

const (
	TermsOfServiceTypeEnumTermsOfService TermsOfServiceTypeEnum = "terms_of_service"
)

// TermsOfService
// The root-level record that is supposed to represent a
// single Terms of Service.
type TermsOfService struct {
	CreatedAt  *time.Time                 `json:"created_at,omitempty"`
	Enterprise *TermsOfServiceEnterprise  `json:"enterprise,omitempty"`
	ID         *string                    `json:"id,omitempty"`
	ModifiedAt *time.Time                 `json:"modified_at,omitempty"`
	Status     *TermsOfServiceStatusEnum  `json:"status,omitempty"`
	Text       *string                    `json:"text,omitempty"`
	TosType    *TermsOfServiceTosTypeEnum `json:"tos_type,omitempty"`
	Type       *TermsOfServiceTypeEnum    `json:"type,omitempty"`
}
