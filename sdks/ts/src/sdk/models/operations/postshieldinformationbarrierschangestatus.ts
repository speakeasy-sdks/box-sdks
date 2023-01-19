import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum {
    Pending = "pending",
    Disabled = "disabled"
}


export class PostShieldInformationBarriersChangeStatusRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status: PostShieldInformationBarriersChangeStatusRequestBodyStatusEnum;
}


export class PostShieldInformationBarriersChangeStatusRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostShieldInformationBarriersChangeStatusRequestBody;
}


export class PostShieldInformationBarriersChangeStatusResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  shieldInformationBarrier?: shared.ShieldInformationBarrier;

  @SpeakeasyMetadata()
  statusCode: number;
}
