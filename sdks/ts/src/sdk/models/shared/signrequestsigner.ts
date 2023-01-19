import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { SignRequestSignerInput } from "./signrequestsignerinput";


export enum SignRequestSignerRoleEnum {
    Signer = "signer",
    Approver = "approver",
    FinalCopyReader = "final_copy_reader"
}

export enum SignRequestSignerSignerDecisionTypeEnum {
    Signed = "signed",
    Declined = "declined"
}


// SignRequestSignerSignerDecision
/** 
 * Final decision made by the signer
**/
export class SignRequestSignerSignerDecision extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=finalized_at" })
  finalizedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: SignRequestSignerSignerDecisionTypeEnum;
}


// SignRequestSignerOutput
/** 
 * The schema for a Signer in a POST Sign Request request body
**/
export class SignRequestSignerOutput extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=declined_redirect_url" })
  declinedRedirectUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=email" })
  email: string;

  @SpeakeasyMetadata({ data: "json, name=embed_url" })
  embedUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=embed_url_external_user_id" })
  embedUrlExternalUserId?: string;

  @SpeakeasyMetadata({ data: "json, name=has_viewed_document" })
  hasViewedDocument?: boolean;

  @SpeakeasyMetadata({ data: "json, name=inputs", elemType: SignRequestSignerInput })
  inputs?: SignRequestSignerInput[];

  @SpeakeasyMetadata({ data: "json, name=is_in_person" })
  isInPerson?: boolean;

  @SpeakeasyMetadata({ data: "json, name=login_required" })
  loginRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=order" })
  order?: number;

  @SpeakeasyMetadata({ data: "json, name=redirect_url" })
  redirectUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role?: SignRequestSignerRoleEnum;

  @SpeakeasyMetadata({ data: "json, name=signer_decision" })
  signerDecision?: SignRequestSignerSignerDecision;

  @SpeakeasyMetadata({ data: "json, name=verification_phone_number" })
  verificationPhoneNumber?: string;
}
