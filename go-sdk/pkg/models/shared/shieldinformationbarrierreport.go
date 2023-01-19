package shared

import (
	"time"
)

type ShieldInformationBarrierReportStatusEnum string

const (
	ShieldInformationBarrierReportStatusEnumPending   ShieldInformationBarrierReportStatusEnum = "pending"
	ShieldInformationBarrierReportStatusEnumError     ShieldInformationBarrierReportStatusEnum = "error"
	ShieldInformationBarrierReportStatusEnumDone      ShieldInformationBarrierReportStatusEnum = "done"
	ShieldInformationBarrierReportStatusEnumCancelled ShieldInformationBarrierReportStatusEnum = "cancelled"
)

type ShieldInformationBarrierReportTypeEnum string

const (
	ShieldInformationBarrierReportTypeEnumShieldInformationBarrierReport ShieldInformationBarrierReportTypeEnum = "shield_information_barrier_report"
)

// ShieldInformationBarrierReport
// A base representation of a
// shield information barrier report object
type ShieldInformationBarrierReport struct {
	CreatedAt                *time.Time                                `json:"created_at,omitempty"`
	CreatedBy                *UserBase                                 `json:"created_by,omitempty"`
	Details                  *ShieldInformationBarrierReportDetails    `json:"details,omitempty"`
	ID                       *string                                   `json:"id,omitempty"`
	ShieldInformationBarrier *ShieldInformationBarrierReference        `json:"shield_information_barrier,omitempty"`
	Status                   *ShieldInformationBarrierReportStatusEnum `json:"status,omitempty"`
	Type                     *ShieldInformationBarrierReportTypeEnum   `json:"type,omitempty"`
	UpdatedAt                *time.Time                                `json:"updated_at,omitempty"`
}
