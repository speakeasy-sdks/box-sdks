import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { TermsOfServiceBase } from "./termsofservicebase";
import { UserMini } from "./usermini";



export class CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=enterprise_has_strong_password_required_for_external_users" })
  enterpriseHasStrongPasswordRequiredForExternalUsers?: boolean;

  @SpeakeasyMetadata({ data: "json, name=user_has_strong_password" })
  userHasStrongPassword?: boolean;
}


export class CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=is_accepted" })
  isAccepted?: boolean;

  @SpeakeasyMetadata({ data: "json, name=terms_of_service" })
  termsOfService?: TermsOfServiceBase;
}


export class CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=enterprise_has_two_factor_auth_enabled" })
  enterpriseHasTwoFactorAuthEnabled?: boolean;

  @SpeakeasyMetadata({ data: "json, name=user_has_two_factor_authentication_enabled" })
  userHasTwoFactorAuthenticationEnabled?: boolean;
}


export class CollaborationAcceptanceRequirementsStatus extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=strong_password_requirement" })
  strongPasswordRequirement?: CollaborationAcceptanceRequirementsStatusStrongPasswordRequirement;

  @SpeakeasyMetadata({ data: "json, name=terms_of_service_requirement" })
  termsOfServiceRequirement?: CollaborationAcceptanceRequirementsStatusTermsOfServiceRequirement;

  @SpeakeasyMetadata({ data: "json, name=two_factor_authentication_requirement" })
  twoFactorAuthenticationRequirement?: CollaborationAcceptanceRequirementsStatusTwoFactorAuthenticationRequirement;
}

export enum CollaborationUserBaseTypeEnum {
    User = "user"
}


// CollaborationUserBase
/** 
 * The user who created the collaboration object
**/
export class CollaborationUserBase extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=login" })
  login: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: CollaborationUserBaseTypeEnum;
}

export enum CollaborationRoleEnum {
    Editor = "editor",
    Viewer = "viewer",
    Previewer = "previewer",
    Uploader = "uploader",
    PreviewerUploader = "previewer uploader",
    ViewerUploader = "viewer uploader",
    CoOwner = "co-owner",
    Owner = "owner"
}

export enum CollaborationStatusEnum {
    Accepted = "accepted",
    Pending = "pending",
    Rejected = "rejected"
}

export enum CollaborationTypeEnum {
    Collaboration = "collaboration"
}


// Collaboration
/** 
 * Collaborations define access permissions for users and groups to files and
 * folders, similar to access control lists. A collaboration object grants a
 * user or group access to a file or folder with permissions defined by a
 * specific role.
**/
export class Collaboration extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=acceptance_requirements_status" })
  acceptanceRequirementsStatus?: CollaborationAcceptanceRequirementsStatus;

  @SpeakeasyMetadata({ data: "json, name=accessible_by" })
  accessibleBy?: UserMini;

  @SpeakeasyMetadata({ data: "json, name=acknowledged_at" })
  acknowledgedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=created_by" })
  createdBy?: CollaborationUserBase;

  @SpeakeasyMetadata({ data: "json, name=expires_at" })
  expiresAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=invite_email" })
  inviteEmail?: string;

  @SpeakeasyMetadata({ data: "json, name=item" })
  item?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=modified_at" })
  modifiedAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=role" })
  role?: CollaborationRoleEnum;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: CollaborationStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: CollaborationTypeEnum;
}
