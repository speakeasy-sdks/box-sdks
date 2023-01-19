import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// SignRequestPrefillTag
/** 
 * Prefill tags are used to prefill placeholders with signer input data. Only
 * one value field can be included.
**/
export class SignRequestPrefillTag extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=checkbox_value" })
  checkboxValue?: boolean;

  @SpeakeasyMetadata({ data: "json, name=date_value" })
  dateValue?: Date;

  @SpeakeasyMetadata({ data: "json, name=document_tag_id" })
  documentTagId?: string;

  @SpeakeasyMetadata({ data: "json, name=text_value" })
  textValue?: string;
}
