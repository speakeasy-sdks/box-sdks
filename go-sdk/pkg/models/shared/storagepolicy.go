package shared

type StoragePolicyTypeEnum string

const (
	StoragePolicyTypeEnumStoragePolicy StoragePolicyTypeEnum = "storage_policy"
)

// StoragePolicy
// A mini description of a Storage Policy object
type StoragePolicy struct {
	ID   *string                `json:"id,omitempty"`
	Name *string                `json:"name,omitempty"`
	Type *StoragePolicyTypeEnum `json:"type,omitempty"`
}
