import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// OptionsFilesContentRequestBodyParent
/** 
 * The parent for this item
**/
export class OptionsFilesContentRequestBodyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;
}


export class OptionsFilesContentRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: OptionsFilesContentRequestBodyParent;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size?: number;
}


export class OptionsFilesContentRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: OptionsFilesContentRequestBody;
}


export class OptionsFilesContentResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  conflictError?: shared.ConflictError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  uploadUrl?: shared.UploadUrl;
}
