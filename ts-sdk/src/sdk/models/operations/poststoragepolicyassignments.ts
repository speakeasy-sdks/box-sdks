import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum {
    User = "user",
    Enterprise = "enterprise"
}


// PostStoragePolicyAssignmentsRequestBodyAssignedTo
/** 
 * The user or enterprise to assign the storage
 * policy to.
**/
export class PostStoragePolicyAssignmentsRequestBodyAssignedTo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostStoragePolicyAssignmentsRequestBodyAssignedToTypeEnum;
}

export enum PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum {
    StoragePolicy = "storage_policy"
}


// PostStoragePolicyAssignmentsRequestBodyStoragePolicy
/** 
 * The storage policy to assign to the user or
 * enterprise
**/
export class PostStoragePolicyAssignmentsRequestBodyStoragePolicy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostStoragePolicyAssignmentsRequestBodyStoragePolicyTypeEnum;
}


export class PostStoragePolicyAssignmentsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assigned_to" })
  assignedTo: PostStoragePolicyAssignmentsRequestBodyAssignedTo;

  @SpeakeasyMetadata({ data: "json, name=storage_policy" })
  storagePolicy: PostStoragePolicyAssignmentsRequestBodyStoragePolicy;
}


export class PostStoragePolicyAssignmentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostStoragePolicyAssignmentsRequestBody;
}


export class PostStoragePolicyAssignmentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  storagePolicyAssignment?: shared.StoragePolicyAssignment;
}
