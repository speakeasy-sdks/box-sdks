import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum TermsOfServiceBaseTypeEnum {
    TermsOfService = "terms_of_service"
}


// TermsOfServiceBase
/** 
 * The root-level record that is supposed to represent a
 * single Terms of Service.
**/
export class TermsOfServiceBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TermsOfServiceBaseTypeEnum;
}
