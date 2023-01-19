import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// UserNotificationEmail
/** 
 * An alternate notification email address to which email
 * notifications are sent. When it's confirmed, this will be
 * the email address to which notifications are sent instead of
 * to the primary email address.
**/
export class UserNotificationEmail extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=email" })
  email?: string;

  @SpeakeasyMetadata({ data: "json, name=is_confirmed" })
  isConfirmed?: boolean;
}

export enum UserStatusEnum {
    Active = "active",
    Inactive = "inactive",
    CannotDeleteEdit = "cannot_delete_edit",
    CannotDeleteEditUpload = "cannot_delete_edit_upload"
}

export enum UserTypeEnum {
    User = "user"
}


// User
/** 
 * A mini representation of a user, used when
 * nested within another resource.
**/
export class User extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=address" })
  address?: string;

  @SpeakeasyMetadata({ data: "json, name=avatar_url" })
  avatarUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=job_title" })
  jobTitle?: string;

  @SpeakeasyMetadata({ data: "json, name=language" })
  language?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=max_upload_size" })
  maxUploadSize?: number;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=notification_email" })
  notificationEmail?: UserNotificationEmail;

  @SpeakeasyMetadata({ data: "json, name=phone" })
  phone?: string;

  @SpeakeasyMetadata({ data: "json, name=space_amount" })
  spaceAmount?: number;

  @SpeakeasyMetadata({ data: "json, name=space_used" })
  spaceUsed?: number;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: UserStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=timezone" })
  timezone?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: UserTypeEnum;
}
