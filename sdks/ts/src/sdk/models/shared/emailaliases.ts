import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { EmailAlias } from "./emailalias";



// EmailAliases
/** 
 * A list of email aliases
**/
export class EmailAliases extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: EmailAlias })
  entries?: EmailAlias[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
