import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import file_mini as shared_file_mini
from ..shared import fileversion_mini as shared_fileversion_mini
from ..shared import legalholdpolicyassignment as shared_legalholdpolicyassignment

class FileVersionLegalHoldTypeEnum(str, Enum):
    FILE_VERSION_LEGAL_HOLD = "file_version_legal_hold"


@dataclass_json
@dataclasses.dataclass
class FileVersionLegalHold:
    r"""FileVersionLegalHold
    File-Version-Legal-Hold is an entity representing all
    holds on a File Version.
    """
    
    deleted_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('deleted_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    file: Optional[shared_file_mini.FileMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('file') }})
    file_version: Optional[shared_fileversion_mini.FileVersionMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('file_version') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    legal_hold_policy_assignments: Optional[list[shared_legalholdpolicyassignment.LegalHoldPolicyAssignment]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('legal_hold_policy_assignments') }})
    type: Optional[FileVersionLegalHoldTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
