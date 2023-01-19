package shared

import (
	"time"
)

// CommentReference
// The bare basic reference for an object
type CommentReference struct {
	ID   *string `json:"id,omitempty"`
	Type *string `json:"type,omitempty"`
}

type CommentTypeEnum string

const (
	CommentTypeEnumComment CommentTypeEnum = "comment"
)

// Comment
// Base representation of a comment.
type Comment struct {
	CreatedAt      *time.Time        `json:"created_at,omitempty"`
	CreatedBy      *UserMini         `json:"created_by,omitempty"`
	ID             *string           `json:"id,omitempty"`
	IsReplyComment *bool             `json:"is_reply_comment,omitempty"`
	Item           *CommentReference `json:"item,omitempty"`
	Message        *string           `json:"message,omitempty"`
	ModifiedAt     *time.Time        `json:"modified_at,omitempty"`
	Type           *CommentTypeEnum  `json:"type,omitempty"`
}
