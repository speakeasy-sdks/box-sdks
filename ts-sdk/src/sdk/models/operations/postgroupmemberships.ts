import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostGroupMembershipsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


// PostGroupMembershipsRequestBodyGroup
/** 
 * The group to add the user to.
**/
export class PostGroupMembershipsRequestBodyGroup extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}

export enum PostGroupMembershipsRequestBodyRoleEnum {
    Member = "member",
    Admin = "admin"
}


// PostGroupMembershipsRequestBodyUser
/** 
 * The user to add to the group.
**/
export class PostGroupMembershipsRequestBodyUser extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}


export class PostGroupMembershipsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=configurable_permissions" })
  configurablePermissions?: Record<string, boolean>;

  @SpeakeasyMetadata({ data: "json, name=group" })
  group: PostGroupMembershipsRequestBodyGroup;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role?: PostGroupMembershipsRequestBodyRoleEnum;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user: PostGroupMembershipsRequestBodyUser;
}


export class PostGroupMembershipsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: PostGroupMembershipsQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostGroupMembershipsRequestBody;
}


export class PostGroupMembershipsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  groupMembership?: shared.GroupMembership;

  @SpeakeasyMetadata()
  statusCode: number;
}
