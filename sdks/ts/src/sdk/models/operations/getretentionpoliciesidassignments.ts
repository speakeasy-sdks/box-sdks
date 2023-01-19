import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetRetentionPoliciesIdAssignmentsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=retention_policy_id" })
  retentionPolicyId: string;
}

export enum GetRetentionPoliciesIdAssignmentsTypeEnum {
    Folder = "folder",
    Enterprise = "enterprise",
    MetadataTemplate = "metadata_template"
}


export class GetRetentionPoliciesIdAssignmentsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=type" })
  type?: GetRetentionPoliciesIdAssignmentsTypeEnum;
}


export class GetRetentionPoliciesIdAssignmentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetRetentionPoliciesIdAssignmentsPathParams;

  @SpeakeasyMetadata()
  queryParams: GetRetentionPoliciesIdAssignmentsQueryParams;
}


export class GetRetentionPoliciesIdAssignmentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  retentionPolicyAssignments?: shared.RetentionPolicyAssignments;

  @SpeakeasyMetadata()
  statusCode: number;
}
