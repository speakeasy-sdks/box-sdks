import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum {
    TermsOfService = "terms_of_service"
}


// PostTermsOfServiceUserStatusesRequestBodyTos
/** 
 * The terms of service to set the status for.
**/
export class PostTermsOfServiceUserStatusesRequestBodyTos extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostTermsOfServiceUserStatusesRequestBodyTosTypeEnum;
}

export enum PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum {
    User = "user"
}


// PostTermsOfServiceUserStatusesRequestBodyUser
/** 
 * The user to set the status for.
**/
export class PostTermsOfServiceUserStatusesRequestBodyUser extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostTermsOfServiceUserStatusesRequestBodyUserTypeEnum;
}


export class PostTermsOfServiceUserStatusesRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=is_accepted" })
  isAccepted: boolean;

  @SpeakeasyMetadata({ data: "json, name=tos" })
  tos: PostTermsOfServiceUserStatusesRequestBodyTos;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user: PostTermsOfServiceUserStatusesRequestBodyUser;
}


export class PostTermsOfServiceUserStatusesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostTermsOfServiceUserStatusesRequestBody;
}


export class PostTermsOfServiceUserStatusesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  termsOfServiceUserStatus?: shared.TermsOfServiceUserStatus;
}
