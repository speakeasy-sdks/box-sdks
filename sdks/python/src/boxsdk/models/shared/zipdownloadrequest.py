import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class ZipDownloadRequestItemsTypeEnum(str, Enum):
    FILE = "file"
    FOLDER_ = "folder."


@dataclass_json
@dataclasses.dataclass
class ZipDownloadRequestItems:
    r"""ZipDownloadRequestItems
    An item to add to the `zip` archive. This can be a file or a folder.
    """
    
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: ZipDownloadRequestItemsTypeEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    

@dataclass_json
@dataclasses.dataclass
class ZipDownloadRequest:
    r"""ZipDownloadRequest
    A request to create a `zip` archive to download
    """
    
    items: list[ZipDownloadRequestItems] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('items') }})
    download_file_name: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('download_file_name') }})
    
