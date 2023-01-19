import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum GetFileVersionRetentionsDispositionActionEnum {
    PermanentlyDelete = "permanently_delete",
    RemoveRetention = "remove_retention"
}


export class GetFileVersionRetentionsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=disposition_action" })
  dispositionAction?: GetFileVersionRetentionsDispositionActionEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=disposition_after" })
  dispositionAfter?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=disposition_before" })
  dispositionBefore?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=file_id" })
  fileId?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=file_version_id" })
  fileVersionId?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=limit" })
  limit?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=marker" })
  marker?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=policy_id" })
  policyId?: string;
}


export class GetFileVersionRetentionsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  queryParams: GetFileVersionRetentionsQueryParams;
}


export class GetFileVersionRetentionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  fileVersionRetentions?: shared.FileVersionRetentions;

  @SpeakeasyMetadata()
  statusCode: number;
}
