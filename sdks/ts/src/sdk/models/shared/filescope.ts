import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileMini } from "./filemini";


export enum FileScopeScopeEnum {
    AnnotationEdit = "annotation_edit",
    AnnotationViewAll = "annotation_view_all",
    AnnotationViewSelf = "annotation_view_self",
    BaseExplorer = "base_explorer",
    BasePicker = "base_picker",
    BasePreview = "base_preview",
    BaseUpload = "base_upload",
    ItemDelete = "item_delete",
    ItemDownload = "item_download",
    ItemPreview = "item_preview",
    ItemRename = "item_rename",
    ItemShare = "item_share"
}


// FileScope
/** 
 * A relation between a file and the scopes for which the file can be accessed
**/
export class FileScope extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=object" })
  object?: FileMini;

  @SpeakeasyMetadata({ data: "json, name=scope" })
  scope?: FileScopeScopeEnum;
}
