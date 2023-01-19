import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { User } from "./user";


export enum UsersOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// UsersOrder
/** 
 * The order in which a pagination is ordered
**/
export class UsersOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: UsersOrderDirectionEnum;
}


// Users
/** 
 * The part of an API response that describes pagination
**/
export class Users extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: User })
  entries?: User[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: UsersOrder })
  order?: UsersOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
