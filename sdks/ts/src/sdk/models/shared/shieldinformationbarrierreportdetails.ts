import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



export class ShieldInformationBarrierReportDetailsDetails extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=folder_id" })
  folderId?: string;
}


// ShieldInformationBarrierReportDetails
/** 
 * Indicates which folder the report
 * file is located and any errors when generating the report.
**/
export class ShieldInformationBarrierReportDetails extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=details" })
  details?: ShieldInformationBarrierReportDetailsDetails;
}
