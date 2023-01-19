import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// UploadSessionSessionEndpoints
/** 
 * A list of endpoints for a chunked upload session.
**/
export class UploadSessionSessionEndpoints extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=abort" })
  abort?: string;

  @SpeakeasyMetadata({ data: "json, name=commit" })
  commit?: string;

  @SpeakeasyMetadata({ data: "json, name=list_parts" })
  listParts?: string;

  @SpeakeasyMetadata({ data: "json, name=log_event" })
  logEvent?: string;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: string;

  @SpeakeasyMetadata({ data: "json, name=upload_part" })
  uploadPart?: string;
}

export enum UploadSessionTypeEnum {
    UploadSession = "upload_session"
}


// UploadSession
/** 
 * An upload session for chunk uploading a file.
**/
export class UploadSession extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=num_parts_processed" })
  numPartsProcessed?: number;

  @SpeakeasyMetadata({ data: "json, name=part_size" })
  partSize?: number;

  @SpeakeasyMetadata({ data: "json, name=session_endpoints" })
  sessionEndpoints?: UploadSessionSessionEndpoints;

  @SpeakeasyMetadata({ data: "json, name=session_expires_at" })
  sessionExpiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=total_parts" })
  totalParts?: number;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: UploadSessionTypeEnum;
}
