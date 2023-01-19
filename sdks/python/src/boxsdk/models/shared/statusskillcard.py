import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class StatusSkillCardInvocationTypeEnum(str, Enum):
    SKILL_INVOCATION = "skill_invocation"


@dataclass_json
@dataclasses.dataclass
class StatusSkillCardInvocation:
    r"""StatusSkillCardInvocation
    The invocation of this service, used to track
    which instance of a service applied the metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: StatusSkillCardInvocationTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class StatusSkillCardSkillTypeEnum(str, Enum):
    SERVICE = "service"


@dataclass_json
@dataclasses.dataclass
class StatusSkillCardSkill:
    r"""StatusSkillCardSkill
    The service that applied this metadata.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: StatusSkillCardSkillTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class StatusSkillCardSkillCardTitle:
    r"""StatusSkillCardSkillCardTitle
    The title of the card.
    """
    
    message: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    code: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('code') }})
    
class StatusSkillCardSkillCardTypeEnum(str, Enum):
    STATUS = "status"

class StatusSkillCardStatusCodeEnum(str, Enum):
    INVOKED = "invoked"
    PROCESSING = "processing"
    SUCCESS = "success"
    TRANSIENT_FAILURE = "transient_failure"
    PERMANENT_FAILURE = "permanent_failure"


@dataclass_json
@dataclasses.dataclass
class StatusSkillCardStatus:
    r"""StatusSkillCardStatus
    Sets the status of the skill. This can be used to show a message to the user while the Skill is processing the data, or if it was not able to process the file.
    """
    
    code: StatusSkillCardStatusCodeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('code') }})
    message: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('message') }})
    
class StatusSkillCardTypeEnum(str, Enum):
    SKILL_CARD = "skill_card"


@dataclass_json
@dataclasses.dataclass
class StatusSkillCard:
    r"""StatusSkillCard
    A Box Skill metadata card that puts a status message in the metadata sidebar.
    """
    
    invocation: StatusSkillCardInvocation = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('invocation') }})
    skill: StatusSkillCardSkill = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill') }})
    skill_card_type: StatusSkillCardSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_type') }})
    status: StatusSkillCardStatus = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    type: StatusSkillCardTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    created_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('created_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    skill_card_title: Optional[StatusSkillCardSkillCardTitle] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('skill_card_title') }})
    
