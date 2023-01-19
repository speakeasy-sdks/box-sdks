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
from ..shared import retentionpolicy_mini as shared_retentionpolicy_mini

class FileVersionRetentionTypeEnum(str, Enum):
    FILE_VERSION_RETENTION = "file_version_retention"


@dataclass_json
@dataclasses.dataclass
class FileVersionRetention:
    r"""FileVersionRetention
    A retention policy blocks permanent deletion of content
    for a specified amount of time. Admins can apply policies to
    specified folders, or an entire enterprise. A file version retention
    is a  record for a retained file version. To use this feature,
    you must  have the manage retention policies scope enabled for your
    API key via  your application management console. For more information
    about retention policies, please visit our help documentation
    """
    
    applied_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('applied_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    disposition_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('disposition_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    file: Optional[shared_file_mini.FileMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('file') }})
    file_version: Optional[shared_fileversion_mini.FileVersionMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('file_version') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[FileVersionRetentionTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    winning_retention_policy: Optional[shared_retentionpolicy_mini.RetentionPolicyMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('winning_retention_policy') }})
    
