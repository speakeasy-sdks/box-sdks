import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class DeleteCollaborationWhitelistExemptTargetsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=collaboration_whitelist_exempt_target_id" })
  collaborationWhitelistExemptTargetId: string;
}


export class DeleteCollaborationWhitelistExemptTargetsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: DeleteCollaborationWhitelistExemptTargetsIdPathParams;
}


export class DeleteCollaborationWhitelistExemptTargetsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
