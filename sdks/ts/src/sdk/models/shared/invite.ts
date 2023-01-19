import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UserMini } from "./usermini";


export enum InviteEnterpriseTypeEnum {
    Enterprise = "enterprise"
}


// InviteEnterprise
/** 
 * A representation of a Box enterprise
**/
export class InviteEnterprise extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: InviteEnterpriseTypeEnum;
}

export enum InviteTypeEnum {
    Invite = "invite"
}


// Invite
/** 
 * An invite for a user to an enterprise.
**/
export class Invite extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=actionable_by" })
  actionableBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=invited_by" })
  invitedBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=invited_to" })
  invitedTo?: InviteEnterprise;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: InviteTypeEnum;
}
