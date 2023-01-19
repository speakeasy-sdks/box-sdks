import dataclasses
from typing import Optional
from enum import Enum
from dataclasses_json import dataclass_json
from boxsdk import utils

class MetadataCascadePolicyOwnerEnterpriseTypeEnum(str, Enum):
    ENTERPRISE = "enterprise"


@dataclass_json
@dataclasses.dataclass
class MetadataCascadePolicyOwnerEnterprise:
    r"""MetadataCascadePolicyOwnerEnterprise
    The enterprise that owns this policy.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[MetadataCascadePolicyOwnerEnterpriseTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class MetadataCascadePolicyParentTypeEnum(str, Enum):
    FOLDER = "folder"


@dataclass_json
@dataclasses.dataclass
class MetadataCascadePolicyParent:
    r"""MetadataCascadePolicyParent
    Represent the folder the policy is applied to.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    type: Optional[MetadataCascadePolicyParentTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
class MetadataCascadePolicyScopeEnum(str, Enum):
    GLOBAL = "global"
    ENTERPRISE_WILDCARD_ = "enterprise_*"

class MetadataCascadePolicyTypeEnum(str, Enum):
    METADATA_CASCADE_POLICY = "metadata_cascade_policy"


@dataclass_json
@dataclasses.dataclass
class MetadataCascadePolicy:
    r"""MetadataCascadePolicy
    A metadata cascade policy automatically applies a metadata template instance
    to all the files and folders within the targeted folder.
    """
    
    id: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    owner_enterprise: Optional[MetadataCascadePolicyOwnerEnterprise] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('owner_enterprise') }})
    parent: Optional[MetadataCascadePolicyParent] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('parent') }})
    scope: Optional[MetadataCascadePolicyScopeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('scope') }})
    template_key: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('templateKey') }})
    type: Optional[MetadataCascadePolicyTypeEnum] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('type') }})
    
