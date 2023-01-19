import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// SkillCardEntriesAppears
/** 
 * The timestamp for an entry.
**/
export class SkillCardEntriesAppears extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=end" })
  end?: number;

  @SpeakeasyMetadata({ data: "json, name=start" })
  start?: number;
}


// SkillCardEntries
/** 
 * An entry in the `entries` attribute of a metadata card
**/
export class SkillCardEntries extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=appears", elemType: SkillCardEntriesAppears })
  appears?: SkillCardEntriesAppears[];

  @SpeakeasyMetadata({ data: "json, name=image_url" })
  imageUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=text" })
  text?: string;
}

export enum SkillCardInvocationTypeEnum {
    SkillInvocation = "skill_invocation"
}


// SkillCardInvocation
/** 
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
export class SkillCardInvocation extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: SkillCardInvocationTypeEnum;
}

export enum SkillCardSkillTypeEnum {
    Service = "service"
}


// SkillCardSkill
/** 
 * The service that applied this metadata.
**/
export class SkillCardSkill extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: SkillCardSkillTypeEnum;
}


// SkillCardSkillCardTitle
/** 
 * The title of the card.
**/
export class SkillCardSkillCardTitle extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code?: string;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message: string;
}

export enum SkillCardSkillCardTypeEnum {
    Transcript = "transcript",
    Keyword = "keyword",
    Timeline = "timeline",
    Status = "status"
}

export enum SkillCardStatusCodeEnum {
    Invoked = "invoked",
    Processing = "processing",
    Success = "success",
    TransientFailure = "transient_failure",
    PermanentFailure = "permanent_failure"
}


// SkillCardStatus
/** 
 * Used with a card of type `status` to set the status of the skill. This can be used to show a message to the user while the Skill is processing the data.
**/
export class SkillCardStatus extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code: SkillCardStatusCodeEnum;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;
}

export enum SkillCardTypeEnum {
    SkillCard = "skill_card"
}


// SkillCard
/** 
 * A generic Box Skill metadata card.
**/
export class SkillCard extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=duration" })
  duration?: number;

  @SpeakeasyMetadata({ data: "json, name=entries", elemType: SkillCardEntries })
  entries?: SkillCardEntries[];

  @SpeakeasyMetadata({ data: "json, name=invocation" })
  invocation: SkillCardInvocation;

  @SpeakeasyMetadata({ data: "json, name=skill" })
  skill: SkillCardSkill;

  @SpeakeasyMetadata({ data: "json, name=skill_card_title" })
  skillCardTitle?: SkillCardSkillCardTitle;

  @SpeakeasyMetadata({ data: "json, name=skill_card_type" })
  skillCardType: SkillCardSkillCardTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: SkillCardStatus;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: SkillCardTypeEnum;
}
