import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutUsersIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=user_id" })
  userId: string;
}


export class PutUsersIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


// PutUsersIdRequestBodyNotificationEmail
/** 
 * An alternate notification email address to which email
 * notifications are sent. When it's confirmed, this will be
 * the email address to which notifications are sent instead of
 * to the primary email address.
 * 
 * Set this value to `null` to remove the notification email.
**/
export class PutUsersIdRequestBodyNotificationEmail extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=email" })
  email?: string;
}

export enum PutUsersIdRequestBodyRoleEnum {
    Coadmin = "coadmin",
    User = "user"
}

export enum PutUsersIdRequestBodyStatusEnum {
    Active = "active",
    Inactive = "inactive",
    CannotDeleteEdit = "cannot_delete_edit",
    CannotDeleteEditUpload = "cannot_delete_edit_upload"
}


export class PutUsersIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=address" })
  address?: string;

  @SpeakeasyMetadata({ data: "json, name=can_see_managed_users" })
  canSeeManagedUsers?: boolean;

  @SpeakeasyMetadata({ data: "json, name=enterprise" })
  enterprise?: string;

  @SpeakeasyMetadata({ data: "json, name=external_app_user_id" })
  externalAppUserId?: string;

  @SpeakeasyMetadata({ data: "json, name=is_exempt_from_device_limits" })
  isExemptFromDeviceLimits?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_exempt_from_login_verification" })
  isExemptFromLoginVerification?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_external_collab_restricted" })
  isExternalCollabRestricted?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_password_reset_required" })
  isPasswordResetRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_sync_enabled" })
  isSyncEnabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=job_title" })
  jobTitle?: string;

  @SpeakeasyMetadata({ data: "json, name=language" })
  language?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=notification_email" })
  notificationEmail?: PutUsersIdRequestBodyNotificationEmail;

  @SpeakeasyMetadata({ data: "json, name=notify" })
  notify?: boolean;

  @SpeakeasyMetadata({ data: "json, name=phone" })
  phone?: string;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role?: PutUsersIdRequestBodyRoleEnum;

  @SpeakeasyMetadata({ data: "json, name=space_amount" })
  spaceAmount?: number;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: PutUsersIdRequestBodyStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=timezone" })
  timezone?: string;

  @SpeakeasyMetadata({ data: "json, name=tracking_codes", elemType: shared.TrackingCode })
  trackingCodes?: shared.TrackingCode[];
}


export class PutUsersIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutUsersIdPathParams;

  @SpeakeasyMetadata()
  queryParams: PutUsersIdQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutUsersIdRequestBody;
}


export class PutUsersIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  user?: shared.User;
}
