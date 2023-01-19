
__doc__ = """ SDK Documentation: https://developer.box.com - Box Developer Documentation"""
import requests
from boxsdk.models import shared
from . import utils

from .authorization import Authorization
from .box_sign import BoxSign
from .classifications import Classifications
from .classifications_on_files import ClassificationsOnFiles
from .classifications_on_folders import ClassificationsOnFolders
from .collaborations import Collaborations
from .collaborations_list_ import CollaborationsList
from .collections import Collections
from .comments import Comments
from .device_pinners import DevicePinners
from .domain_restrictions_user_exemptions_ import DomainRestrictionsUserExemptions
from .domain_restrictions_for_collaborations import DomainRestrictionsForCollaborations
from .downloads import Downloads
from .email_aliases import EmailAliases
from .events import Events
from .file_requests import FileRequests
from .file_version_legal_holds import FileVersionLegalHolds
from .file_version_retentions import FileVersionRetentions
from .file_versions import FileVersions
from .files import Files
from .folder_locks import FolderLocks
from .folders import Folders
from .group_memberships import GroupMemberships
from .groups import Groups
from .invites import Invites
from .legal_hold_policies import LegalHoldPolicies
from .legal_hold_policy_assignments import LegalHoldPolicyAssignments
from .metadata_cascade_policies import MetadataCascadePolicies
from .metadata_instances_files_ import MetadataInstancesFiles
from .metadata_instances_folders_ import MetadataInstancesFolders
from .metadata_templates import MetadataTemplates
from .recent_items import RecentItems
from .retention_policies import RetentionPolicies
from .retention_policy_assignments import RetentionPolicyAssignments
from .search import Search
from .shared_links_files_ import SharedLinksFiles
from .shared_links_folders_ import SharedLinksFolders
from .shared_links_web_links_ import SharedLinksWebLinks
from .shield_information_barrier_reports import ShieldInformationBarrierReports
from .shield_information_barrier_segment_members import ShieldInformationBarrierSegmentMembers
from .shield_information_barrier_segment_restrictions import ShieldInformationBarrierSegmentRestrictions
from .shield_information_barrier_segments import ShieldInformationBarrierSegments
from .shield_information_barriers import ShieldInformationBarriers
from .skills import Skills
from .storage_policies import StoragePolicies
from .storage_policy_assignments import StoragePolicyAssignments
from .task_assignments import TaskAssignments
from .tasks import Tasks
from .terms_of_service import TermsOfService
from .terms_of_service_user_statuses import TermsOfServiceUserStatuses
from .transfer_folders import TransferFolders
from .trashed_files import TrashedFiles
from .trashed_folders import TrashedFolders
from .trashed_items import TrashedItems
from .trashed_web_links import TrashedWebLinks
from .uploads import Uploads
from .uploads_chunked_ import UploadsChunked
from .user_avatars import UserAvatars
from .users import Users
from .watermarks_files_ import WatermarksFiles
from .watermarks_folders_ import WatermarksFolders
from .web_links import WebLinks
from .webhooks import Webhooks
from .workflows import Workflows
from .zip_downloads import ZipDownloads


SERVERS = [
	"https://api.box.com/2.0",
]


