import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// MetadataTemplateMetadataFieldWriteMetadataOptionWrite
/** 
 * An option for a Metadata Template Field.
 * 
 * Options only need to be provided for fields of type `enum` and `multiSelect`.
 * Options represent the value(s) a user can select for the field either through
 * the UI or through the API.
**/
export class MetadataTemplateMetadataFieldWriteMetadataOptionWrite extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key: string;
}

export enum MetadataTemplateMetadataFieldWriteTypeEnum {
    String = "string",
    Float = "float",
    Date = "date",
    Enum = "enum",
    MultiSelect = "multiSelect"
}


// MetadataTemplateMetadataFieldWrite
/** 
 * A field within a metadata template. Fields can be a basic text, date, or
 * number field, or a list of options.
**/
export class MetadataTemplateMetadataFieldWrite extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=displayName" })
  displayName: string;

  @SpeakeasyMetadata({ data: "json, name=hidden" })
  hidden?: boolean;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key: string;

  @SpeakeasyMetadata({ data: "json, name=options", elemType: MetadataTemplateMetadataFieldWriteMetadataOptionWrite })
  options?: MetadataTemplateMetadataFieldWriteMetadataOptionWrite[];

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: MetadataTemplateMetadataFieldWriteTypeEnum;
}

export enum MetadataTemplateTypeEnum {
    MetadataTemplate = "metadata_template"
}


// MetadataTemplate
/** 
 * A template for metadata that can be applied to files and folders
**/
export class MetadataTemplate extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=copyInstanceOnItemCopy" })
  copyInstanceOnItemCopy?: boolean;

  @SpeakeasyMetadata({ data: "json, name=displayName" })
  displayName?: string;

  @SpeakeasyMetadata({ data: "json, name=fields", elemType: MetadataTemplateMetadataFieldWrite })
  fields?: MetadataTemplateMetadataFieldWrite[];

  @SpeakeasyMetadata({ data: "json, name=hidden" })
  hidden?: boolean;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=scope" })
  scope?: string;

  @SpeakeasyMetadata({ data: "json, name=templateKey" })
  templateKey?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: MetadataTemplateTypeEnum;
}
