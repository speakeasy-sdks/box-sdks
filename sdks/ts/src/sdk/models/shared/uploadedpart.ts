import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { UploadPart } from "./uploadpart";



// UploadedPart
/** 
 * A chunk of a file uploaded as part of
 * an upload session, as returned by some endpoints.
**/
export class UploadedPart extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=part" })
  part?: UploadPart;
}
