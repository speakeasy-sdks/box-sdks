import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetTermsOfServicesTosTypeEnum {
    External = "external",
    Managed = "managed"
}


export class GetTermsOfServicesQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=tos_type" })
  tosType?: GetTermsOfServicesTosTypeEnum;
}


export class GetTermsOfServicesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetTermsOfServicesQueryParams;
}


export class GetTermsOfServicesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  termsOfServices?: shared.TermsOfServices;
}
