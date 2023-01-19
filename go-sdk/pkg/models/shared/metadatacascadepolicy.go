package shared

type MetadataCascadePolicyOwnerEnterpriseTypeEnum string

const (
	MetadataCascadePolicyOwnerEnterpriseTypeEnumEnterprise MetadataCascadePolicyOwnerEnterpriseTypeEnum = "enterprise"
)

// MetadataCascadePolicyOwnerEnterprise
// The enterprise that owns this policy.
type MetadataCascadePolicyOwnerEnterprise struct {
	ID   *string                                       `json:"id,omitempty"`
	Type *MetadataCascadePolicyOwnerEnterpriseTypeEnum `json:"type,omitempty"`
}

type MetadataCascadePolicyParentTypeEnum string

const (
	MetadataCascadePolicyParentTypeEnumFolder MetadataCascadePolicyParentTypeEnum = "folder"
)

// MetadataCascadePolicyParent
// Represent the folder the policy is applied to.
type MetadataCascadePolicyParent struct {
	ID   *string                              `json:"id,omitempty"`
	Type *MetadataCascadePolicyParentTypeEnum `json:"type,omitempty"`
}

type MetadataCascadePolicyScopeEnum string

const (
	MetadataCascadePolicyScopeEnumGlobal             MetadataCascadePolicyScopeEnum = "global"
	MetadataCascadePolicyScopeEnumEnterpriseWildcard MetadataCascadePolicyScopeEnum = "enterprise_*"
)

type MetadataCascadePolicyTypeEnum string

const (
	MetadataCascadePolicyTypeEnumMetadataCascadePolicy MetadataCascadePolicyTypeEnum = "metadata_cascade_policy"
)

// MetadataCascadePolicy
// A metadata cascade policy automatically applies a metadata template instance
// to all the files and folders within the targeted folder.
type MetadataCascadePolicy struct {
	ID              *string                               `json:"id,omitempty"`
	OwnerEnterprise *MetadataCascadePolicyOwnerEnterprise `json:"owner_enterprise,omitempty"`
	Parent          *MetadataCascadePolicyParent          `json:"parent,omitempty"`
	Scope           *MetadataCascadePolicyScopeEnum       `json:"scope,omitempty"`
	TemplateKey     *string                               `json:"templateKey,omitempty"`
	Type            *MetadataCascadePolicyTypeEnum        `json:"type,omitempty"`
}
