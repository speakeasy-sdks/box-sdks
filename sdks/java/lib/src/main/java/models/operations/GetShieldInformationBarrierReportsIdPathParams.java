package .models.operations;

import .utils.SpeakeasyMetadata;

public class GetShieldInformationBarrierReportsIdPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=shield_information_barrier_report_id")
    public String shieldInformationBarrierReportId;
    public GetShieldInformationBarrierReportsIdPathParams withShieldInformationBarrierReportId(String shieldInformationBarrierReportId) {
        this.shieldInformationBarrierReportId = shieldInformationBarrierReportId;
        return this;
    }
}