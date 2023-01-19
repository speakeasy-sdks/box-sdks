import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { SkillCard } from "./skillcard";
import { KeywordSkillCard } from "./keywordskillcard";
import { TimelineSkillCard } from "./timelineskillcard";
import { TranscriptSkillCard } from "./transcriptskillcard";
import { StatusSkillCard } from "./statusskillcard";



// SkillCardsMetadata
/** 
 * The metadata assigned to a using for Box skills.
**/
export class SkillCardsMetadata extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=$canEdit" })
  dollarCanEdit?: boolean;

  @SpeakeasyMetadata({ data: "json, name=$id" })
  dollarId?: string;

  @SpeakeasyMetadata({ data: "json, name=$parent" })
  dollarParent?: string;

  @SpeakeasyMetadata({ data: "json, name=$scope" })
  dollarScope?: string;

  @SpeakeasyMetadata({ data: "json, name=$template" })
  dollarTemplate?: string;

  @SpeakeasyMetadata({ data: "json, name=$type" })
  dollarType?: string;

  @SpeakeasyMetadata({ data: "json, name=$typeVersion" })
  dollarTypeVersion?: number;

  @SpeakeasyMetadata({ data: "json, name=$version" })
  dollarVersion?: number;

  @SpeakeasyMetadata({ data: "json, name=cards" })
  cards?: any[];
}
