import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutStoragePolicyAssignmentsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=storage_policy_assignment_id" })
  storagePolicyAssignmentId: string;
}

export enum PutStoragePolicyAssignmentsIdRequestBodyStoragePolicyTypeEnum {
    StoragePolicy = "storage_policy"
}


// PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy
/** 
 * The storage policy to assign to the user or
 * enterprise
**/
export class PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PutStoragePolicyAssignmentsIdRequestBodyStoragePolicyTypeEnum;
}


export class PutStoragePolicyAssignmentsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=storage_policy" })
  storagePolicy: PutStoragePolicyAssignmentsIdRequestBodyStoragePolicy;
}


export class PutStoragePolicyAssignmentsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutStoragePolicyAssignmentsIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutStoragePolicyAssignmentsIdRequestBody;
}


export class PutStoragePolicyAssignmentsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  storagePolicyAssignment?: shared.StoragePolicyAssignment;
}
