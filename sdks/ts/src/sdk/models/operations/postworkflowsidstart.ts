import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PostWorkflowsIdStartPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=workflow_id" })
  workflowId: string;
}

export enum PostWorkflowsIdStartRequestBodyFilesTypeEnum {
    File = "file"
}


// PostWorkflowsIdStartRequestBodyFiles
/** 
 * A file the workflow should start for
**/
export class PostWorkflowsIdStartRequestBodyFiles extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostWorkflowsIdStartRequestBodyFilesTypeEnum;
}


// PostWorkflowsIdStartRequestBodyFlow
/** 
 * The flow that will be triggered
**/
export class PostWorkflowsIdStartRequestBodyFlow extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;
}

export enum PostWorkflowsIdStartRequestBodyFolderTypeEnum {
    Folder = "folder"
}


// PostWorkflowsIdStartRequestBodyFolder
/** 
 * The folder object for which the workflow is configured.
**/
export class PostWorkflowsIdStartRequestBodyFolder extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostWorkflowsIdStartRequestBodyFolderTypeEnum;
}

export enum PostWorkflowsIdStartRequestBodyOutcomesTypeEnum {
    Outcome = "outcome"
}


// PostWorkflowsIdStartRequestBodyOutcomes
/** 
 * A configurable outcome the workflow should complete. If you
 * have a `task_completion_rule`, you may input `all_assignees` or
 * `any_assignee` in the `variable_value` field. Similarly, if you
 * have a `collaborator_role`, you may input `editor`, `viewer`,
 * `previewer`, `uploader`, `previewer uploader`, `viewer uploader`
 * , `co-owner` in the `variable_value` field.
**/
export class PostWorkflowsIdStartRequestBodyOutcomes extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=parameter" })
  parameter?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostWorkflowsIdStartRequestBodyOutcomesTypeEnum;
}

export enum PostWorkflowsIdStartRequestBodyTypeEnum {
    WorkflowParameters = "workflow_parameters"
}


export class PostWorkflowsIdStartRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=files", elemType: PostWorkflowsIdStartRequestBodyFiles })
  files: PostWorkflowsIdStartRequestBodyFiles[];

  @SpeakeasyMetadata({ data: "json, name=flow" })
  flow: PostWorkflowsIdStartRequestBodyFlow;

  @SpeakeasyMetadata({ data: "json, name=folder" })
  folder: PostWorkflowsIdStartRequestBodyFolder;

  @SpeakeasyMetadata({ data: "json, name=outcomes", elemType: PostWorkflowsIdStartRequestBodyOutcomes })
  outcomes?: PostWorkflowsIdStartRequestBodyOutcomes[];

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PostWorkflowsIdStartRequestBodyTypeEnum;
}


export class PostWorkflowsIdStartRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PostWorkflowsIdStartPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostWorkflowsIdStartRequestBody;
}


export class PostWorkflowsIdStartResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
