import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum GroupMiniGroupTypeEnum {
    ManagedGroup = "managed_group",
    AllUsersGroup = "all_users_group"
}

export enum GroupMiniTypeEnum {
    Group = "group"
}


// GroupMini
/** 
 * A base representation of a group.
**/
export class GroupMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=group_type" })
  groupType?: GroupMiniGroupTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: GroupMiniTypeEnum;
}
