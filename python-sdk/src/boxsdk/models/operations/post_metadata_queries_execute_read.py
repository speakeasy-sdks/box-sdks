import dataclasses
from typing import Optional
from boxsdk import utils
from ..shared import metadataquery as shared_metadataquery
from ..shared import clienterror as shared_clienterror
from ..shared import metadataqueryresults as shared_metadataqueryresults


@dataclasses.dataclass
class PostMetadataQueriesExecuteReadRequest:
    request: Optional[shared_metadataquery.MetadataQuery] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    retries: Optional[utils.RetryConfig] = dataclasses.field(default=None)
    

@dataclasses.dataclass
class PostMetadataQueriesExecuteReadResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    client_error: Optional[shared_clienterror.ClientError] = dataclasses.field(default=None)
    metadata_query_results: Optional[shared_metadataqueryresults.MetadataQueryResults] = dataclasses.field(default=None)
    
