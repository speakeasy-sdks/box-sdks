package shared

import (
	"time"
)

type CollaborationAllowlistEntryDirectionEnum string

const (
	CollaborationAllowlistEntryDirectionEnumInbound  CollaborationAllowlistEntryDirectionEnum = "inbound"
	CollaborationAllowlistEntryDirectionEnumOutbound CollaborationAllowlistEntryDirectionEnum = "outbound"
	CollaborationAllowlistEntryDirectionEnumBoth     CollaborationAllowlistEntryDirectionEnum = "both"
)

type CollaborationAllowlistEntryEnterpriseTypeEnum string

const (
	CollaborationAllowlistEntryEnterpriseTypeEnumEnterprise CollaborationAllowlistEntryEnterpriseTypeEnum = "enterprise"
)

// CollaborationAllowlistEntryEnterprise
// A representation of a Box enterprise
type CollaborationAllowlistEntryEnterprise struct {
	ID   *string                                        `json:"id,omitempty"`
	Name *string                                        `json:"name,omitempty"`
	Type *CollaborationAllowlistEntryEnterpriseTypeEnum `json:"type,omitempty"`
}

type CollaborationAllowlistEntryTypeEnum string

const (
	CollaborationAllowlistEntryTypeEnumCollaborationWhitelistEntry CollaborationAllowlistEntryTypeEnum = "collaboration_whitelist_entry"
)

// CollaborationAllowlistEntry
// An entry that describes an approved domain for which users can collaborate
// with files and folders in your enterprise or vice versa.
type CollaborationAllowlistEntry struct {
	CreatedAt  *time.Time                                `json:"created_at,omitempty"`
	Direction  *CollaborationAllowlistEntryDirectionEnum `json:"direction,omitempty"`
	Domain     *string                                   `json:"domain,omitempty"`
	Enterprise *CollaborationAllowlistEntryEnterprise    `json:"enterprise,omitempty"`
	ID         *string                                   `json:"id,omitempty"`
	Type       *CollaborationAllowlistEntryTypeEnum      `json:"type,omitempty"`
}
