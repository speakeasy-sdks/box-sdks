import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// PostCollaborationWhitelistExemptTargetsRequestBodyUser
/** 
 * The user to exempt.
**/
export class PostCollaborationWhitelistExemptTargetsRequestBodyUser extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}


export class PostCollaborationWhitelistExemptTargetsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=user" })
  user: PostCollaborationWhitelistExemptTargetsRequestBodyUser;
}


export class PostCollaborationWhitelistExemptTargetsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostCollaborationWhitelistExemptTargetsRequestBody;
}


export class PostCollaborationWhitelistExemptTargetsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  collaborationAllowlistExemptTarget?: shared.CollaborationAllowlistExemptTarget;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
