import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class GetCollaborationWhitelistEntriesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=collaboration_whitelist_entry_id" })
  collaborationWhitelistEntryId: string;
}


export class GetCollaborationWhitelistEntriesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: GetCollaborationWhitelistEntriesIdPathParams;
}


export class GetCollaborationWhitelistEntriesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  collaborationAllowlistEntry?: shared.CollaborationAllowlistEntry;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
