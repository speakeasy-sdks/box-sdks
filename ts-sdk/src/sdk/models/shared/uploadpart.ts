import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// UploadPart
/** 
 * The basic representation of an upload
 * session chunk.
**/
export class UploadPart extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=offset" })
  offset?: number;

  @SpeakeasyMetadata({ data: "json, name=part_id" })
  partId?: string;

  @SpeakeasyMetadata({ data: "json, name=sha1" })
  sha1?: string;

  @SpeakeasyMetadata({ data: "json, name=size" })
  size?: number;
}
