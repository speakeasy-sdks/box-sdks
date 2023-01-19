package shared

type FileScopeScopeEnum string

const (
	FileScopeScopeEnumAnnotationEdit     FileScopeScopeEnum = "annotation_edit"
	FileScopeScopeEnumAnnotationViewAll  FileScopeScopeEnum = "annotation_view_all"
	FileScopeScopeEnumAnnotationViewSelf FileScopeScopeEnum = "annotation_view_self"
	FileScopeScopeEnumBaseExplorer       FileScopeScopeEnum = "base_explorer"
	FileScopeScopeEnumBasePicker         FileScopeScopeEnum = "base_picker"
	FileScopeScopeEnumBasePreview        FileScopeScopeEnum = "base_preview"
	FileScopeScopeEnumBaseUpload         FileScopeScopeEnum = "base_upload"
	FileScopeScopeEnumItemDelete         FileScopeScopeEnum = "item_delete"
	FileScopeScopeEnumItemDownload       FileScopeScopeEnum = "item_download"
	FileScopeScopeEnumItemPreview        FileScopeScopeEnum = "item_preview"
	FileScopeScopeEnumItemRename         FileScopeScopeEnum = "item_rename"
	FileScopeScopeEnumItemShare          FileScopeScopeEnum = "item_share"
)

// FileScope
// A relation between a file and the scopes for which the file can be accessed
type FileScope struct {
	Object *FileMini           `json:"object,omitempty"`
	Scope  *FileScopeScopeEnum `json:"scope,omitempty"`
}
