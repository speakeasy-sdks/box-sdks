import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { TermsOfServiceBase } from "./termsofservicebase";
import { UserMini } from "./usermini";


export enum TermsOfServiceUserStatusTypeEnum {
    TermsOfServiceUserStatus = "terms_of_service_user_status"
}


// TermsOfServiceUserStatus
/** 
 * The association between a Terms of Service and a user
**/
export class TermsOfServiceUserStatus extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=is_accepted" })
  isAccepted?: boolean;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=tos" })
  tos?: TermsOfServiceBase;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TermsOfServiceUserStatusTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user?: UserMini;
}
