import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { TermsOfService } from "./termsofservice";



// TermsOfServices
/** 
 * A list of terms of services
**/
export class TermsOfServices extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: TermsOfService })
  entries?: TermsOfService[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
