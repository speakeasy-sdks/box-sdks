import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetCollaborationWhitelistExemptTargetsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=collaboration_whitelist_exempt_target_id" })
  collaborationWhitelistExemptTargetId: string;
}


export class GetCollaborationWhitelistExemptTargetsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetCollaborationWhitelistExemptTargetsIdPathParams;
}


export class GetCollaborationWhitelistExemptTargetsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  collaborationAllowlistExemptTarget?: shared.CollaborationAllowlistExemptTarget;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
