import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { GroupMini } from "./groupmini";
import { UserMini } from "./usermini";


export enum GroupMembershipRoleEnum {
    Member = "member",
    Admin = "admin"
}

export enum GroupMembershipTypeEnum {
    GroupMembership = "group_membership"
}


// GroupMembership
/** 
 * Membership is used to signify that a user is part of a
 * group.
**/
export class GroupMembership extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=group" })
  group?: GroupMini;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role?: GroupMembershipRoleEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: GroupMembershipTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user?: UserMini;
}
