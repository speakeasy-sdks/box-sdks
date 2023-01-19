import axios, { AxiosInstance } from "axios";
import * as utils from "../internal/utils";
import { Security } from "./models/shared";

import { Authorization } from "./authorization";
import { BoxSign } from "./boxsign";
import { Classifications } from "./classifications";
import { ClassificationsOnFiles } from "./classificationsonfiles";
import { ClassificationsOnFolders } from "./classificationsonfolders";
import { Collaborations } from "./collaborations";
import { CollaborationsList } from "./collaborationslist";
import { Collections } from "./collections";
import { Comments } from "./comments";
import { DevicePinners } from "./devicepinners";
import { DomainRestrictionsUserExemptions } from "./domainrestrictionsuserexemptions";
import { DomainRestrictionsForCollaborations } from "./domainrestrictionsforcollaborations";
import { Downloads } from "./downloads";
import { EmailAliases } from "./emailaliases";
import { Events } from "./events";
import { FileRequests } from "./filerequests";
import { FileVersionLegalHolds } from "./fileversionlegalholds";
import { FileVersionRetentions } from "./fileversionretentions";
import { FileVersions } from "./fileversions";
import { Files } from "./files";
import { FolderLocks } from "./folderlocks";
import { Folders } from "./folders";
import { GroupMemberships } from "./groupmemberships";
import { Groups } from "./groups";
import { Invites } from "./invites";
import { LegalHoldPolicies } from "./legalholdpolicies";
import { LegalHoldPolicyAssignments } from "./legalholdpolicyassignments";
import { MetadataCascadePolicies } from "./metadatacascadepolicies";
import { MetadataInstancesFiles } from "./metadatainstancesfiles";
import { MetadataInstancesFolders } from "./metadatainstancesfolders";
import { MetadataTemplates } from "./metadatatemplates";
import { RecentItems } from "./recentitems";
import { RetentionPolicies } from "./retentionpolicies";
import { RetentionPolicyAssignments } from "./retentionpolicyassignments";
import { Search } from "./search";
import { SharedLinksFiles } from "./sharedlinksfiles";
import { SharedLinksFolders } from "./sharedlinksfolders";
import { SharedLinksWebLinks } from "./sharedlinksweblinks";
import { ShieldInformationBarrierReports } from "./shieldinformationbarrierreports";
import { ShieldInformationBarrierSegmentMembers } from "./shieldinformationbarriersegmentmembers";
import { ShieldInformationBarrierSegmentRestrictions } from "./shieldinformationbarriersegmentrestrictions";
import { ShieldInformationBarrierSegments } from "./shieldinformationbarriersegments";
import { ShieldInformationBarriers } from "./shieldinformationbarriers";
import { Skills } from "./skills";
import { StoragePolicies } from "./storagepolicies";
import { StoragePolicyAssignments } from "./storagepolicyassignments";
import { TaskAssignments } from "./taskassignments";
import { Tasks } from "./tasks";
import { TermsOfService } from "./termsofservice";
import { TermsOfServiceUserStatuses } from "./termsofserviceuserstatuses";
import { TransferFolders } from "./transferfolders";
import { TrashedFiles } from "./trashedfiles";
import { TrashedFolders } from "./trashedfolders";
import { TrashedItems } from "./trasheditems";
import { TrashedWebLinks } from "./trashedweblinks";
import { Uploads } from "./uploads";
import { UploadsChunked } from "./uploadschunked";
import { UserAvatars } from "./useravatars";
import { Users } from "./users";
import { WatermarksFiles } from "./watermarksfiles";
import { WatermarksFolders } from "./watermarksfolders";
import { WebLinks } from "./weblinks";
import { Webhooks } from "./webhooks";
import { Workflows } from "./workflows";
import { ZipDownloads } from "./zipdownloads";


export const ServerList = [
	"https://api.box.com/2.0",
] as const;



export type SDKProps = {
  defaultClient?: AxiosInstance;

  security?: Security;

  serverUrl?: string;
}

/* SDK Documentation: https://developer.box.com - Box Developer Documentation*/
export class Boxsdk {
  public authorization: Authorization;
  public boxSign: BoxSign;
  public classifications: Classifications;
  public classificationsOnFiles: ClassificationsOnFiles;
  public classificationsOnFolders: ClassificationsOnFolders;
  public collaborations: Collaborations;
  public collaborationsList: CollaborationsList;
  public collections: Collections;
  public comments: Comments;
  public devicePinners: DevicePinners;
  public domainRestrictionsUserExemptions: DomainRestrictionsUserExemptions;
  public domainRestrictionsForCollaborations: DomainRestrictionsForCollaborations;
  public downloads: Downloads;
  public emailAliases: EmailAliases;
  public events: Events;
  public fileRequests: FileRequests;
  public fileVersionLegalHolds: FileVersionLegalHolds;
  public fileVersionRetentions: FileVersionRetentions;
  public fileVersions: FileVersions;
  public files: Files;
  public folderLocks: FolderLocks;
  public folders: Folders;
  public groupMemberships: GroupMemberships;
  public groups: Groups;
  public invites: Invites;
  public legalHoldPolicies: LegalHoldPolicies;
  public legalHoldPolicyAssignments: LegalHoldPolicyAssignments;
  public metadataCascadePolicies: MetadataCascadePolicies;
  public metadataInstancesFiles: MetadataInstancesFiles;
  public metadataInstancesFolders: MetadataInstancesFolders;
  public metadataTemplates: MetadataTemplates;
  public recentItems: RecentItems;
  public retentionPolicies: RetentionPolicies;
  public retentionPolicyAssignments: RetentionPolicyAssignments;
  public search: Search;
  public sharedLinksFiles: SharedLinksFiles;
  public sharedLinksFolders: SharedLinksFolders;
  public sharedLinksWebLinks: SharedLinksWebLinks;
  public shieldInformationBarrierReports: ShieldInformationBarrierReports;
  public shieldInformationBarrierSegmentMembers: ShieldInformationBarrierSegmentMembers;
  public shieldInformationBarrierSegmentRestrictions: ShieldInformationBarrierSegmentRestrictions;
  public shieldInformationBarrierSegments: ShieldInformationBarrierSegments;
  public shieldInformationBarriers: ShieldInformationBarriers;
  public skills: Skills;
  public storagePolicies: StoragePolicies;
  public storagePolicyAssignments: StoragePolicyAssignments;
  public taskAssignments: TaskAssignments;
  public tasks: Tasks;
  public termsOfService: TermsOfService;
  public termsOfServiceUserStatuses: TermsOfServiceUserStatuses;
  public transferFolders: TransferFolders;
  public trashedFiles: TrashedFiles;
  public trashedFolders: TrashedFolders;
  public trashedItems: TrashedItems;
  public trashedWebLinks: TrashedWebLinks;
  public uploads: Uploads;
  public uploadsChunked: UploadsChunked;
  public userAvatars: UserAvatars;
  public users: Users;
  public watermarksFiles: WatermarksFiles;
  public watermarksFolders: WatermarksFolders;
  public webLinks: WebLinks;
  public webhooks: Webhooks;
  public workflows: Workflows;
  public zipDownloads: ZipDownloads;

