import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum SignRequestCreateSignerRoleEnum {
    Signer = "signer",
    Approver = "approver",
    FinalCopyReader = "final_copy_reader"
}


// SignRequestCreateSigner
/** 
 * The schema for a Signer in a POST Sign Request request body
**/
export class SignRequestCreateSigner extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=declined_redirect_url" })
  declinedRedirectUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=email" })
  email: string;

  @SpeakeasyMetadata({ data: "json, name=embed_url_external_user_id" })
  embedUrlExternalUserId?: string;

  @SpeakeasyMetadata({ data: "json, name=is_in_person" })
  isInPerson?: boolean;

  @SpeakeasyMetadata({ data: "json, name=login_required" })
  loginRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=order" })
  order?: number;

  @SpeakeasyMetadata({ data: "json, name=password" })
  password?: string;

  @SpeakeasyMetadata({ data: "json, name=redirect_url" })
  redirectUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role?: SignRequestCreateSignerRoleEnum;

  @SpeakeasyMetadata({ data: "json, name=verification_phone_number" })
  verificationPhoneNumber?: string;
}
