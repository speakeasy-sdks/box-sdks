import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetRetentionPoliciesPolicyTypeEnum {
    Finite = "finite",
    Indefinite = "indefinite"
}


export class GetRetentionPoliciesQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=created_by_user_id" })
  createdByUserId?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=policy_name" })
  policyName?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=policy_type" })
  policyType?: GetRetentionPoliciesPolicyTypeEnum;
}


export class GetRetentionPoliciesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetRetentionPoliciesQueryParams;
}


export class GetRetentionPoliciesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  retentionPolicies?: shared.RetentionPolicies;

  @SpeakeasyMetadata()
  statusCode: number;
}
