import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";

export const PostFilesContentServerList = [
	"https://upload.box.com/api/2.0",
] as const;


export class PostFilesContentQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=false;name=fields" })
  fields?: string[];
}


export class PostFilesContentHeaders extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "header, style=simple;explode=false;name=content-md5" })
  contentMd5?: string;
}


// PostFilesContentRequestBodyAttributesParent
/** 
 * The parent folder to upload the file to
**/
export class PostFilesContentRequestBodyAttributesParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;
}


// PostFilesContentRequestBodyAttributes
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
export class PostFilesContentRequestBodyAttributes extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=content_created_at" })
  contentCreatedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=content_modified_at" })
  contentModifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent: PostFilesContentRequestBodyAttributesParent;
}


export class PostFilesContentRequestBodyFile extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "multipart_form, content=true" })
  content: Uint8Array;

  @SpeakeasyMetadata({ data: "multipart_form, name=file" })
  file: string;
}


export class PostFilesContentRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "multipart_form, name=attributes;json=true" })
  attributes: PostFilesContentRequestBodyAttributes;

  @SpeakeasyMetadata({ data: "multipart_form, file=true" })
  file: PostFilesContentRequestBodyFile;
}


export class PostFilesContentRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  serverURL?: string;

  @SpeakeasyMetadata()
  queryParams: PostFilesContentQueryParams;

  @SpeakeasyMetadata()
  headers: PostFilesContentHeaders;

  @SpeakeasyMetadata({ data: "request, media_type=multipart/form-data" })
  request?: PostFilesContentRequestBody;
}


export class PostFilesContentResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  files?: shared.Files;

  @SpeakeasyMetadata()
  statusCode: number;
}
