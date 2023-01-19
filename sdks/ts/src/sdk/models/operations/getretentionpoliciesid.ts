import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetRetentionPoliciesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=retention_policy_id" })
  retentionPolicyId: string;
}


export class GetRetentionPoliciesIdQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class GetRetentionPoliciesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetRetentionPoliciesIdPathParams;

  @SpeakeasyMetadata()
  queryParams: GetRetentionPoliciesIdQueryParams;
}


export class GetRetentionPoliciesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  retentionPolicy?: shared.RetentionPolicy;

  @SpeakeasyMetadata()
  statusCode: number;
}
