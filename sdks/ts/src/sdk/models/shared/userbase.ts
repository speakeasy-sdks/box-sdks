import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum UserBaseTypeEnum {
    User = "user"
}


// UserBase
/** 
 * A mini representation of a user, used when
 * nested within another resource.
**/
export class UserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: UserBaseTypeEnum;
}
