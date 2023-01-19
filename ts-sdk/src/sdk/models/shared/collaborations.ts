import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { Collaboration } from "./collaboration";


export enum CollaborationsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// CollaborationsOrder
/** 
 * The order in which a pagination is ordered
**/
export class CollaborationsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: CollaborationsOrderDirectionEnum;
}


// Collaborations
/** 
 * The part of an API response that describes pagination
**/
export class Collaborations extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: Collaboration })
  entries?: Collaboration[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: CollaborationsOrder })
  order?: CollaborationsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
