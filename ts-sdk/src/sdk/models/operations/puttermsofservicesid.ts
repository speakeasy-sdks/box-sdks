import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutTermsOfServicesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=terms_of_service_id" })
  termsOfServiceId: string;
}

export enum PutTermsOfServicesIdRequestBodyStatusEnum {
    Enabled = "enabled",
    Disabled = "disabled"
}


export class PutTermsOfServicesIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=status" })
  status: PutTermsOfServicesIdRequestBodyStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=text" })
  text: string;
}


export class PutTermsOfServicesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutTermsOfServicesIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutTermsOfServicesIdRequestBody;
}


export class PutTermsOfServicesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  termsOfService?: shared.TermsOfService;
}
