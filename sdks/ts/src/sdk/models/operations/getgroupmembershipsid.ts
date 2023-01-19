import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetGroupMembershipsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=group_membership_id" })
  groupMembershipId: string;
}


export class GetGroupMembershipsIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class GetGroupMembershipsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetGroupMembershipsIdPathParams;

  @SpeakeasyMetadata()
  queryParams: GetGroupMembershipsIdQueryParams;
}


export class GetGroupMembershipsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  groupMembership?: shared.GroupMembership;

  @SpeakeasyMetadata()
  statusCode: number;
}
