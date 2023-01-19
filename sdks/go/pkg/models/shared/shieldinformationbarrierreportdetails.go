package shared

type ShieldInformationBarrierReportDetailsDetails struct {
	FolderID *string `json:"folder_id,omitempty"`
}

// ShieldInformationBarrierReportDetails
// Indicates which folder the report
// file is located and any errors when generating the report.
type ShieldInformationBarrierReportDetails struct {
	Details *ShieldInformationBarrierReportDetailsDetails `json:"details,omitempty"`
}
