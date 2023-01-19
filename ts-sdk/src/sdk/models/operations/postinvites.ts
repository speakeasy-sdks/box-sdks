import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostInvitesQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


// PostInvitesRequestBodyActionableBy
/** 
 * The user to invite
**/
export class PostInvitesRequestBodyActionableBy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=login" })
  login?: string;
}


// PostInvitesRequestBodyEnterprise
/** 
 * The enterprise to invite the user to
**/
export class PostInvitesRequestBodyEnterprise extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}


export class PostInvitesRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=actionable_by" })
  actionableBy: PostInvitesRequestBodyActionableBy;

  @SpeakeasyMetadata({ data: "json, name=enterprise" })
  enterprise: PostInvitesRequestBodyEnterprise;
}


export class PostInvitesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: PostInvitesQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostInvitesRequestBody;
}


export class PostInvitesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  invite?: shared.Invite;

  @SpeakeasyMetadata()
  statusCode: number;
}
