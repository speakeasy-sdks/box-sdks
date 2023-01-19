package boxsdk

import (
	"net/http"

	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

var ServerList = []string{
	"https://api.box.com/2.0",
}

type HTTPClient interface {
	Do(req *http.Request) (*http.Response, error)
}

// SDK Documentation: https://developer.box.com - Box Developer Documentation
type Boxsdk struct {
	Authorization                               *Authorization
	BoxSign                                     *BoxSign
	Classifications                             *Classifications
	ClassificationsOnFiles                      *ClassificationsOnFiles
	ClassificationsOnFolders                    *ClassificationsOnFolders
	Collaborations                              *Collaborations
	CollaborationsList                          *CollaborationsList
	Collections                                 *Collections
	Comments                                    *Comments
	DevicePinners                               *DevicePinners
	DomainRestrictionsUserExemptions            *DomainRestrictionsUserExemptions
	DomainRestrictionsForCollaborations         *DomainRestrictionsForCollaborations
	Downloads                                   *Downloads
	EmailAliases                                *EmailAliases
	Events                                      *Events
	FileRequests                                *FileRequests
	FileVersionLegalHolds                       *FileVersionLegalHolds
	FileVersionRetentions                       *FileVersionRetentions
	FileVersions                                *FileVersions
	Files                                       *Files
	FolderLocks                                 *FolderLocks
	Folders                                     *Folders
	GroupMemberships                            *GroupMemberships
	Groups                                      *Groups
	Invites                                     *Invites
	LegalHoldPolicies                           *LegalHoldPolicies
	LegalHoldPolicyAssignments                  *LegalHoldPolicyAssignments
	MetadataCascadePolicies                     *MetadataCascadePolicies
	MetadataInstancesFiles                      *MetadataInstancesFiles
	MetadataInstancesFolders                    *MetadataInstancesFolders
	MetadataTemplates                           *MetadataTemplates
	RecentItems                                 *RecentItems
	RetentionPolicies                           *RetentionPolicies
	RetentionPolicyAssignments                  *RetentionPolicyAssignments
	Search                                      *Search
	SharedLinksFiles                            *SharedLinksFiles
	SharedLinksFolders                          *SharedLinksFolders
	SharedLinksWebLinks                         *SharedLinksWebLinks
	ShieldInformationBarrierReports             *ShieldInformationBarrierReports
	ShieldInformationBarrierSegmentMembers      *ShieldInformationBarrierSegmentMembers
	ShieldInformationBarrierSegmentRestrictions *ShieldInformationBarrierSegmentRestrictions
	ShieldInformationBarrierSegments            *ShieldInformationBarrierSegments
	ShieldInformationBarriers                   *ShieldInformationBarriers
	Skills                                      *Skills
	StoragePolicies                             *StoragePolicies
	StoragePolicyAssignments                    *StoragePolicyAssignments
	TaskAssignments                             *TaskAssignments
	Tasks                                       *Tasks
	TermsOfService                              *TermsOfService
	TermsOfServiceUserStatuses                  *TermsOfServiceUserStatuses
	TransferFolders                             *TransferFolders
	TrashedFiles                                *TrashedFiles
	TrashedFolders                              *TrashedFolders
	TrashedItems                                *TrashedItems
	TrashedWebLinks                             *TrashedWebLinks
	Uploads                                     *Uploads
	UploadsChunked                              *UploadsChunked
	UserAvatars                                 *UserAvatars
	Users                                       *Users
	WatermarksFiles                             *WatermarksFiles
	WatermarksFolders                           *WatermarksFolders
	WebLinks                                    *WebLinks
	Webhooks                                    *Webhooks
	Workflows                                   *Workflows
	ZipDownloads                                *ZipDownloads

	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_security       *shared.Security
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

type SDKOption func(*Boxsdk)

func WithServerURL(serverURL string, params map[string]string) SDKOption {
	return func(sdk *Boxsdk) {
		if params != nil {
			serverURL = utils.ReplaceParameters(serverURL, params)
		}

		sdk._serverURL = serverURL
	}
}

func WithClient(client HTTPClient) SDKOption {
	return func(sdk *Boxsdk) {
		sdk._defaultClient = client
	}
}

func WithSecurity(security shared.Security) SDKOption {
	return func(sdk *Boxsdk) {
		sdk._security = &security
	}
}

func New(opts ...SDKOption) *Boxsdk {
	sdk := &Boxsdk{
		_language:   "go",
		_sdkVersion: "",
		_genVersion: "0.20.3",
	}
	for _, opt := range opts {
		opt(sdk)
	}

	if sdk._defaultClient == nil {
		sdk._defaultClient = http.DefaultClient
	}
	if sdk._securityClient == nil {

		if sdk._security != nil {
			sdk._securityClient = utils.ConfigureSecurityClient(sdk._defaultClient, sdk._security)
		} else {
			sdk._securityClient = sdk._defaultClient
		}

	}

	if sdk._serverURL == "" {
		sdk._serverURL = ServerList[0]
	}

	sdk.Authorization = NewAuthorization(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.BoxSign = NewBoxSign(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Classifications = NewClassifications(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ClassificationsOnFiles = NewClassificationsOnFiles(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ClassificationsOnFolders = NewClassificationsOnFolders(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Collaborations = NewCollaborations(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.CollaborationsList = NewCollaborationsList(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Collections = NewCollections(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Comments = NewComments(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.DevicePinners = NewDevicePinners(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.DomainRestrictionsUserExemptions = NewDomainRestrictionsUserExemptions(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.DomainRestrictionsForCollaborations = NewDomainRestrictionsForCollaborations(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Downloads = NewDownloads(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.EmailAliases = NewEmailAliases(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Events = NewEvents(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.FileRequests = NewFileRequests(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.FileVersionLegalHolds = NewFileVersionLegalHolds(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.FileVersionRetentions = NewFileVersionRetentions(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.FileVersions = NewFileVersions(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Files = NewFiles(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.FolderLocks = NewFolderLocks(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Folders = NewFolders(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.GroupMemberships = NewGroupMemberships(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Groups = NewGroups(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Invites = NewInvites(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.LegalHoldPolicies = NewLegalHoldPolicies(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.LegalHoldPolicyAssignments = NewLegalHoldPolicyAssignments(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.MetadataCascadePolicies = NewMetadataCascadePolicies(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.MetadataInstancesFiles = NewMetadataInstancesFiles(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.MetadataInstancesFolders = NewMetadataInstancesFolders(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.MetadataTemplates = NewMetadataTemplates(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.RecentItems = NewRecentItems(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.RetentionPolicies = NewRetentionPolicies(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.RetentionPolicyAssignments = NewRetentionPolicyAssignments(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Search = NewSearch(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.SharedLinksFiles = NewSharedLinksFiles(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.SharedLinksFolders = NewSharedLinksFolders(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.SharedLinksWebLinks = NewSharedLinksWebLinks(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ShieldInformationBarrierReports = NewShieldInformationBarrierReports(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ShieldInformationBarrierSegmentMembers = NewShieldInformationBarrierSegmentMembers(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ShieldInformationBarrierSegmentRestrictions = NewShieldInformationBarrierSegmentRestrictions(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ShieldInformationBarrierSegments = NewShieldInformationBarrierSegments(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ShieldInformationBarriers = NewShieldInformationBarriers(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Skills = NewSkills(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.StoragePolicies = NewStoragePolicies(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.StoragePolicyAssignments = NewStoragePolicyAssignments(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.TaskAssignments = NewTaskAssignments(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Tasks = NewTasks(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.TermsOfService = NewTermsOfService(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.TermsOfServiceUserStatuses = NewTermsOfServiceUserStatuses(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.TransferFolders = NewTransferFolders(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.TrashedFiles = NewTrashedFiles(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.TrashedFolders = NewTrashedFolders(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.TrashedItems = NewTrashedItems(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.TrashedWebLinks = NewTrashedWebLinks(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Uploads = NewUploads(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.UploadsChunked = NewUploadsChunked(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.UserAvatars = NewUserAvatars(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Users = NewUsers(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.WatermarksFiles = NewWatermarksFiles(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.WatermarksFolders = NewWatermarksFolders(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.WebLinks = NewWebLinks(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Webhooks = NewWebhooks(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.Workflows = NewWorkflows(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	sdk.ZipDownloads = NewZipDownloads(
		sdk._defaultClient,
		sdk._securityClient,
		sdk._serverURL,
		sdk._language,
		sdk._sdkVersion,
		sdk._genVersion,
	)

	return sdk
}
