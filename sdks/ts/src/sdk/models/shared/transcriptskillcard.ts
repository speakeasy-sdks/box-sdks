import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// TranscriptSkillCardEntriesAppears
/** 
 * The timestamp for an entry.
**/
export class TranscriptSkillCardEntriesAppears extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=start" })
  start?: number;
}


// TranscriptSkillCardEntries
/** 
 * An entry in the `entries` attribute of a metadata card
**/
export class TranscriptSkillCardEntries extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=appears", elemType: TranscriptSkillCardEntriesAppears })
  appears?: TranscriptSkillCardEntriesAppears[];

  @SpeakeasyMetadata({ data: "json, name=text" })
  text?: string;
}

export enum TranscriptSkillCardInvocationTypeEnum {
    SkillInvocation = "skill_invocation"
}


// TranscriptSkillCardInvocation
/** 
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
export class TranscriptSkillCardInvocation extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TranscriptSkillCardInvocationTypeEnum;
}

export enum TranscriptSkillCardSkillTypeEnum {
    Service = "service"
}


// TranscriptSkillCardSkill
/** 
 * The service that applied this metadata.
**/
export class TranscriptSkillCardSkill extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TranscriptSkillCardSkillTypeEnum;
}


// TranscriptSkillCardSkillCardTitle
/** 
 * The title of the card.
**/
export class TranscriptSkillCardSkillCardTitle extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code?: string;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message: string;
}

export enum TranscriptSkillCardSkillCardTypeEnum {
    Transcript = "transcript"
}

export enum TranscriptSkillCardTypeEnum {
    SkillCard = "skill_card"
}


// TranscriptSkillCard
/** 
 * A Box Skill metadata card that adds a transcript to a file.
**/
export class TranscriptSkillCard extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=duration" })
  duration?: number;

  @SpeakeasyMetadata({ data: "json, name=entries", elemType: TranscriptSkillCardEntries })
  entries: TranscriptSkillCardEntries[];

  @SpeakeasyMetadata({ data: "json, name=invocation" })
  invocation: TranscriptSkillCardInvocation;

  @SpeakeasyMetadata({ data: "json, name=skill" })
  skill: TranscriptSkillCardSkill;

  @SpeakeasyMetadata({ data: "json, name=skill_card_title" })
  skillCardTitle?: TranscriptSkillCardSkillCardTitle;

  @SpeakeasyMetadata({ data: "json, name=skill_card_type" })
  skillCardType: TranscriptSkillCardSkillCardTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: TranscriptSkillCardTypeEnum;
}
