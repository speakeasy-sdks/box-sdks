import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutTermsOfServiceUserStatusesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=terms_of_service_user_status_id" })
  termsOfServiceUserStatusId: string;
}


export class PutTermsOfServiceUserStatusesIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=is_accepted" })
  isAccepted: boolean;
}


export class PutTermsOfServiceUserStatusesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutTermsOfServiceUserStatusesIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutTermsOfServiceUserStatusesIdRequestBody;
}


export class PutTermsOfServiceUserStatusesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  termsOfServiceUserStatus?: shared.TermsOfServiceUserStatus;
}
