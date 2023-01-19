import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum WebhookMiniTargetTypeEnum {
    File = "file",
    Folder = "folder"
}


// WebhookMiniTarget
/** 
 * The item that will trigger the webhook
**/
export class WebhookMiniTarget extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WebhookMiniTargetTypeEnum;
}

export enum WebhookMiniTypeEnum {
    Webhook = "webhook"
}


// WebhookMini
/** 
 * Represents a configured webhook.
**/
export class WebhookMini extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=target" })
  target?: WebhookMiniTarget;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: WebhookMiniTypeEnum;
}
