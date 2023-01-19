import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum EnterpriseBaseTypeEnum {
    Enterprise = "enterprise"
}


// EnterpriseBase
/** 
 * A mini representation of a enterprise, used when
 * nested within another resource.
**/
export class EnterpriseBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: EnterpriseBaseTypeEnum;
}
