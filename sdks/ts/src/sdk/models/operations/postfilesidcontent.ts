import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const PostFilesIdContentServerList = [
	"https://upload.box.com/api/2.0",
] as const;


export class PostFilesIdContentPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=file_id" })
  fileId: string;
}


export class PostFilesIdContentQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class PostFilesIdContentHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=content-md5" })
  contentMd5?: string;

  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=if-match" })
  ifMatch?: string;
}


// PostFilesIdContentRequestBodyAttributes
/** 
 * The additional attributes of the file being uploaded. Mainly the
 * name and the parent folder. These attributes are part of the multi
 * part request body and are in JSON format.
 * 
 * <Message warning>
 * 
 *   The `attributes` part of the body must come **before** the
 *   `file` part. Requests that do not follow this format when
 *   uploading the file will receive a HTTP `400` error with a
 *   `metadata_after_file_contents` error code.
 * 
 * </Message>
**/
export class PostFilesIdContentRequestBodyAttributes extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=content_modified_at" })
  contentModifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;
}


export class PostFilesIdContentRequestBodyFile extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "multipart_form, content=true" })
  content: Uint8Array;

  @SpeakeasyMetadata({ data: "multipart_form, name=file" })
  file: string;
}


export class PostFilesIdContentRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "multipart_form, name=attributes;json=true" })
  attributes: PostFilesIdContentRequestBodyAttributes;

  @SpeakeasyMetadata({ data: "multipart_form, file=true" })
  file: PostFilesIdContentRequestBodyFile;
}


export class PostFilesIdContentRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata()
  pathParams: PostFilesIdContentPathParams;

  @SpeakeasyMetadata()
  queryParams: PostFilesIdContentQueryParams;

  @SpeakeasyMetadata()
  headers: PostFilesIdContentHeaders;

  @SpeakeasyMetadata({ data: "request, media_type=multipart/form-data" })
  request?: PostFilesIdContentRequestBody;
}


export class PostFilesIdContentResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  files?: shared.Files;

  @SpeakeasyMetadata()
  statusCode: number;
}
