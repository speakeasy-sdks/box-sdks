import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum StatusSkillCardInvocationTypeEnum {
    SkillInvocation = "skill_invocation"
}


// StatusSkillCardInvocation
/** 
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
export class StatusSkillCardInvocation extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: StatusSkillCardInvocationTypeEnum;
}

export enum StatusSkillCardSkillTypeEnum {
    Service = "service"
}


// StatusSkillCardSkill
/** 
 * The service that applied this metadata.
**/
export class StatusSkillCardSkill extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: StatusSkillCardSkillTypeEnum;
}


// StatusSkillCardSkillCardTitle
/** 
 * The title of the card.
**/
export class StatusSkillCardSkillCardTitle extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code?: string;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message: string;
}

export enum StatusSkillCardSkillCardTypeEnum {
    Status = "status"
}

export enum StatusSkillCardStatusCodeEnum {
    Invoked = "invoked",
    Processing = "processing",
    Success = "success",
    TransientFailure = "transient_failure",
    PermanentFailure = "permanent_failure"
}


// StatusSkillCardStatus
/** 
 * Sets the status of the skill. This can be used to show a message to the user while the Skill is processing the data, or if it was not able to process the file.
**/
export class StatusSkillCardStatus extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code: StatusSkillCardStatusCodeEnum;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;
}

export enum StatusSkillCardTypeEnum {
    SkillCard = "skill_card"
}


// StatusSkillCard
/** 
 * A Box Skill metadata card that puts a status message in the metadata sidebar.
**/
export class StatusSkillCard extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=invocation" })
  invocation: StatusSkillCardInvocation;

  @SpeakeasyMetadata({ data: "json, name=skill" })
  skill: StatusSkillCardSkill;

  @SpeakeasyMetadata({ data: "json, name=skill_card_title" })
  skillCardTitle?: StatusSkillCardSkillCardTitle;

  @SpeakeasyMetadata({ data: "json, name=skill_card_type" })
  skillCardType: StatusSkillCardSkillCardTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status: StatusSkillCardStatus;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: StatusSkillCardTypeEnum;
}
