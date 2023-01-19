import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// EventSourceClassification
/** 
 * The object containing classification information for the item that
 * triggered the event. This field will not appear if the item does not
 * have a classification set.
**/
export class EventSourceClassification extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;
}

export enum EventSourceItemTypeEnum {
    File = "file",
    Folder = "folder"
}

export enum EventSourceUserBaseTypeEnum {
    User = "user"
}


// EventSourceUserBase
/** 
 * The user who owns this item.
**/
export class EventSourceUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: EventSourceUserBaseTypeEnum;
}

export enum EventSourceFolderBaseTypeEnum {
    Folder = "folder"
}


// EventSourceFolderBase
/** 
 * The optional folder that this folder is located within.
 * 
 * This value may be `null` for some folders such as the
 * root folder or the trash folder.
**/
export class EventSourceFolderBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=etag" })
  etag?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=sequence_id" })
  sequenceId?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: EventSourceFolderBaseTypeEnum;
}


// EventSource
/** 
 * The source file or folder that triggered an event in
 * the event stream.
**/
export class EventSource extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=classification" })
  classification?: EventSourceClassification;

  @SpeakeasyMetadata({ data: "json, name=item_id" })
  itemId: string;

  @SpeakeasyMetadata({ data: "json, name=item_name" })
  itemName: string;

  @SpeakeasyMetadata({ data: "json, name=item_type" })
  itemType: EventSourceItemTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=owned_by" })
  ownedBy?: EventSourceUserBase;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: EventSourceFolderBase;
}
