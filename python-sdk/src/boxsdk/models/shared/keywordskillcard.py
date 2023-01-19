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
class KeywordSkillCardEntries:
    r"""KeywordSkillCardEntries
    An entry in the `entries` attribute of a metadata card
    """
    
    text: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('text') }})
    
class KeywordSkillCardInvocationTypeEnum(str, Enum):
    SKILL_INVOCATION = "skill_invocation"


@dataclass_json
@dataclasses.dataclass
class KeywordSkillCardInvocation:
    r"""KeywordSkillCardInvocation
    The invocation of this service, used to track
    which instance of a service applied the metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: KeywordSkillCardInvocationTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class KeywordSkillCardSkillTypeEnum(str, Enum):
    SERVICE = "service"


@dataclass_json
@dataclasses.dataclass
class KeywordSkillCardSkill:
    r"""KeywordSkillCardSkill
    The service that applied this metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: KeywordSkillCardSkillTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class KeywordSkillCardSkillCardTitle:
    r"""KeywordSkillCardSkillCardTitle
    The title of the card.
    """
    
    message: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    code: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('code') }})
    
class KeywordSkillCardSkillCardTypeEnum(str, Enum):
    KEYWORD = "keyword"

class KeywordSkillCardTypeEnum(str, Enum):
    SKILL_CARD = "skill_card"


@dataclass_json
@dataclasses.dataclass
class KeywordSkillCard:
    r"""KeywordSkillCard
    A skill card that contains a set of keywords
    """
    
    entries: list[KeywordSkillCardEntries] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('entries') }})
    invocation: KeywordSkillCardInvocation = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('invocation') }})
    skill: KeywordSkillCardSkill = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill') }})
    skill_card_type: KeywordSkillCardSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_type') }})
    type: KeywordSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    skill_card_title: Optional[KeywordSkillCardSkillCardTitle] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_title') }})
    
