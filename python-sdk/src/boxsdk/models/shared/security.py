import dataclasses



@dataclasses.dataclass
class SchemeOAuth2Security:
    authorization: str = dataclasses.field(metadata={'security': { 'field_name': 'Authorization' }})
    

@dataclasses.dataclass
class Security:
    o_auth2_security: SchemeOAuth2Security = dataclasses.field(metadata={'security': { 'scheme': True, 'type': 'oauth2' }})
    
