import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum SignRequestSignerInputContentTypeEnum {
    Initial = "initial",
    Stamp = "stamp",
    Signature = "signature",
    Company = "company",
    Title = "title",
    Email = "email",
    FullName = "full_name",
    FirstName = "first_name",
    LastName = "last_name",
    Text = "text",
    Date = "date",
    Checkbox = "checkbox"
}

export enum SignRequestSignerInputTypeEnum {
    Signature = "signature",
    Date = "date",
    Text = "text",
    Checkbox = "checkbox"
}


// SignRequestSignerInput
/** 
 * Prefill tags are used to prefill placeholders with signer input data. Only
 * one value field can be included.
**/
export class SignRequestSignerInput extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=checkbox_value" })
  checkboxValue?: boolean;

  @SpeakeasyMetadata({ data: "json, name=content_type" })
  contentType?: SignRequestSignerInputContentTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=date_value" })
  dateValue?: Date;

  @SpeakeasyMetadata({ data: "json, name=document_tag_id" })
  documentTagId?: string;

  @SpeakeasyMetadata({ data: "json, name=page_index" })
  pageIndex: number;

  @SpeakeasyMetadata({ data: "json, name=text_value" })
  textValue?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: SignRequestSignerInputTypeEnum;
}
