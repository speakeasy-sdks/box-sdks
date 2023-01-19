import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class ZipDownloadStatusStateEnum(str, Enum):
    IN_PROGRESS = "in_progress"
    FAILED = "failed"
    SUCCESS = "success"


@dataclass_json
@dataclasses.dataclass
class ZipDownloadStatus:
    r"""ZipDownloadStatus
    The status of a `zip` archive being downloaded.
    """
    
    downloaded_file_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('downloaded_file_count') }})
    skipped_file_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('skipped_file_count') }})
    skipped_folder_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('skipped_folder_count') }})
    state: Optional[ZipDownloadStatusStateEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('state') }})
    total_file_count: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('total_file_count') }})
    
