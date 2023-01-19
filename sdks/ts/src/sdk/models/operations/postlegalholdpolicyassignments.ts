import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum {
    File = "file",
    FileVersion = "file_version",
    Folder = "folder",
    User = "user"
}


// PostLegalHoldPolicyAssignmentsRequestBodyAssignTo
/** 
 * The item to assign the policy to
**/
export class PostLegalHoldPolicyAssignmentsRequestBodyAssignTo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostLegalHoldPolicyAssignmentsRequestBodyAssignToTypeEnum;
}


export class PostLegalHoldPolicyAssignmentsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assign_to" })
  assignTo: PostLegalHoldPolicyAssignmentsRequestBodyAssignTo;

  @SpeakeasyMetadata({ data: "json, name=policy_id" })
  policyId: string;
}


export class PostLegalHoldPolicyAssignmentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostLegalHoldPolicyAssignmentsRequestBody;
}


export class PostLegalHoldPolicyAssignmentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  legalHoldPolicyAssignment?: shared.LegalHoldPolicyAssignment;

  @SpeakeasyMetadata()
  statusCode: number;
}
