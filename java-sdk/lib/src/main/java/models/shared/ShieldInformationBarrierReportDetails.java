package .models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * ShieldInformationBarrierReportDetails
 * Indicates which folder the report
 * file is located and any errors when generating the report.
**/
public class ShieldInformationBarrierReportDetails {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public ShieldInformationBarrierReportDetailsDetails details;
    public ShieldInformationBarrierReportDetails withDetails(ShieldInformationBarrierReportDetailsDetails details) {
        this.details = details;
        return this;
    }
}