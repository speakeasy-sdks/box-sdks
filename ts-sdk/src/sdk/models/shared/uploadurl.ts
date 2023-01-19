import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// UploadUrl
/** 
 * The details for the upload session for the file.
**/
export class UploadUrl extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=upload_token" })
  uploadToken?: string;

  @SpeakeasyMetadata({ data: "json, name=upload_url" })
  uploadUrl?: string;
}
