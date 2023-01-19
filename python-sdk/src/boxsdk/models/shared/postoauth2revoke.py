import dataclasses
from typing import Optional


@dataclasses.dataclass
class PostOAuth2Revoke:
    r"""PostOAuth2Revoke
    A request to revoke an OAuth 2.0 token
    """
    
    client_id: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'client_id' }})
    client_secret: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'client_secret' }})
    token: Optional[str] = dataclasses.field(default=None, metadata={'form': { 'field_name': 'token' }})
    
