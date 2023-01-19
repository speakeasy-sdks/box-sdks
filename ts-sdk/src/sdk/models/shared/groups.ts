import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { GroupMini } from "./groupmini";


export enum GroupsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// GroupsOrder
/** 
 * The order in which a pagination is ordered
**/
export class GroupsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: GroupsOrderDirectionEnum;
}


// Groups
/** 
 * The part of an API response that describes pagination
**/
export class Groups extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: GroupMini })
  entries?: GroupMini[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: GroupsOrder })
  order?: GroupsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
