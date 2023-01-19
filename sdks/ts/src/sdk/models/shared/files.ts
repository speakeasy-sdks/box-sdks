import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { File } from "./file";



// Files
/** 
 * A list of files
**/
export class Files extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: File })
  entries?: File[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
