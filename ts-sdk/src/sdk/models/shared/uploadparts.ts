import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UploadPart } from "./uploadpart";


export enum UploadPartsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// UploadPartsOrder
/** 
 * The order in which a pagination is ordered
**/
export class UploadPartsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: UploadPartsOrderDirectionEnum;
}


// UploadParts
/** 
 * The part of an API response that describes pagination
**/
export class UploadParts extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: UploadPart })
  entries?: UploadPart[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: UploadPartsOrder })
  order?: UploadPartsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
