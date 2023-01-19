package shared

import (
	"time"
)

// FolderLockLockedOperations
// The operations that have been locked. Currently the `move`
// and `delete` operations cannot be locked separately, and both need to be
// set to `true`.
type FolderLockLockedOperations struct {
	Delete bool `json:"delete"`
	Move   bool `json:"move"`
}

// FolderLock
// Folder locks define access restrictions placed by folder owners
// to prevent specific folders from being moved or deleted.
type FolderLock struct {
	CreatedAt        *time.Time                  `json:"created_at,omitempty"`
	CreatedBy        *UserBase                   `json:"created_by,omitempty"`
	Folder           *FolderMini                 `json:"folder,omitempty"`
	ID               *string                     `json:"id,omitempty"`
	LockType         *string                     `json:"lock_type,omitempty"`
	LockedOperations *FolderLockLockedOperations `json:"locked_operations,omitempty"`
	Type             *string                     `json:"type,omitempty"`
}
