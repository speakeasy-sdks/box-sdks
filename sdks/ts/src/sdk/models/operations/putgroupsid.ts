import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutGroupsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=group_id" })
  groupId: string;
}


export class PutGroupsIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}

export enum PutGroupsIdRequestBodyInvitabilityLevelEnum {
    AdminsOnly = "admins_only",
    AdminsAndMembers = "admins_and_members",
    AllManagedUsers = "all_managed_users"
}

export enum PutGroupsIdRequestBodyMemberViewabilityLevelEnum {
    AdminsOnly = "admins_only",
    AdminsAndMembers = "admins_and_members",
    AllManagedUsers = "all_managed_users"
}


export class PutGroupsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=external_sync_identifier" })
  externalSyncIdentifier?: string;

  @SpeakeasyMetadata({ data: "json, name=invitability_level" })
  invitabilityLevel?: PutGroupsIdRequestBodyInvitabilityLevelEnum;

  @SpeakeasyMetadata({ data: "json, name=member_viewability_level" })
  memberViewabilityLevel?: PutGroupsIdRequestBodyMemberViewabilityLevelEnum;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=provenance" })
  provenance?: string;
}


export class PutGroupsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutGroupsIdPathParams;

  @SpeakeasyMetadata()
  queryParams: PutGroupsIdQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutGroupsIdRequestBody;
}


export class PutGroupsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  group?: shared.Group;

  @SpeakeasyMetadata()
  statusCode: number;
}
