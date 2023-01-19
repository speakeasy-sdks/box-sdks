import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils
from ..shared import file_mini as shared_file_mini

class FileScopeScopeEnum(str, Enum):
    ANNOTATION_EDIT = "annotation_edit"
    ANNOTATION_VIEW_ALL = "annotation_view_all"
    ANNOTATION_VIEW_SELF = "annotation_view_self"
    BASE_EXPLORER = "base_explorer"
    BASE_PICKER = "base_picker"
    BASE_PREVIEW = "base_preview"
    BASE_UPLOAD = "base_upload"
    ITEM_DELETE = "item_delete"
    ITEM_DOWNLOAD = "item_download"
    ITEM_PREVIEW = "item_preview"
    ITEM_RENAME = "item_rename"
    ITEM_SHARE = "item_share"


@dataclass_json
@dataclasses.dataclass
class FileScope:
    r"""FileScope
    A relation between a file and the scopes for which the file can be accessed
    """
    
    object: Optional[shared_file_mini.FileMini] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('object') }})
    scope: Optional[FileScopeScopeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('scope') }})
    
