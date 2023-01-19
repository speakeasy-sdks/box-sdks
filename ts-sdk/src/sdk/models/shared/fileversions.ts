import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileVersion } from "./fileversion";


export enum FileVersionsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// FileVersionsOrder
/** 
 * The order in which a pagination is ordered
**/
export class FileVersionsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: FileVersionsOrderDirectionEnum;
}


// FileVersions
/** 
 * The part of an API response that describes pagination
**/
export class FileVersions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: FileVersion })
  entries?: FileVersion[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: FileVersionsOrder })
  order?: FileVersionsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
