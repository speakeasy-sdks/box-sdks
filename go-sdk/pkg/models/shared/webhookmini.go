package shared

type WebhookMiniTargetTypeEnum string

const (
	WebhookMiniTargetTypeEnumFile   WebhookMiniTargetTypeEnum = "file"
	WebhookMiniTargetTypeEnumFolder WebhookMiniTargetTypeEnum = "folder"
)

// WebhookMiniTarget
// The item that will trigger the webhook
type WebhookMiniTarget struct {
	ID   *string                    `json:"id,omitempty"`
	Type *WebhookMiniTargetTypeEnum `json:"type,omitempty"`
}

type WebhookMiniTypeEnum string

const (
	WebhookMiniTypeEnumWebhook WebhookMiniTypeEnum = "webhook"
)

// WebhookMini
// Represents a configured webhook.
type WebhookMini struct {
	ID     *string              `json:"id,omitempty"`
	Target *WebhookMiniTarget   `json:"target,omitempty"`
	Type   *WebhookMiniTypeEnum `json:"type,omitempty"`
}
