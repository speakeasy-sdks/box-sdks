import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum FileRequestUpdateRequestStatusEnum {
    Active = "active",
    Inactive = "inactive"
}


// FileRequestUpdateRequest
/** 
 * The request body to update a file request.
**/
export class FileRequestUpdateRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=expires_at" })
  expiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=is_description_required" })
  isDescriptionRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=is_email_required" })
  isEmailRequired?: boolean;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: FileRequestUpdateRequestStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=title" })
  title?: string;
}
