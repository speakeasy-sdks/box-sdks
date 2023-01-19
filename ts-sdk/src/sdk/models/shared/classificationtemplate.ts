import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum ClassificationTemplateDisplayNameEnum {
    Classification = "Classification"
}

export enum ClassificationTemplateFieldsDisplayNameEnum {
    Classification = "Classification"
}

export enum ClassificationTemplateFieldsKeyEnum {
    BoxSecurityClassificationKey = "Box__Security__Classification__Key"
}


// ClassificationTemplateFieldsOptionsStaticConfigClassification
/** 
 * Additional information about the classification.
 * 
 * This is not an exclusive list of properties, and
 * more object fields might be returned. These fields
 * are used for internal Box Shield and Box Governance
 * purposes and no additional value must be derived from
 * these fields.
**/
export class ClassificationTemplateFieldsOptionsStaticConfigClassification extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classificationDefinition" })
  classificationDefinition?: string;

  @SpeakeasyMetadata({ data: "json, name=colorID" })
  colorID?: number;
}


// ClassificationTemplateFieldsOptionsStaticConfig
/** 
 * Additional information about the classification.
**/
export class ClassificationTemplateFieldsOptionsStaticConfig extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classification" })
  classification?: ClassificationTemplateFieldsOptionsStaticConfigClassification;
}


// ClassificationTemplateFieldsOptions
/** 
 * A single classification available in this enterprise.
**/
export class ClassificationTemplateFieldsOptions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key?: string;

  @SpeakeasyMetadata({ data: "json, name=staticConfig" })
  staticConfig?: ClassificationTemplateFieldsOptionsStaticConfig;
}

export enum ClassificationTemplateFieldsTypeEnum {
    Enum = "enum"
}


// ClassificationTemplateFields
/** 
 * The metadata template field that represents the available
 * classifications.
**/
export class ClassificationTemplateFields extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=displayName" })
  displayName?: ClassificationTemplateFieldsDisplayNameEnum;

  @SpeakeasyMetadata({ data: "json, name=hidden" })
  hidden?: boolean;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key?: ClassificationTemplateFieldsKeyEnum;

  @SpeakeasyMetadata({ data: "json, name=options", elemType: ClassificationTemplateFieldsOptions })
  options?: ClassificationTemplateFieldsOptions[];

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ClassificationTemplateFieldsTypeEnum;
}

export enum ClassificationTemplateTemplateKeyEnum {
    SecurityClassification6VmVochwUWo = "securityClassification-6VMVochwUWo"
}

export enum ClassificationTemplateTypeEnum {
    MetadataTemplate = "metadata_template"
}


// ClassificationTemplate
/** 
 * A metadata template that holds the security classifications
 * defined by an enterprise.
**/
export class ClassificationTemplate extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=copyInstanceOnItemCopy" })
  copyInstanceOnItemCopy?: boolean;

  @SpeakeasyMetadata({ data: "json, name=displayName" })
  displayName?: ClassificationTemplateDisplayNameEnum;

  @SpeakeasyMetadata({ data: "json, name=fields", elemType: ClassificationTemplateFields })
  fields?: ClassificationTemplateFields[];

  @SpeakeasyMetadata({ data: "json, name=hidden" })
  hidden?: boolean;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=scope" })
  scope?: string;

  @SpeakeasyMetadata({ data: "json, name=templateKey" })
  templateKey?: ClassificationTemplateTemplateKeyEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: ClassificationTemplateTypeEnum;
}
