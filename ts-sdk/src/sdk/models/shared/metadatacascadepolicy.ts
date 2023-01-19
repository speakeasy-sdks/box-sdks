import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum MetadataCascadePolicyOwnerEnterpriseTypeEnum {
    Enterprise = "enterprise"
}


// MetadataCascadePolicyOwnerEnterprise
/** 
 * The enterprise that owns this policy.
**/
export class MetadataCascadePolicyOwnerEnterprise extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: MetadataCascadePolicyOwnerEnterpriseTypeEnum;
}

export enum MetadataCascadePolicyParentTypeEnum {
    Folder = "folder"
}


// MetadataCascadePolicyParent
/** 
 * Represent the folder the policy is applied to.
**/
export class MetadataCascadePolicyParent extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: MetadataCascadePolicyParentTypeEnum;
}

export enum MetadataCascadePolicyScopeEnum {
    Global = "global",
    EnterpriseWildcard = "enterprise_*"
}

export enum MetadataCascadePolicyTypeEnum {
    MetadataCascadePolicy = "metadata_cascade_policy"
}


// MetadataCascadePolicy
/** 
 * A metadata cascade policy automatically applies a metadata template instance
 * to all the files and folders within the targeted folder.
**/
export class MetadataCascadePolicy extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=owner_enterprise" })
  ownerEnterprise?: MetadataCascadePolicyOwnerEnterprise;

  @SpeakeasyMetadata({ data: "json, name=parent" })
  parent?: MetadataCascadePolicyParent;

  @SpeakeasyMetadata({ data: "json, name=scope" })
  scope?: MetadataCascadePolicyScopeEnum;

  @SpeakeasyMetadata({ data: "json, name=templateKey" })
  templateKey?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: MetadataCascadePolicyTypeEnum;
}
