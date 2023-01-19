import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetStoragePolicyAssignmentsResolvedForTypeEnum {
    User = "user",
    Enterprise = "enterprise"
}


export class GetStoragePolicyAssignmentsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=resolved_for_id" })
  resolvedForId: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=resolved_for_type" })
  resolvedForType: GetStoragePolicyAssignmentsResolvedForTypeEnum;
}


export class GetStoragePolicyAssignmentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetStoragePolicyAssignmentsQueryParams;
}


export class GetStoragePolicyAssignmentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  storagePolicyAssignments?: shared.StoragePolicyAssignments;
}
