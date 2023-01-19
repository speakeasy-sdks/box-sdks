import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetTermsOfServiceUserStatusesQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=tos_id" })
  tosId: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=user_id" })
  userId?: string;
}


export class GetTermsOfServiceUserStatusesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetTermsOfServiceUserStatusesQueryParams;
}


export class GetTermsOfServiceUserStatusesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  termsOfServiceUserStatuses?: shared.TermsOfServiceUserStatuses;
}
