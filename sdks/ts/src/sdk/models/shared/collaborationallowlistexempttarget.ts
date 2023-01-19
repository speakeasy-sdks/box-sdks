import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum CollaborationAllowlistExemptTargetEnterpriseTypeEnum {
    Enterprise = "enterprise"
}


// CollaborationAllowlistExemptTargetEnterprise
/** 
 * A representation of a Box enterprise
**/
export class CollaborationAllowlistExemptTargetEnterprise extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: CollaborationAllowlistExemptTargetEnterpriseTypeEnum;
}

export enum CollaborationAllowlistExemptTargetTypeEnum {
    CollaborationWhitelist = "collaboration_whitelist"
}


// CollaborationAllowlistExemptTarget
/** 
 * The user that is exempt from any of the restrictions
 * imposed by the list of allowed collaboration domains for this enterprise.
**/
export class CollaborationAllowlistExemptTarget extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=enterprise" })
  enterprise?: CollaborationAllowlistExemptTargetEnterprise;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: CollaborationAllowlistExemptTargetTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=user" })
  user?: CollaborationAllowlistExemptTargetEnterprise;
}
