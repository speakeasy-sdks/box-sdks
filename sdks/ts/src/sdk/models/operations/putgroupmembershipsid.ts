import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutGroupMembershipsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=group_membership_id" })
  groupMembershipId: string;
}


export class PutGroupMembershipsIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}

export enum PutGroupMembershipsIdRequestBodyRoleEnum {
    Member = "member",
    Admin = "admin"
}


export class PutGroupMembershipsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=configurable_permissions" })
  configurablePermissions?: Record<string, boolean>;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role?: PutGroupMembershipsIdRequestBodyRoleEnum;
}


export class PutGroupMembershipsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutGroupMembershipsIdPathParams;

  @SpeakeasyMetadata()
  queryParams: PutGroupMembershipsIdQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutGroupMembershipsIdRequestBody;
}


export class PutGroupMembershipsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  groupMembership?: shared.GroupMembership;

  @SpeakeasyMetadata()
  statusCode: number;
}
