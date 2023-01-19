

package ;

import .utils.HTTPClient;
import .utils.SpeakeasyHTTPClient;


/** SDK Documentation: https://developer.box.com - Box Developer Documentation**/
public class Boxsdk {
	public static final String[] SERVERS = {
		"https://api.box.com/2.0",
	};
  	
  	public Authorization authorization;
  	public BoxSign boxSign;
  	public Classifications classifications;
  	public ClassificationsOnFiles classificationsOnFiles;
  	public ClassificationsOnFolders classificationsOnFolders;
  	public Collaborations collaborations;
  	public CollaborationsList collaborationsList;
  	public Collections collections;
  	public Comments comments;
  	public DevicePinners devicePinners;
  	public DomainRestrictionsUserExemptions domainRestrictionsUserExemptions;
  	public DomainRestrictionsForCollaborations domainRestrictionsForCollaborations;
  	public Downloads downloads;
  	public EmailAliases emailAliases;
  	public Events events;
  	public FileRequests fileRequests;
  	public FileVersionLegalHolds fileVersionLegalHolds;
  	public FileVersionRetentions fileVersionRetentions;
  	public FileVersions fileVersions;
  	public Files files;
  	public FolderLocks folderLocks;
  	public Folders folders;
  	public GroupMemberships groupMemberships;
  	public Groups groups;
  	public Invites invites;
  	public LegalHoldPolicies legalHoldPolicies;
  	public LegalHoldPolicyAssignments legalHoldPolicyAssignments;
  	public MetadataCascadePolicies metadataCascadePolicies;
  	public MetadataInstancesFiles metadataInstancesFiles;
  	public MetadataInstancesFolders metadataInstancesFolders;
  	public MetadataTemplates metadataTemplates;
  	public RecentItems recentItems;
  	public RetentionPolicies retentionPolicies;
  	public RetentionPolicyAssignments retentionPolicyAssignments;
  	public Search search;
  	public SharedLinksFiles sharedLinksFiles;
  	public SharedLinksFolders sharedLinksFolders;
  	public SharedLinksWebLinks sharedLinksWebLinks;
  	public ShieldInformationBarrierReports shieldInformationBarrierReports;
  	public ShieldInformationBarrierSegmentMembers shieldInformationBarrierSegmentMembers;
  	public ShieldInformationBarrierSegmentRestrictions shieldInformationBarrierSegmentRestrictions;
  	public ShieldInformationBarrierSegments shieldInformationBarrierSegments;
  	public ShieldInformationBarriers shieldInformationBarriers;
  	public Skills skills;
  	public StoragePolicies storagePolicies;
  	public StoragePolicyAssignments storagePolicyAssignments;
  	public TaskAssignments taskAssignments;
  	public Tasks tasks;
  	public TermsOfService termsOfService;
  	public TermsOfServiceUserStatuses termsOfServiceUserStatuses;
  	public TransferFolders transferFolders;
  	public TrashedFiles trashedFiles;
  	public TrashedFolders trashedFolders;
  	public TrashedItems trashedItems;
  	public TrashedWebLinks trashedWebLinks;
  	public Uploads uploads;
  	public UploadsChunked uploadsChunked;
  	public UserAvatars userAvatars;
  	public Users users;
  	public WatermarksFiles watermarksFiles;
  	public WatermarksFolders watermarksFolders;
  	public WebLinks webLinks;
  	public Webhooks webhooks;
  	public Workflows workflows;
  	public ZipDownloads zipDownloads;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private .models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "";
	private String _genVersion = "0.20.3";

	public static class Builder {
		private HTTPClient client;
		private .models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		public Builder setSecurity(.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		public Boxsdk build() throws Exception {
			return new Boxsdk(this.client, this.security, this.serverUrl, this.params);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	private Boxsdk(HTTPClient client, .models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = .utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = .utils.Utils.replaceParameters(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}
		
		this.authorization = new Authorization(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.boxSign = new BoxSign(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.classifications = new Classifications(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.classificationsOnFiles = new ClassificationsOnFiles(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.classificationsOnFolders = new ClassificationsOnFolders(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.collaborations = new Collaborations(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.collaborationsList = new CollaborationsList(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.collections = new Collections(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.comments = new Comments(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.devicePinners = new DevicePinners(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.domainRestrictionsUserExemptions = new DomainRestrictionsUserExemptions(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.domainRestrictionsForCollaborations = new DomainRestrictionsForCollaborations(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.downloads = new Downloads(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.emailAliases = new EmailAliases(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.events = new Events(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.fileRequests = new FileRequests(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.fileVersionLegalHolds = new FileVersionLegalHolds(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.fileVersionRetentions = new FileVersionRetentions(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.fileVersions = new FileVersions(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.files = new Files(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.folderLocks = new FolderLocks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.folders = new Folders(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.groupMemberships = new GroupMemberships(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.groups = new Groups(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.invites = new Invites(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.legalHoldPolicies = new LegalHoldPolicies(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.legalHoldPolicyAssignments = new LegalHoldPolicyAssignments(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.metadataCascadePolicies = new MetadataCascadePolicies(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.metadataInstancesFiles = new MetadataInstancesFiles(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.metadataInstancesFolders = new MetadataInstancesFolders(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.metadataTemplates = new MetadataTemplates(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.recentItems = new RecentItems(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.retentionPolicies = new RetentionPolicies(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.retentionPolicyAssignments = new RetentionPolicyAssignments(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.search = new Search(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.sharedLinksFiles = new SharedLinksFiles(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.sharedLinksFolders = new SharedLinksFolders(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.sharedLinksWebLinks = new SharedLinksWebLinks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.shieldInformationBarrierReports = new ShieldInformationBarrierReports(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.shieldInformationBarrierSegmentMembers = new ShieldInformationBarrierSegmentMembers(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.shieldInformationBarrierSegmentRestrictions = new ShieldInformationBarrierSegmentRestrictions(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.shieldInformationBarrierSegments = new ShieldInformationBarrierSegments(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.shieldInformationBarriers = new ShieldInformationBarriers(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.skills = new Skills(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.storagePolicies = new StoragePolicies(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.storagePolicyAssignments = new StoragePolicyAssignments(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.taskAssignments = new TaskAssignments(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.tasks = new Tasks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.termsOfService = new TermsOfService(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.termsOfServiceUserStatuses = new TermsOfServiceUserStatuses(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.transferFolders = new TransferFolders(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.trashedFiles = new TrashedFiles(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.trashedFolders = new TrashedFolders(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.trashedItems = new TrashedItems(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.trashedWebLinks = new TrashedWebLinks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.uploads = new Uploads(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.uploadsChunked = new UploadsChunked(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.userAvatars = new UserAvatars(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.users = new Users(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.watermarksFiles = new WatermarksFiles(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.watermarksFolders = new WatermarksFolders(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.webLinks = new WebLinks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.webhooks = new Webhooks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.workflows = new Workflows(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.zipDownloads = new ZipDownloads(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
	
}