import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostUsersQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}

export enum PostUsersRequestBodyRoleEnum {
    Coadmin = "coadmin",
    User = "user"
}

export enum PostUsersRequestBodyStatusEnum {
    Active = "active",
    Inactive = "inactive",
    CannotDeleteEdit = "cannot_delete_edit",
    CannotDeleteEditUpload = "cannot_delete_edit_upload"
}


export class PostUsersRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=address" })
  address?: string;

  @SpeakeasyMetadata({ data: "json, name=can_see_managed_users" })
  canSeeManagedUsers?: boolean;

  @SpeakeasyMetadata({ data: "json, name=external_app_user_id" })
  externalAppUserId?: string;

  @SpeakeasyMetadata({ data: "json, name=is_exempt_from_device_limits" })
  isExemptFromDeviceLimits?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_exempt_from_login_verification" })
  isExemptFromLoginVerification?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_external_collab_restricted" })
  isExternalCollabRestricted?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_platform_access_only" })
  isPlatformAccessOnly?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_sync_enabled" })
  isSyncEnabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=job_title" })
  jobTitle?: string;

  @SpeakeasyMetadata({ data: "json, name=language" })
  language?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=phone" })
  phone?: string;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role?: PostUsersRequestBodyRoleEnum;

  @SpeakeasyMetadata({ data: "json, name=space_amount" })
  spaceAmount?: number;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: PostUsersRequestBodyStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=timezone" })
  timezone?: string;

  @SpeakeasyMetadata({ data: "json, name=tracking_codes", elemType: shared.TrackingCode })
  trackingCodes?: shared.TrackingCode[];
}


export class PostUsersRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: PostUsersQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostUsersRequestBody;
}


export class PostUsersResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  user?: shared.User;
}
