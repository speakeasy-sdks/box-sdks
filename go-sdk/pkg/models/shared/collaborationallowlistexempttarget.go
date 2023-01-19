package shared

import (
	"time"
)

type CollaborationAllowlistExemptTargetEnterpriseTypeEnum string

const (
	CollaborationAllowlistExemptTargetEnterpriseTypeEnumEnterprise CollaborationAllowlistExemptTargetEnterpriseTypeEnum = "enterprise"
)

// CollaborationAllowlistExemptTargetEnterprise
// A representation of a Box enterprise
type CollaborationAllowlistExemptTargetEnterprise struct {
	ID   *string                                               `json:"id,omitempty"`
	Name *string                                               `json:"name,omitempty"`
	Type *CollaborationAllowlistExemptTargetEnterpriseTypeEnum `json:"type,omitempty"`
}

type CollaborationAllowlistExemptTargetTypeEnum string

const (
	CollaborationAllowlistExemptTargetTypeEnumCollaborationWhitelist CollaborationAllowlistExemptTargetTypeEnum = "collaboration_whitelist"
)

// CollaborationAllowlistExemptTarget
// The user that is exempt from any of the restrictions
// imposed by the list of allowed collaboration domains for this enterprise.
type CollaborationAllowlistExemptTarget struct {
	CreatedAt  *time.Time                                    `json:"created_at,omitempty"`
	Enterprise *CollaborationAllowlistExemptTargetEnterprise `json:"enterprise,omitempty"`
	ID         *string                                       `json:"id,omitempty"`
	ModifiedAt *time.Time                                    `json:"modified_at,omitempty"`
	Type       *CollaborationAllowlistExemptTargetTypeEnum   `json:"type,omitempty"`
	User       *CollaborationAllowlistExemptTargetEnterprise `json:"user,omitempty"`
}
