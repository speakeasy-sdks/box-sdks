package shared

type StoragePolicyMiniTypeEnum string

const (
	StoragePolicyMiniTypeEnumStoragePolicy StoragePolicyMiniTypeEnum = "storage_policy"
)

// StoragePolicyMini
// A mini description of a Storage Policy object
type StoragePolicyMini struct {
	ID   *string                    `json:"id,omitempty"`
	Type *StoragePolicyMiniTypeEnum `json:"type,omitempty"`
}
