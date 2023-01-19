import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum ClassificationDollarTemplateEnum {
    SecurityClassification6VmVochwUWo = "securityClassification-6VMVochwUWo"
}


// Classification
/** 
 * An instance of the classification metadata template, containing
 * the classification applied to the file or folder.
 * 
 * To get more details about the classification applied to an item,
 * request the classification metadata template.
**/
export class Classification extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=$canEdit" })
  dollarCanEdit?: boolean;

  @SpeakeasyMetadata({ data: "json, name=$parent" })
  dollarParent?: string;

  @SpeakeasyMetadata({ data: "json, name=$scope" })
  dollarScope?: string;

  @SpeakeasyMetadata({ data: "json, name=$template" })
  dollarTemplate?: ClassificationDollarTemplateEnum;

  @SpeakeasyMetadata({ data: "json, name=$type" })
  dollarType?: string;

  @SpeakeasyMetadata({ data: "json, name=$typeVersion" })
  dollarTypeVersion?: number;

  @SpeakeasyMetadata({ data: "json, name=$version" })
  dollarVersion?: number;

  @SpeakeasyMetadata({ data: "json, name=Box__Security__Classification__Key" })
  boxSecurityClassificationKey?: string;
}
