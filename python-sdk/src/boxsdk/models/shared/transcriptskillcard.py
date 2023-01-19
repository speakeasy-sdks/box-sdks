import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class TranscriptSkillCardEntriesAppears:
    r"""TranscriptSkillCardEntriesAppears
    The timestamp for an entry.
    """
    
    start: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('start') }})
    

@dataclass_json
@dataclasses.dataclass
class TranscriptSkillCardEntries:
    r"""TranscriptSkillCardEntries
    An entry in the `entries` attribute of a metadata card
    """
    
    appears: Optional[list[TranscriptSkillCardEntriesAppears]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('appears') }})
    text: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('text') }})
    
class TranscriptSkillCardInvocationTypeEnum(str, Enum):
    SKILL_INVOCATION = "skill_invocation"


@dataclass_json
@dataclasses.dataclass
class TranscriptSkillCardInvocation:
    r"""TranscriptSkillCardInvocation
    The invocation of this service, used to track
    which instance of a service applied the metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: TranscriptSkillCardInvocationTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class TranscriptSkillCardSkillTypeEnum(str, Enum):
    SERVICE = "service"


@dataclass_json
@dataclasses.dataclass
class TranscriptSkillCardSkill:
    r"""TranscriptSkillCardSkill
    The service that applied this metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: TranscriptSkillCardSkillTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class TranscriptSkillCardSkillCardTitle:
    r"""TranscriptSkillCardSkillCardTitle
    The title of the card.
    """
    
    message: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    code: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('code') }})
    
class TranscriptSkillCardSkillCardTypeEnum(str, Enum):
    TRANSCRIPT = "transcript"

class TranscriptSkillCardTypeEnum(str, Enum):
    SKILL_CARD = "skill_card"


@dataclass_json
@dataclasses.dataclass
class TranscriptSkillCard:
    r"""TranscriptSkillCard
    A Box Skill metadata card that adds a transcript to a file.
    """
    
    entries: list[TranscriptSkillCardEntries] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    invocation: TranscriptSkillCardInvocation = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('invocation') }})
    skill: TranscriptSkillCardSkill = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill') }})
    skill_card_type: TranscriptSkillCardSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_type') }})
    type: TranscriptSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    duration: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('duration') }})
    skill_card_title: Optional[TranscriptSkillCardSkillCardTitle] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_title') }})
    
