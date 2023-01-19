import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { TermsOfServiceUserStatus } from "./termsofserviceuserstatus";



// TermsOfServiceUserStatuses
/** 
 * A list of terms of service user statuses
**/
export class TermsOfServiceUserStatuses extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: TermsOfServiceUserStatus })
  entries?: TermsOfServiceUserStatus[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
