import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FolderMini } from "./foldermini";
import { SignRequestPrefillTag } from "./signrequestprefilltag";
import { SignRequestCreateSigner } from "./signrequestcreatesigner";
import { FileBase } from "./filebase";


export enum SignRequestCreateRequestSignatureColorEnum {
    Blue = "blue",
    Black = "black",
    Red = "red"
}


// SignRequestCreateRequest
/** 
 * A request to create a sign request object
**/
export class SignRequestCreateRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=are_reminders_enabled" })
  areRemindersEnabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=are_text_signatures_enabled" })
  areTextSignaturesEnabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=days_valid" })
  daysValid?: number;

  @SpeakeasyMetadata({ data: "json, name=declined_redirect_url" })
  declinedRedirectUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=email_message" })
  emailMessage?: string;

  @SpeakeasyMetadata({ data: "json, name=email_subject" })
  emailSubject?: string;

  @SpeakeasyMetadata({ data: "json, name=external_id" })
  externalId?: string;

  @SpeakeasyMetadata({ data: "json, name=is_document_preparation_needed" })
  isDocumentPreparationNeeded?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_phone_verification_required_to_view" })
  isPhoneVerificationRequiredToView?: boolean;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=parent_folder" })
  parentFolder: FolderMini;

  @SpeakeasyMetadata({ data: "json, name=prefill_tags", elemType: SignRequestPrefillTag })
  prefillTags?: SignRequestPrefillTag[];

  @SpeakeasyMetadata({ data: "json, name=redirect_url" })
  redirectUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=signature_color" })
  signatureColor?: SignRequestCreateRequestSignatureColorEnum;

  @SpeakeasyMetadata({ data: "json, name=signers", elemType: SignRequestCreateSigner })
  signers: SignRequestCreateSigner[];

  @SpeakeasyMetadata({ data: "json, name=source_files", elemType: FileBase })
  sourceFiles: FileBase[];
}
