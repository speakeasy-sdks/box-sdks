import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum CollaborationAllowlistEntryDirectionEnum {
    Inbound = "inbound",
    Outbound = "outbound",
    Both = "both"
}

export enum CollaborationAllowlistEntryEnterpriseTypeEnum {
    Enterprise = "enterprise"
}


// CollaborationAllowlistEntryEnterprise
/** 
 * A representation of a Box enterprise
**/
export class CollaborationAllowlistEntryEnterprise extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: CollaborationAllowlistEntryEnterpriseTypeEnum;
}

export enum CollaborationAllowlistEntryTypeEnum {
    CollaborationWhitelistEntry = "collaboration_whitelist_entry"
}


// CollaborationAllowlistEntry
/** 
 * An entry that describes an approved domain for which users can collaborate
 * with files and folders in your enterprise or vice versa.
**/
export class CollaborationAllowlistEntry extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=direction" })
  direction?: CollaborationAllowlistEntryDirectionEnum;

  @SpeakeasyMetadata({ data: "json, name=domain" })
  domain?: string;

  @SpeakeasyMetadata({ data: "json, name=enterprise" })
  enterprise?: CollaborationAllowlistEntryEnterprise;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: CollaborationAllowlistEntryTypeEnum;
}