  public _defaultClient: AxiosInstance;
  public _securityClient: AxiosInstance;
  public _serverURL: string;
  private _language = "typescript";
  private _sdkVersion = "0.0.1";
  private _genVersion = "0.20.3";

  constructor(props: SDKProps) {
    this._serverURL = props.serverUrl ?? ServerList[0];

    this._defaultClient = props.defaultClient ?? axios.create({ baseURL: this._serverURL });
    if (props.security) {
      let security: Security = props.security;
      if (!(props.security instanceof utils.SpeakeasyBase))
        security = new Security(props.security);
      this._securityClient = utils.createSecurityClient(
        this._defaultClient,
        security
      );
    } else {
      this._securityClient = this._defaultClient;
    }
    
    this.authorization = new Authorization(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.boxSign = new BoxSign(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.classifications = new Classifications(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.classificationsOnFiles = new ClassificationsOnFiles(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.classificationsOnFolders = new ClassificationsOnFolders(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.collaborations = new Collaborations(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.collaborationsList = new CollaborationsList(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.collections = new Collections(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.comments = new Comments(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.devicePinners = new DevicePinners(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.domainRestrictionsUserExemptions = new DomainRestrictionsUserExemptions(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.domainRestrictionsForCollaborations = new DomainRestrictionsForCollaborations(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.downloads = new Downloads(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.emailAliases = new EmailAliases(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.events = new Events(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.fileRequests = new FileRequests(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.fileVersionLegalHolds = new FileVersionLegalHolds(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.fileVersionRetentions = new FileVersionRetentions(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.fileVersions = new FileVersions(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.files = new Files(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.folderLocks = new FolderLocks(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.folders = new Folders(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.groupMemberships = new GroupMemberships(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.groups = new Groups(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.invites = new Invites(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.legalHoldPolicies = new LegalHoldPolicies(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.legalHoldPolicyAssignments = new LegalHoldPolicyAssignments(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.metadataCascadePolicies = new MetadataCascadePolicies(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.metadataInstancesFiles = new MetadataInstancesFiles(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.metadataInstancesFolders = new MetadataInstancesFolders(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.metadataTemplates = new MetadataTemplates(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.recentItems = new RecentItems(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.retentionPolicies = new RetentionPolicies(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.retentionPolicyAssignments = new RetentionPolicyAssignments(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.search = new Search(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.sharedLinksFiles = new SharedLinksFiles(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.sharedLinksFolders = new SharedLinksFolders(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.sharedLinksWebLinks = new SharedLinksWebLinks(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.shieldInformationBarrierReports = new ShieldInformationBarrierReports(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.shieldInformationBarrierSegmentMembers = new ShieldInformationBarrierSegmentMembers(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.shieldInformationBarrierSegmentRestrictions = new ShieldInformationBarrierSegmentRestrictions(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.shieldInformationBarrierSegments = new ShieldInformationBarrierSegments(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.shieldInformationBarriers = new ShieldInformationBarriers(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.skills = new Skills(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.storagePolicies = new StoragePolicies(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.storagePolicyAssignments = new StoragePolicyAssignments(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.taskAssignments = new TaskAssignments(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.tasks = new Tasks(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.termsOfService = new TermsOfService(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.termsOfServiceUserStatuses = new TermsOfServiceUserStatuses(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.transferFolders = new TransferFolders(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.trashedFiles = new TrashedFiles(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.trashedFolders = new TrashedFolders(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.trashedItems = new TrashedItems(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.trashedWebLinks = new TrashedWebLinks(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.uploads = new Uploads(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.uploadsChunked = new UploadsChunked(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.userAvatars = new UserAvatars(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.users = new Users(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.watermarksFiles = new WatermarksFiles(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.watermarksFolders = new WatermarksFolders(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.webLinks = new WebLinks(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.webhooks = new Webhooks(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.workflows = new Workflows(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
    
    this.zipDownloads = new ZipDownloads(
      this._defaultClient,
      this._securityClient,
      this._serverURL,
      this._language,
      this._sdkVersion,
      this._genVersion
    );
  }
}