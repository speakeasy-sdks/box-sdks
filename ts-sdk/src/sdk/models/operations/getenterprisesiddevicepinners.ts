import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetEnterprisesIdDevicePinnersPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=enterprise_id" })
  enterpriseId: string;
}

export enum GetEnterprisesIdDevicePinnersDirectionEnum {
    Asc = "ASC",
    Desc = "DESC"
}


export class GetEnterprisesIdDevicePinnersQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=direction" })
  direction?: GetEnterprisesIdDevicePinnersDirectionEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;
}


export class GetEnterprisesIdDevicePinnersRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetEnterprisesIdDevicePinnersPathParams;

  @SpeakeasyMetadata()
  queryParams: GetEnterprisesIdDevicePinnersQueryParams;
}


export class GetEnterprisesIdDevicePinnersResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  devicePinners?: shared.DevicePinners;

  @SpeakeasyMetadata()
  statusCode: number;
}
