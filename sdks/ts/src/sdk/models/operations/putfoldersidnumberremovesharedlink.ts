import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFoldersIdNumberRemoveSharedLinkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=folder_id" })
  folderId: string;
}


export class PutFoldersIdNumberRemoveSharedLinkQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=fields" })
  fields: string;
}


export class PutFoldersIdNumberRemoveSharedLinkRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: Record<string, any>;
}


export class PutFoldersIdNumberRemoveSharedLinkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFoldersIdNumberRemoveSharedLinkPathParams;

  @SpeakeasyMetadata()
  queryParams: PutFoldersIdNumberRemoveSharedLinkQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFoldersIdNumberRemoveSharedLinkRequestBody;
}


export class PutFoldersIdNumberRemoveSharedLinkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  folder?: shared.Folder;

  @SpeakeasyMetadata()
  statusCode: number;
}