class Boxsdk:
    r"""SDK Documentation: https://developer.box.com - Box Developer Documentation"""
    authorization: Authorization
    box_sign: BoxSign
    classifications: Classifications
    classifications_on_files: ClassificationsOnFiles
    classifications_on_folders: ClassificationsOnFolders
    collaborations: Collaborations
    collaborations_list_: CollaborationsList
    collections: Collections
    comments: Comments
    device_pinners: DevicePinners
    domain_restrictions_user_exemptions_: DomainRestrictionsUserExemptions
    domain_restrictions_for_collaborations: DomainRestrictionsForCollaborations
    downloads: Downloads
    email_aliases: EmailAliases
    events: Events
    file_requests: FileRequests
    file_version_legal_holds: FileVersionLegalHolds
    file_version_retentions: FileVersionRetentions
    file_versions: FileVersions
    files: Files
    folder_locks: FolderLocks
    folders: Folders
    group_memberships: GroupMemberships
    groups: Groups
    invites: Invites
    legal_hold_policies: LegalHoldPolicies
    legal_hold_policy_assignments: LegalHoldPolicyAssignments
    metadata_cascade_policies: MetadataCascadePolicies
    metadata_instances_files_: MetadataInstancesFiles
    metadata_instances_folders_: MetadataInstancesFolders
    metadata_templates: MetadataTemplates
    recent_items: RecentItems
    retention_policies: RetentionPolicies
    retention_policy_assignments: RetentionPolicyAssignments
    search: Search
    shared_links_files_: SharedLinksFiles
    shared_links_folders_: SharedLinksFolders
    shared_links_web_links_: SharedLinksWebLinks
    shield_information_barrier_reports: ShieldInformationBarrierReports
    shield_information_barrier_segment_members: ShieldInformationBarrierSegmentMembers
    shield_information_barrier_segment_restrictions: ShieldInformationBarrierSegmentRestrictions
    shield_information_barrier_segments: ShieldInformationBarrierSegments
    shield_information_barriers: ShieldInformationBarriers
    skills: Skills
    storage_policies: StoragePolicies
    storage_policy_assignments: StoragePolicyAssignments
    task_assignments: TaskAssignments
    tasks: Tasks
    terms_of_service: TermsOfService
    terms_of_service_user_statuses: TermsOfServiceUserStatuses
    transfer_folders: TransferFolders
    trashed_files: TrashedFiles
    trashed_folders: TrashedFolders
    trashed_items: TrashedItems
    trashed_web_links: TrashedWebLinks
    uploads: Uploads
    uploads_chunked_: UploadsChunked
    user_avatars: UserAvatars
    users: Users
    watermarks_files_: WatermarksFiles
    watermarks_folders_: WatermarksFolders
    web_links: WebLinks
    webhooks: Webhooks
    workflows: Workflows
    zip_downloads: ZipDownloads

    _client: requests.Session
    _security_client: requests.Session
    _security: shared.Security
    _server_url: str = SERVERS[0]
    _language: str = "python"
    _sdk_version: str = "0.0.1"
    _gen_version: str = "0.20.3"

    def __init__(self) -> None:
        self._client = requests.Session()
        self._security_client = requests.Session()
        self._init_sdks()


    def config_server_url(self, server_url: str, params: dict[str, str]):
        if params is not None:
            self._server_url = utils.replace_parameters(server_url, params)
        else:
            self._server_url = server_url

        self._init_sdks()
    

    def config_client(self, client: requests.Session):
        self._client = client
        
        if self._security is not None:
            self._security_client = utils.configure_security_client(self._client, self._security)
        self._init_sdks()
    

    def config_security(self, security: shared.Security):
        self._security = security
        self._security_client = utils.configure_security_client(self._client, security)
        self._init_sdks()
    
    
    def _init_sdks(self):
        
        self.authorization = Authorization(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.box_sign = BoxSign(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.classifications = Classifications(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.classifications_on_files = ClassificationsOnFiles(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.classifications_on_folders = ClassificationsOnFolders(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.collaborations = Collaborations(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.collaborations_list_ = CollaborationsList(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.collections = Collections(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.comments = Comments(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.device_pinners = DevicePinners(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.domain_restrictions_user_exemptions_ = DomainRestrictionsUserExemptions(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.domain_restrictions_for_collaborations = DomainRestrictionsForCollaborations(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.downloads = Downloads(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.email_aliases = EmailAliases(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.events = Events(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.file_requests = FileRequests(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.file_version_legal_holds = FileVersionLegalHolds(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.file_version_retentions = FileVersionRetentions(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.file_versions = FileVersions(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.files = Files(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.folder_locks = FolderLocks(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.folders = Folders(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.group_memberships = GroupMemberships(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.groups = Groups(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.invites = Invites(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.legal_hold_policies = LegalHoldPolicies(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.legal_hold_policy_assignments = LegalHoldPolicyAssignments(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.metadata_cascade_policies = MetadataCascadePolicies(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.metadata_instances_files_ = MetadataInstancesFiles(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.metadata_instances_folders_ = MetadataInstancesFolders(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.metadata_templates = MetadataTemplates(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.recent_items = RecentItems(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.retention_policies = RetentionPolicies(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.retention_policy_assignments = RetentionPolicyAssignments(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.search = Search(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.shared_links_files_ = SharedLinksFiles(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.shared_links_folders_ = SharedLinksFolders(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.shared_links_web_links_ = SharedLinksWebLinks(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.shield_information_barrier_reports = ShieldInformationBarrierReports(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.shield_information_barrier_segment_members = ShieldInformationBarrierSegmentMembers(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.shield_information_barrier_segment_restrictions = ShieldInformationBarrierSegmentRestrictions(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.shield_information_barrier_segments = ShieldInformationBarrierSegments(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.shield_information_barriers = ShieldInformationBarriers(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.skills = Skills(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.storage_policies = StoragePolicies(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.storage_policy_assignments = StoragePolicyAssignments(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.task_assignments = TaskAssignments(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.tasks = Tasks(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.terms_of_service = TermsOfService(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.terms_of_service_user_statuses = TermsOfServiceUserStatuses(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.transfer_folders = TransferFolders(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.trashed_files = TrashedFiles(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.trashed_folders = TrashedFolders(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.trashed_items = TrashedItems(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.trashed_web_links = TrashedWebLinks(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.uploads = Uploads(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.uploads_chunked_ = UploadsChunked(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.user_avatars = UserAvatars(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.users = Users(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.watermarks_files_ = WatermarksFiles(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.watermarks_folders_ = WatermarksFolders(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.web_links = WebLinks(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.webhooks = Webhooks(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.workflows = Workflows(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
        
        self.zip_downloads = ZipDownloads(
            self._client,
            self._security_client,
            self._server_url,
            self._language,
            self._sdk_version,
            self._gen_version
        )
    
    