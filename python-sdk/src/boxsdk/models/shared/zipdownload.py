import dataclasses
from datetime import date, datetime
from marshmallow import fields
import dateutil.parser
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class ZipDownloadNameConflictsTypeEnum(str, Enum):
    FILE = "file"
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class ZipDownloadNameConflicts:
    r"""ZipDownloadNameConflicts
    A file or folder for which a conflict was encountered, This object provides the type and identifier of the original item, as well as a mapping between its original name and it's new name as it will appear in the archive.
    """
    
    download_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_name') }})
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    original_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('original_name') }})
    type: Optional[ZipDownloadNameConflictsTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class ZipDownload:
    r"""ZipDownload
    Represents a successful request to create a `zip` archive of a list of files
    and folders.
    """
    
    download_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_url') }})
    expires_at: Optional[datetime] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('expires_at'), 'encoder': utils.datetimeisoformat(True), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    name_conflicts: Optional[list[list[ZipDownloadNameConflicts]]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('name_conflicts') }})
    status_url: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('status_url') }})
    
