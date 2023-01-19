package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PutRetentionPoliciesIDPathParams struct {
	RetentionPolicyID string `pathParam:"style=simple,explode=false,name=retention_policy_id"`
}

type PutRetentionPoliciesIDRequestBodyDispositionActionEnum string

const (
	PutRetentionPoliciesIDRequestBodyDispositionActionEnumPermanentlyDelete PutRetentionPoliciesIDRequestBodyDispositionActionEnum = "permanently_delete"
	PutRetentionPoliciesIDRequestBodyDispositionActionEnumRemoveRetention   PutRetentionPoliciesIDRequestBodyDispositionActionEnum = "remove_retention"
)

type PutRetentionPoliciesIDRequestBody struct {
	AreOwnersNotified            *bool                                                   `json:"are_owners_notified,omitempty"`
	CanOwnerExtendRetention      *bool                                                   `json:"can_owner_extend_retention,omitempty"`
	CustomNotificationRecipients []shared.UserMini                                       `json:"custom_notification_recipients,omitempty"`
	Description                  *string                                                 `json:"description,omitempty"`
	DispositionAction            *PutRetentionPoliciesIDRequestBodyDispositionActionEnum `json:"disposition_action,omitempty"`
	PolicyName                   *string                                                 `json:"policy_name,omitempty"`
	RetentionLength              *string                                                 `json:"retention_length,omitempty"`
	RetentionType                *string                                                 `json:"retention_type,omitempty"`
	Status                       *string                                                 `json:"status,omitempty"`
}

type PutRetentionPoliciesIDRequest struct {
	Retries    *utils.RetryConfig
	PathParams PutRetentionPoliciesIDPathParams
	Request    *PutRetentionPoliciesIDRequestBody `request:"mediaType=application/json"`
}

type PutRetentionPoliciesIDResponse struct {
	ClientError     *shared.ClientError
	ContentType     string
	RetentionPolicy *shared.RetentionPolicy
	StatusCode      int64
}
