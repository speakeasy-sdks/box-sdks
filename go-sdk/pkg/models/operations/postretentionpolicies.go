package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostRetentionPoliciesRequestBodyDispositionActionEnum string

const (
	PostRetentionPoliciesRequestBodyDispositionActionEnumPermanentlyDelete PostRetentionPoliciesRequestBodyDispositionActionEnum = "permanently_delete"
	PostRetentionPoliciesRequestBodyDispositionActionEnumRemoveRetention   PostRetentionPoliciesRequestBodyDispositionActionEnum = "remove_retention"
)

type PostRetentionPoliciesRequestBodyPolicyTypeEnum string

const (
	PostRetentionPoliciesRequestBodyPolicyTypeEnumFinite     PostRetentionPoliciesRequestBodyPolicyTypeEnum = "finite"
	PostRetentionPoliciesRequestBodyPolicyTypeEnumIndefinite PostRetentionPoliciesRequestBodyPolicyTypeEnum = "indefinite"
)

type PostRetentionPoliciesRequestBodyRetentionTypeEnum string

const (
	PostRetentionPoliciesRequestBodyRetentionTypeEnumModifiable    PostRetentionPoliciesRequestBodyRetentionTypeEnum = "modifiable"
	PostRetentionPoliciesRequestBodyRetentionTypeEnumNonModifiable PostRetentionPoliciesRequestBodyRetentionTypeEnum = "non-modifiable"
)

type PostRetentionPoliciesRequestBody struct {
	AreOwnersNotified            *bool                                                 `json:"are_owners_notified,omitempty"`
	CanOwnerExtendRetention      *bool                                                 `json:"can_owner_extend_retention,omitempty"`
	CustomNotificationRecipients []shared.UserMini                                     `json:"custom_notification_recipients,omitempty"`
	Description                  *string                                               `json:"description,omitempty"`
	DispositionAction            PostRetentionPoliciesRequestBodyDispositionActionEnum `json:"disposition_action"`
	PolicyName                   string                                                `json:"policy_name"`
	PolicyType                   PostRetentionPoliciesRequestBodyPolicyTypeEnum        `json:"policy_type"`
	RetentionLength              *string                                               `json:"retention_length,omitempty"`
	RetentionType                *PostRetentionPoliciesRequestBodyRetentionTypeEnum    `json:"retention_type,omitempty"`
}

type PostRetentionPoliciesRequest struct {
	Retries *utils.RetryConfig
	Request *PostRetentionPoliciesRequestBody `request:"mediaType=application/json"`
}

type PostRetentionPoliciesResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	RetentionPolicy *shared.RetentionPolicy
	StatusCode      int64
}
