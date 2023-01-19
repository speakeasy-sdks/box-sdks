import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum {
    Enterprise = "enterprise",
    Folder = "folder",
    MetadataTemplate = "metadata_template"
}


// PostRetentionPolicyAssignmentsRequestBodyAssignTo
/** 
 * The item to assign the policy to
**/
export class PostRetentionPolicyAssignmentsRequestBodyAssignTo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostRetentionPolicyAssignmentsRequestBodyAssignToTypeEnum;
}


export class PostRetentionPolicyAssignmentsRequestBodyFilterFields extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=field" })
  field?: string;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: string;
}


export class PostRetentionPolicyAssignmentsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=assign_to" })
  assignTo: PostRetentionPolicyAssignmentsRequestBodyAssignTo;

  @SpeakeasyMetadata({ data: "json, name=filter_fields", elemType: PostRetentionPolicyAssignmentsRequestBodyFilterFields })
  filterFields?: PostRetentionPolicyAssignmentsRequestBodyFilterFields[];

  @SpeakeasyMetadata({ data: "json, name=policy_id" })
  policyId: string;

  @SpeakeasyMetadata({ data: "json, name=start_date_field" })
  startDateField?: string;
}


export class PostRetentionPolicyAssignmentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostRetentionPolicyAssignmentsRequestBody;
}


export class PostRetentionPolicyAssignmentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  retentionPolicyAssignment?: shared.RetentionPolicyAssignment;

  @SpeakeasyMetadata()
  statusCode: number;
}
