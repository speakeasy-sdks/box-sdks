import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutFilesIdNumberRemoveSharedLinkPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class PutFilesIdNumberRemoveSharedLinkQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=fields" })
  fields: string;
}


export class PutFilesIdNumberRemoveSharedLinkRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=shared_link" })
  sharedLink?: Record<string, any>;
}


export class PutFilesIdNumberRemoveSharedLinkRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutFilesIdNumberRemoveSharedLinkPathParams;

  @SpeakeasyMetadata()
  queryParams: PutFilesIdNumberRemoveSharedLinkQueryParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutFilesIdNumberRemoveSharedLinkRequestBody;
}


export class PutFilesIdNumberRemoveSharedLinkResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  file?: shared.File;

  @SpeakeasyMetadata()
  statusCode: number;
}
