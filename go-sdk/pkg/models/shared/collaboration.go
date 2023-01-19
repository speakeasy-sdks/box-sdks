package shared

import (
	"time"
)

type CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement struct {
	EnterpriseHasStrongPasswordRequiredForExternalUsers *bool `json:"enterprise_has_strong_password_required_for_external_users,omitempty"`
	UserHasStrongPassword                               *bool `json:"user_has_strong_password,omitempty"`
}

type CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement struct {
	IsAccepted     *bool               `json:"is_accepted,omitempty"`
	TermsOfService *TermsOfServiceBase `json:"terms_of_service,omitempty"`
}

type CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement struct {
	EnterpriseHasTwoFactorAuthEnabled     *bool `json:"enterprise_has_two_factor_auth_enabled,omitempty"`
	UserHasTwoFactorAuthenticationEnabled *bool `json:"user_has_two_factor_authentication_enabled,omitempty"`
}

type CollaborationAcceptanceRequirementsStatus struct {
	StrongPasswordRequirement          *CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement          `json:"strong_password_requirement,omitempty"`
	TermsOfServiceRequirement          *CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement          `json:"terms_of_service_requirement,omitempty"`
	TwoFactorAuthenticationRequirement *CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement `json:"two_factor_authentication_requirement,omitempty"`
}

type CollaborationUserBaseTypeEnum string

const (
	CollaborationUserBaseTypeEnumUser CollaborationUserBaseTypeEnum = "user"
)

// CollaborationUserBase
// The user who created the collaboration object
type CollaborationUserBase struct {
	ID    *string                       `json:"id,omitempty"`
	Login string                        `json:"login"`
	Name  string                        `json:"name"`
	Type  CollaborationUserBaseTypeEnum `json:"type"`
}

type CollaborationRoleEnum string

const (
	CollaborationRoleEnumEditor            CollaborationRoleEnum = "editor"
	CollaborationRoleEnumViewer            CollaborationRoleEnum = "viewer"
	CollaborationRoleEnumPreviewer         CollaborationRoleEnum = "previewer"
	CollaborationRoleEnumUploader          CollaborationRoleEnum = "uploader"
	CollaborationRoleEnumPreviewerUploader CollaborationRoleEnum = "previewer uploader"
	CollaborationRoleEnumViewerUploader    CollaborationRoleEnum = "viewer uploader"
	CollaborationRoleEnumCoOwner           CollaborationRoleEnum = "co-owner"
	CollaborationRoleEnumOwner             CollaborationRoleEnum = "owner"
)

type CollaborationStatusEnum string

const (
	CollaborationStatusEnumAccepted CollaborationStatusEnum = "accepted"
	CollaborationStatusEnumPending  CollaborationStatusEnum = "pending"
	CollaborationStatusEnumRejected CollaborationStatusEnum = "rejected"
)

type CollaborationTypeEnum string

const (
	CollaborationTypeEnumCollaboration CollaborationTypeEnum = "collaboration"
)

// Collaboration
// Collaborations define access permissions for users and groups to files and
// folders, similar to access control lists. A collaboration object grants a
// user or group access to a file or folder with permissions defined by a
// specific role.
type Collaboration struct {
	AcceptanceRequirementsStatus *CollaborationAcceptanceRequirementsStatus `json:"acceptance_requirements_status,omitempty"`
	AccessibleBy                 *UserMini                                  `json:"accessible_by,omitempty"`
	AcknowledgedAt               *time.Time                                 `json:"acknowledged_at,omitempty"`
	CreatedAt                    *time.Time                                 `json:"created_at,omitempty"`
	CreatedBy                    *CollaborationUserBase                     `json:"created_by,omitempty"`
	ExpiresAt                    *time.Time                                 `json:"expires_at,omitempty"`
	ID                           *string                                    `json:"id,omitempty"`
	InviteEmail                  *string                                    `json:"invite_email,omitempty"`
	Item                         map[string]interface{}                     `json:"item,omitempty"`
	ModifiedAt                   *time.Time                                 `json:"modified_at,omitempty"`
	Role                         *CollaborationRoleEnum                     `json:"role,omitempty"`
	Status                       *CollaborationStatusEnum                   `json:"status,omitempty"`
	Type                         *CollaborationTypeEnum                     `json:"type,omitempty"`
}
