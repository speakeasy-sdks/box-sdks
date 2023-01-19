import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// TimelineSkillCardEntriesAppears
/** 
 * The timestamp for an entry.
**/
export class TimelineSkillCardEntriesAppears extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=end" })
  end?: number;

  @SpeakeasyMetadata({ data: "json, name=start" })
  start?: number;
}


// TimelineSkillCardEntries
/** 
 * An single item that's placed on multiple items on the timeline.
**/
export class TimelineSkillCardEntries extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=appears", elemType: TimelineSkillCardEntriesAppears })
  appears?: TimelineSkillCardEntriesAppears[];

  @SpeakeasyMetadata({ data: "json, name=image_url" })
  imageUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=text" })
  text?: string;
}

export enum TimelineSkillCardInvocationTypeEnum {
    SkillInvocation = "skill_invocation"
}


// TimelineSkillCardInvocation
/** 
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
export class TimelineSkillCardInvocation extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TimelineSkillCardInvocationTypeEnum;
}

export enum TimelineSkillCardSkillTypeEnum {
    Service = "service"
}


// TimelineSkillCardSkill
/** 
 * The service that applied this metadata.
**/
export class TimelineSkillCardSkill extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TimelineSkillCardSkillTypeEnum;
}


// TimelineSkillCardSkillCardTitle
/** 
 * The title of the card.
**/
export class TimelineSkillCardSkillCardTitle extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code?: string;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message: string;
}

export enum TimelineSkillCardSkillCardTypeEnum {
    Timeline = "timeline"
}

export enum TimelineSkillCardTypeEnum {
    SkillCard = "skill_card"
}


// TimelineSkillCard
/** 
 * A Box Skill metadata card that places a list of images on a
 * timeline.
**/
export class TimelineSkillCard extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=duration" })
  duration?: number;

  @SpeakeasyMetadata({ data: "json, name=entries", elemType: TimelineSkillCardEntries })
  entries: TimelineSkillCardEntries[];

  @SpeakeasyMetadata({ data: "json, name=invocation" })
  invocation: TimelineSkillCardInvocation;

  @SpeakeasyMetadata({ data: "json, name=skill" })
  skill: TimelineSkillCardSkill;

  @SpeakeasyMetadata({ data: "json, name=skill_card_title" })
  skillCardTitle?: TimelineSkillCardSkillCardTitle;

  @SpeakeasyMetadata({ data: "json, name=skill_card_type" })
  skillCardType: TimelineSkillCardSkillCardTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TimelineSkillCardTypeEnum;
}
