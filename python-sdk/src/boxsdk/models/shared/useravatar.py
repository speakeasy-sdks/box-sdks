import dataclasses
from typing import Optional
from dataclasses_json import dataclass_json
from boxsdk import utils


@dataclass_json
@dataclasses.dataclass
class UserAvatarPicUrls:
    r"""UserAvatarPicUrls
    Represents an object with user avatar URLs.
    """
    
    large: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('large') }})
    preview: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('preview') }})
    small: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('small') }})
    

@dataclass_json
@dataclasses.dataclass
class UserAvatar:
    r"""UserAvatar
    A resource holding URLs to the
    avatar uploaded to a Box application.
    """
    
    pic_urls: Optional[UserAvatarPicUrls] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('pic_urls') }})
    
