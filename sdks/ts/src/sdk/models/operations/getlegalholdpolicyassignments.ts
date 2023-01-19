import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetLegalHoldPolicyAssignmentsAssignToTypeEnum {
    File = "file",
    FileVersion = "file_version",
    Folder = "folder",
    User = "user"
}


export class GetLegalHoldPolicyAssignmentsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=assign_to_id" })
  assignToId?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=assign_to_type" })
  assignToType?: GetLegalHoldPolicyAssignmentsAssignToTypeEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=policy_id" })
  policyId: string;
}


export class GetLegalHoldPolicyAssignmentsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetLegalHoldPolicyAssignmentsQueryParams;
}


export class GetLegalHoldPolicyAssignmentsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  legalHoldPolicyAssignments?: shared.LegalHoldPolicyAssignments;

  @SpeakeasyMetadata()
  statusCode: number;
}
