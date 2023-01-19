import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileMini } from "./filemini";
import { FolderMini } from "./foldermini";
import { WebLinkMini } from "./weblinkmini";


export enum ItemsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// ItemsOrder
/** 
 * The order in which a pagination is ordered
**/
export class ItemsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: ItemsOrderDirectionEnum;
}


// Items
/** 
 * The part of an API response that describes pagination
**/
export class Items extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries" })
  entries?: any[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: ItemsOrder })
  order?: ItemsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
