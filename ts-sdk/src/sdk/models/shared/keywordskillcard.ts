import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";



// KeywordSkillCardEntries
/** 
 * An entry in the `entries` attribute of a metadata card
**/
export class KeywordSkillCardEntries extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=text" })
  text?: string;
}

export enum KeywordSkillCardInvocationTypeEnum {
    SkillInvocation = "skill_invocation"
}


// KeywordSkillCardInvocation
/** 
 * The invocation of this service, used to track
 * which instance of a service applied the metadata.
**/
export class KeywordSkillCardInvocation extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: KeywordSkillCardInvocationTypeEnum;
}

export enum KeywordSkillCardSkillTypeEnum {
    Service = "service"
}


// KeywordSkillCardSkill
/** 
 * The service that applied this metadata.
**/
export class KeywordSkillCardSkill extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: KeywordSkillCardSkillTypeEnum;
}


// KeywordSkillCardSkillCardTitle
/** 
 * The title of the card.
**/
export class KeywordSkillCardSkillCardTitle extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code?: string;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message: string;
}

export enum KeywordSkillCardSkillCardTypeEnum {
    Keyword = "keyword"
}

export enum KeywordSkillCardTypeEnum {
    SkillCard = "skill_card"
}


// KeywordSkillCard
/** 
 * A skill card that contains a set of keywords
**/
export class KeywordSkillCard extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=created_at" })
  createdAt?: Date;

  @SpeakeasyMetadata({ data: "json, name=entries", elemType: KeywordSkillCardEntries })
  entries: KeywordSkillCardEntries[];

  @SpeakeasyMetadata({ data: "json, name=invocation" })
  invocation: KeywordSkillCardInvocation;

  @SpeakeasyMetadata({ data: "json, name=skill" })
  skill: KeywordSkillCardSkill;

  @SpeakeasyMetadata({ data: "json, name=skill_card_title" })
  skillCardTitle?: KeywordSkillCardSkillCardTitle;

  @SpeakeasyMetadata({ data: "json, name=skill_card_type" })
  skillCardType: KeywordSkillCardSkillCardTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: KeywordSkillCardTypeEnum;
}
