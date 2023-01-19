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
class TimelineSkillCardEntriesAppears:
    r"""TimelineSkillCardEntriesAppears
    The timestamp for an entry.
    """
    
    end: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('end') }})
    start: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('start') }})
    

@dataclass_json
@dataclasses.dataclass
class TimelineSkillCardEntries:
    r"""TimelineSkillCardEntries
    An single item that's placed on multiple items on the timeline.
    """
    
    appears: Optional[list[TimelineSkillCardEntriesAppears]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('appears') }})
    image_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('image_url') }})
    text: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('text') }})
    
class TimelineSkillCardInvocationTypeEnum(str, Enum):
    SKILL_INVOCATION = "skill_invocation"


@dataclass_json
@dataclasses.dataclass
class TimelineSkillCardInvocation:
    r"""TimelineSkillCardInvocation
    The invocation of this service, used to track
    which instance of a service applied the metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: TimelineSkillCardInvocationTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class TimelineSkillCardSkillTypeEnum(str, Enum):
    SERVICE = "service"


@dataclass_json
@dataclasses.dataclass
class TimelineSkillCardSkill:
    r"""TimelineSkillCardSkill
    The service that applied this metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: TimelineSkillCardSkillTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class TimelineSkillCardSkillCardTitle:
    r"""TimelineSkillCardSkillCardTitle
    The title of the card.
    """
    
    message: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    code: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('code') }})
    
class TimelineSkillCardSkillCardTypeEnum(str, Enum):
    TIMELINE = "timeline"

class TimelineSkillCardTypeEnum(str, Enum):
    SKILL_CARD = "skill_card"


@dataclass_json
@dataclasses.dataclass
class TimelineSkillCard:
    r"""TimelineSkillCard
    A Box Skill metadata card that places a list of images on a
    timeline.
    """
    
    entries: list[TimelineSkillCardEntries] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    invocation: TimelineSkillCardInvocation = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('invocation') }})
    skill: TimelineSkillCardSkill = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill') }})
    skill_card_type: TimelineSkillCardSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_type') }})
    type: TimelineSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    duration: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('duration') }})
    skill_card_title: Optional[TimelineSkillCardSkillCardTitle] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_title') }})
    
