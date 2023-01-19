import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum {
    Classification = "Classification"
}

export enum PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum {
    Classification = "Classification"
}

export enum PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum {
    BoxSecurityClassificationKey = "Box__Security__Classification__Key"
}


// PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification
/** 
 * Additional information about the classification.
**/
export class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classificationDefinition" })
  classificationDefinition?: string;

  @SpeakeasyMetadata({ data: "json, name=colorID" })
  colorID?: number;
}


// PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig
/** 
 * Additional information about the classification.
**/
export class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classification" })
  classification?: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfigClassification;
}


// PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions
/** 
 * An individual classification.
**/
export class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=key" })
  key?: string;

  @SpeakeasyMetadata({ data: "json, name=staticConfig" })
  staticConfig?: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptionsStaticConfig;
}

export enum PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum {
    Enum = "enum"
}


// PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields
/** 
 * The `enum` field which holds all the valid classification
 * values.
**/
export class PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=displayName" })
  displayName?: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsDisplayNameEnum;

  @SpeakeasyMetadata({ data: "json, name=hidden" })
  hidden?: boolean;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key?: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsKeyEnum;

  @SpeakeasyMetadata({ data: "json, name=options", elemType: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions })
  options?: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsOptions[];

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFieldsTypeEnum;
}

export enum PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum {
    Enterprise = "enterprise"
}

export enum PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum {
    SecurityClassification6VmVochwUWo = "securityClassification-6VMVochwUWo"
}


export class PostMetadataTemplatesSchemaNumberClassificationsRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=copyInstanceOnItemCopy" })
  copyInstanceOnItemCopy?: boolean;

  @SpeakeasyMetadata({ data: "json, name=displayName" })
  displayName: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyDisplayNameEnum;

  @SpeakeasyMetadata({ data: "json, name=fields", elemType: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields })
  fields?: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyFields[];

  @SpeakeasyMetadata({ data: "json, name=hidden" })
  hidden?: boolean;

  @SpeakeasyMetadata({ data: "json, name=scope" })
  scope: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyScopeEnum;

  @SpeakeasyMetadata({ data: "json, name=templateKey" })
  templateKey?: PostMetadataTemplatesSchemaNumberClassificationsRequestBodyTemplateKeyEnum;
}


export class PostMetadataTemplatesSchemaNumberClassificationsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostMetadataTemplatesSchemaNumberClassificationsRequestBody;
}


export class PostMetadataTemplatesSchemaNumberClassificationsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  classificationTemplate?: shared.ClassificationTemplate;

  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
