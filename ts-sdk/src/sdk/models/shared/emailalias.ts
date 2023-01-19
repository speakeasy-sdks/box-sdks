import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum EmailAliasTypeEnum {
    EmailAlias = "email_alias"
}


// EmailAlias
/** 
 * An email alias for a user.
**/
export class EmailAlias extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=email" })
  email?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=is_confirmed" })
  isConfirmed?: boolean;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: EmailAliasTypeEnum;
}
