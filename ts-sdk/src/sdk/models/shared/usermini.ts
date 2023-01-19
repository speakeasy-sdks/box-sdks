import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum UserMiniTypeEnum {
    User = "user"
}


// UserMini
/** 
 * A mini representation of a user, used when
 * nested within another resource.
**/
export class UserMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: UserMiniTypeEnum;
}
