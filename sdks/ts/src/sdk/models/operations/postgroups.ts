import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostGroupsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}

export enum PostGroupsRequestBodyInvitabilityLevelEnum {
    AdminsOnly = "admins_only",
    AdminsAndMembers = "admins_and_members",
    AllManagedUsers = "all_managed_users"
}

export enum PostGroupsRequestBodyMemberViewabilityLevelEnum {
    AdminsOnly = "admins_only",
    AdminsAndMembers = "admins_and_members",
    AllManagedUsers = "all_managed_users"
}


export class PostGroupsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=external_sync_identifier" })
  externalSyncIdentifier?: string;

  @SpeakeasyMetadata({ data: "json, name=invitability_level" })
  invitabilityLevel?: PostGroupsRequestBodyInvitabilityLevelEnum;

  @SpeakeasyMetadata({ data: "json, name=member_viewability_level" })
  memberViewabilityLevel?: PostGroupsRequestBodyMemberViewabilityLevelEnum;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=provenance" })
  provenance?: string;
}


export class PostGroupsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: PostGroupsQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostGroupsRequestBody;
}


export class PostGroupsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  group?: shared.Group;

  @SpeakeasyMetadata()
  statusCode: number;
}
