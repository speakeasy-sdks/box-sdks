import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PutMetadataTemplatesIdIdSchemaScopeEnum {
    Global = "global",
    Enterprise = "enterprise"
}


export class PutMetadataTemplatesIdIdSchemaPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scope" })
  scope: PutMetadataTemplatesIdIdSchemaScopeEnum;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=template_key" })
  templateKey: string;
}

export enum PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperationOpEnum {
    EditTemplate = "editTemplate",
    AddField = "addField",
    ReorderFields = "reorderFields",
    AddEnumOption = "addEnumOption",
    ReorderEnumOptions = "reorderEnumOptions",
    ReorderMultiSelectOptions = "reorderMultiSelectOptions",
    AddMultiSelectOption = "addMultiSelectOption",
    EditField = "editField",
    RemoveField = "removeField",
    EditEnumOption = "editEnumOption",
    RemoveEnumOption = "removeEnumOption",
    EditMultiSelectOption = "editMultiSelectOption",
    RemoveMultiSelectOption = "removeMultiSelectOption"
}


// PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation
/** 
 * A [JSON-Patch](https://tools.ietf.org/html/rfc6902) operation for a
 * change to make to the metadata instance.
**/
export class PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Record<string, string>;

  @SpeakeasyMetadata({ data: "json, name=enumOptionKey" })
  enumOptionKey?: string;

  @SpeakeasyMetadata({ data: "json, name=enumOptionKeys" })
  enumOptionKeys?: string[];

  @SpeakeasyMetadata({ data: "json, name=fieldKey" })
  fieldKey?: string;

  @SpeakeasyMetadata({ data: "json, name=fieldKeys" })
  fieldKeys?: string[];

  @SpeakeasyMetadata({ data: "json, name=multiSelectOptionKey" })
  multiSelectOptionKey?: string;

  @SpeakeasyMetadata({ data: "json, name=multiSelectOptionKeys" })
  multiSelectOptionKeys?: string[];

  @SpeakeasyMetadata({ data: "json, name=op" })
  op: PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperationOpEnum;
}


export class PutMetadataTemplatesIdIdSchemaRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutMetadataTemplatesIdIdSchemaPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json-patch+json", elemType: PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation })
  request?: PutMetadataTemplatesIdIdSchemaAMetadataTemplateUpdateOperation[];
}


export class PutMetadataTemplatesIdIdSchemaResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  metadataTemplate?: shared.MetadataTemplate;

  @SpeakeasyMetadata()
  statusCode: number;
}
