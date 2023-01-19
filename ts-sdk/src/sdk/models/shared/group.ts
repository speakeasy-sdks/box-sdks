import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum GroupGroupTypeEnum {
    ManagedGroup = "managed_group",
    AllUsersGroup = "all_users_group"
}

export enum GroupTypeEnum {
    Group = "group"
}


// Group
/** 
 * A base representation of a group.
**/
export class Group extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=group_type" })
  groupType?: GroupGroupTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: GroupTypeEnum;
}
