import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



// PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite
/** 
 * An option for a Metadata Template Field.
 * 
 * Options only need to be provided for fields of type `enum` and `multiSelect`.
 * Options represent the value(s) a user can select for the field either through
 * the UI or through the API.
**/
export class PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=key" })
  key: string;
}

export enum PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum {
    String = "string",
    Float = "float",
    Date = "date",
    Enum = "enum",
    MultiSelect = "multiSelect"
}


// PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite
/** 
 * A field within a metadata template. Fields can be a basic text, date, or
 * number field, or a list of options.
**/
export class PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=displayName" })
  displayName: string;

  @SpeakeasyMetadata({ data: "json, name=hidden" })
  hidden?: boolean;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key: string;

  @SpeakeasyMetadata({ data: "json, name=options", elemType: PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite })
  options?: PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteMetadataOptionWrite[];

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PostMetadataTemplatesSchemaRequestBodyMetadataFieldWriteTypeEnum;
}


export class PostMetadataTemplatesSchemaRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=copyInstanceOnItemCopy" })
  copyInstanceOnItemCopy?: boolean;

  @SpeakeasyMetadata({ data: "json, name=displayName" })
  displayName: string;

  @SpeakeasyMetadata({ data: "json, name=fields", elemType: PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite })
  fields?: PostMetadataTemplatesSchemaRequestBodyMetadataFieldWrite[];

  @SpeakeasyMetadata({ data: "json, name=hidden" })
  hidden?: boolean;

  @SpeakeasyMetadata({ data: "json, name=scope" })
  scope: string;

  @SpeakeasyMetadata({ data: "json, name=templateKey" })
  templateKey?: string;
}


export class PostMetadataTemplatesSchemaRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostMetadataTemplatesSchemaRequestBody;
}


export class PostMetadataTemplatesSchemaResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadataTemplate?: shared.MetadataTemplate;

  @SpeakeasyMetadata()
  statusCode: number;
}
