import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostCollaborationWhitelistEntriesRequestBodyDirectionEnum {
    Inbound = "inbound",
    Outbound = "outbound",
    Both = "both"
}


export class PostCollaborationWhitelistEntriesRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction: PostCollaborationWhitelistEntriesRequestBodyDirectionEnum;

  @SpeakeasyMetadata({ data: "json, name=domain" })
  domain: string;
}


export class PostCollaborationWhitelistEntriesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostCollaborationWhitelistEntriesRequestBody;
}


export class PostCollaborationWhitelistEntriesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  collaborationAllowlistEntry?: shared.CollaborationAllowlistEntry;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
