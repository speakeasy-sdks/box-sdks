import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetWorkflowsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=folder_id" })
  folderId: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=trigger_type" })
  triggerType?: string;
}


export class GetWorkflowsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetWorkflowsQueryParams;
}


export class GetWorkflowsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  workflows?: shared.Workflows;
}
