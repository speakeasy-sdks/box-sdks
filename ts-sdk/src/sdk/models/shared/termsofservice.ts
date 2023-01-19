import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum TermsOfServiceEnterpriseTypeEnum {
    Enterprise = "enterprise"
}


// TermsOfServiceEnterprise
/** 
 * A representation of a Box enterprise
**/
export class TermsOfServiceEnterprise extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TermsOfServiceEnterpriseTypeEnum;
}

export enum TermsOfServiceStatusEnum {
    Enabled = "enabled",
    Disabled = "disabled"
}

export enum TermsOfServiceTosTypeEnum {
    Managed = "managed",
    External = "external"
}

export enum TermsOfServiceTypeEnum {
    TermsOfService = "terms_of_service"
}


// TermsOfService
/** 
 * The root-level record that is supposed to represent a
 * single Terms of Service.
**/
export class TermsOfService extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=enterprise" })
  enterprise?: TermsOfServiceEnterprise;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: TermsOfServiceStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=text" })
  text?: string;

  @SpeakeasyMetadata({ data: "json, name=tos_type" })
  tosType?: TermsOfServiceTosTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: TermsOfServiceTypeEnum;
}
