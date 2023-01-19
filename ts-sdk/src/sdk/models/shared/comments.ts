import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { Comment } from "./comment";


export enum CommentsOrderDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


// CommentsOrder
/** 
 * The order in which a pagination is ordered
**/
export class CommentsOrder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=by" })
  by?: string;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: CommentsOrderDirectionEnum;
}


// Comments
/** 
 * The part of an API response that describes pagination
**/
export class Comments extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=entries", elemType: Comment })
  entries?: Comment[];

  @SpeakeasyMetadata({ data: "json, name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=order", elemType: CommentsOrder })
  order?: CommentsOrder[];

  @SpeakeasyMetadata({ data: "json, name=total_count" })
  totalCount?: number;
}
