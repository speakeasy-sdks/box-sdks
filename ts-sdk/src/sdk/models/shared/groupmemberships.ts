import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { GroupMembership } from "./groupmembership";


export enum GroupMembershipsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// GroupMembershipsOrder
/** 
 * The order in which a pagination is ordered
**/
export class GroupMembershipsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: GroupMembershipsOrderDirectionEnum;
}


// GroupMemberships
/** 
 * The part of an API response that describes pagination
**/
export class GroupMemberships extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: GroupMembership })
  entries?: GroupMembership[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: GroupMembershipsOrder })
  order?: GroupMembershipsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
