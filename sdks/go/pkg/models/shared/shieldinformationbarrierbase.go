package shared

type ShieldInformationBarrierBaseTypeEnum string

const (
	ShieldInformationBarrierBaseTypeEnumShieldInformationBarrier ShieldInformationBarrierBaseTypeEnum = "shield_information_barrier"
)

// ShieldInformationBarrierBase
// A base representation of a
// shield information barrier object
type ShieldInformationBarrierBase struct {
	ID   *string                               `json:"id,omitempty"`
	Type *ShieldInformationBarrierBaseTypeEnum `json:"type,omitempty"`
}
