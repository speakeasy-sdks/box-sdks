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
class SkillCardEntriesAppears:
    r"""SkillCardEntriesAppears
    The timestamp for an entry.
    """
    
    end: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('end') }})
    start: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('start') }})
    

@dataclass_json
@dataclasses.dataclass
class SkillCardEntries:
    r"""SkillCardEntries
    An entry in the `entries` attribute of a metadata card
    """
    
    appears: Optional[list[SkillCardEntriesAppears]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('appears') }})
    image_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('image_url') }})
    text: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('text') }})
    
class SkillCardInvocationTypeEnum(str, Enum):
    SKILL_INVOCATION = "skill_invocation"


@dataclass_json
@dataclasses.dataclass
class SkillCardInvocation:
    r"""SkillCardInvocation
    The invocation of this service, used to track
    which instance of a service applied the metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: SkillCardInvocationTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class SkillCardSkillTypeEnum(str, Enum):
    SERVICE = "service"


@dataclass_json
@dataclasses.dataclass
class SkillCardSkill:
    r"""SkillCardSkill
    The service that applied this metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: SkillCardSkillTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class SkillCardSkillCardTitle:
    r"""SkillCardSkillCardTitle
    The title of the card.
    """
    
    message: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    code: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('code') }})
    
class SkillCardSkillCardTypeEnum(str, Enum):
    TRANSCRIPT = "transcript"
    KEYWORD = "keyword"
    TIMELINE = "timeline"
    STATUS = "status"

class SkillCardStatusCodeEnum(str, Enum):
    INVOKED = "invoked"
    PROCESSING = "processing"
    SUCCESS = "success"
    TRANSIENT_FAILURE = "transient_failure"
    PERMANENT_FAILURE = "permanent_failure"


@dataclass_json
@dataclasses.dataclass
class SkillCardStatus:
    r"""SkillCardStatus
    Used with a card of type `status` to set the status of the skill. This can be used to show a message to the user while the Skill is processing the data.
    """
    
    code: SkillCardStatusCodeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('code') }})
    message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    
class SkillCardTypeEnum(str, Enum):
    SKILL_CARD = "skill_card"


@dataclass_json
@dataclasses.dataclass
class SkillCard:
    r"""SkillCard
    A generic Box Skill metadata card.
    """
    
    invocation: SkillCardInvocation = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('invocation') }})
    skill: SkillCardSkill = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill') }})
    skill_card_type: SkillCardSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_type') }})
    type: SkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    duration: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('duration') }})
    entries: Optional[list[SkillCardEntries]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    skill_card_title: Optional[SkillCardSkillCardTitle] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_title') }})
    status: Optional[SkillCardStatus] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    
