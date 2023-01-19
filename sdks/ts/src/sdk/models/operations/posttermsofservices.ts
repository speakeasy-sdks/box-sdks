import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostTermsOfServicesRequestBodyStatusEnum {
    Enabled = "enabled",
    Disabled = "disabled"
}

export enum PostTermsOfServicesRequestBodyTosTypeEnum {
    External = "external",
    Managed = "managed"
}


export class PostTermsOfServicesRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=status" })
  status: PostTermsOfServicesRequestBodyStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=text" })
  text: string;

  @SpeakeasyMetadata({ data: "json, name=tos_type" })
  tosType?: PostTermsOfServicesRequestBodyTosTypeEnum;
}


export class PostTermsOfServicesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostTermsOfServicesRequestBody;
}


export class PostTermsOfServicesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  task?: shared.Task;
}
