import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { Collection } from "./collection";


export enum CollectionsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// CollectionsOrder
/** 
 * The order in which a pagination is ordered
**/
export class CollectionsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: CollectionsOrderDirectionEnum;
}


// Collections
/** 
 * The part of an API response that describes pagination
**/
export class Collections extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: Collection })
  entries?: Collection[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: CollectionsOrder })
  order?: CollectionsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
