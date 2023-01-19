import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileMini } from "./filemini";
import { FolderMini } from "./foldermini";
import { SignRequestPrefillTag } from "./signrequestprefilltag";
import { SignRequestSignerOutput } from "./signrequestsigner";
import { FileBase } from "./filebase";



// SignRequestSignFiles
/** 
 * List of files that will be signed, which are copies of the original
 * source files. A new version of these files are created as signers sign
 * and can be downloaded at any point in the signing process.
**/
export class SignRequestSignFiles extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=files", elemType: FileMini })
  files?: FileMini[];

  @SpeakeasyMetadata({ data: "json, name=is_ready_for_download" })
  isReadyForDownload?: boolean;
}

export enum SignRequestSignatureColorEnum {
    Blue = "blue",
    Black = "black",
    Red = "red"
}

export enum SignRequestStatusEnum {
    Converting = "converting",
    Created = "created",
    Sent = "sent",
    Viewed = "viewed",
    Signed = "signed",
    Cancelled = "cancelled",
    Declined = "declined",
    ErrorConverting = "error_converting",
    ErrorSending = "error_sending",
    Expired = "expired",
    Downloaded = "downloaded",
    SignedAndDownloaded = "signed and downloaded"
}

export enum SignRequestTypeEnum {
    SignRequest = "sign-request"
}


// SignRequestOutput
/** 
 * A request to create a sign request object
**/
export class SignRequestOutput extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=are_reminders_enabled" })
  areRemindersEnabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=are_text_signatures_enabled" })
  areTextSignaturesEnabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=auto_expire_at" })
  autoExpireAt?: Date;

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

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

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

  @SpeakeasyMetadata({ data: "json, name=prepare_url" })
  prepareUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=redirect_url" })
  redirectUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=sign_files" })
  signFiles?: SignRequestSignFiles;

  @SpeakeasyMetadata({ data: "json, name=signature_color" })
  signatureColor?: SignRequestSignatureColorEnum;

  @SpeakeasyMetadata({ data: "json, name=signers", elemType: SignRequestSignerOutput })
  signers: SignRequestSignerOutput[];

  @SpeakeasyMetadata({ data: "json, name=signing_log" })
  signingLog?: FileMini;

  @SpeakeasyMetadata({ data: "json, name=source_files", elemType: FileBase })
  sourceFiles: FileBase[];

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: SignRequestStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: SignRequestTypeEnum;
}
