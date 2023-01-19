import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { File } from "./file";
import { Folder } from "./folder";
import { WebLink } from "./weblink";


export enum RecentItemInteractionTypeEnum {
    ItemPreview = "item_preview",
    ItemUpload = "item_upload",
    ItemComment = "item_comment",
    ItemOpen = "item_open",
    ItemModify = "item_modify"
}


// RecentItem
/** 
 * A recent item accessed by a user.
**/
export class RecentItem extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=interacted_at" })
  interactedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=interaction_shared_link" })
  interactionSharedLink?: string;

  @SpeakeasyMetadata({ data: "json, name=interaction_type" })
  interactionType?: RecentItemInteractionTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=item" })
  item?: any;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;
}
