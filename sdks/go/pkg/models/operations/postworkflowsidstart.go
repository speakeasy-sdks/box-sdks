package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostWorkflowsIDStartPathParams struct {
	WorkflowID string `pathParam:"style=simple,explode=false,name=workflow_id"`
}

type PostWorkflowsIDStartRequestBodyFilesTypeEnum string

const (
	PostWorkflowsIDStartRequestBodyFilesTypeEnumFile PostWorkflowsIDStartRequestBodyFilesTypeEnum = "file"
)

// PostWorkflowsIDStartRequestBodyFiles
// A file the workflow should start for
type PostWorkflowsIDStartRequestBodyFiles struct {
	ID   *string                                       `json:"id,omitempty"`
	Type *PostWorkflowsIDStartRequestBodyFilesTypeEnum `json:"type,omitempty"`
}

// PostWorkflowsIDStartRequestBodyFlow
// The flow that will be triggered
type PostWorkflowsIDStartRequestBodyFlow struct {
	ID   *string `json:"id,omitempty"`
	Type *string `json:"type,omitempty"`
}

type PostWorkflowsIDStartRequestBodyFolderTypeEnum string

const (
	PostWorkflowsIDStartRequestBodyFolderTypeEnumFolder PostWorkflowsIDStartRequestBodyFolderTypeEnum = "folder"
)

// PostWorkflowsIDStartRequestBodyFolder
// The folder object for which the workflow is configured.
type PostWorkflowsIDStartRequestBodyFolder struct {
	ID   *string                                        `json:"id,omitempty"`
	Type *PostWorkflowsIDStartRequestBodyFolderTypeEnum `json:"type,omitempty"`
}

type PostWorkflowsIDStartRequestBodyOutcomesTypeEnum string

const (
	PostWorkflowsIDStartRequestBodyOutcomesTypeEnumOutcome PostWorkflowsIDStartRequestBodyOutcomesTypeEnum = "outcome"
)

// PostWorkflowsIDStartRequestBodyOutcomes
// A configurable outcome the workflow should complete. If you
// have a `task_completion_rule`, you may input `all_assignees` or
// `any_assignee` in the `variable_value` field. Similarly, if you
// have a `collaborator_role`, you may input `editor`, `viewer`,
// `previewer`, `uploader`, `previewer uploader`, `viewer uploader`
// , `co-owner` in the `variable_value` field.
type PostWorkflowsIDStartRequestBodyOutcomes struct {
	ID        *string                                          `json:"id,omitempty"`
	Parameter *string                                          `json:"parameter,omitempty"`
	Type      *PostWorkflowsIDStartRequestBodyOutcomesTypeEnum `json:"type,omitempty"`
}

type PostWorkflowsIDStartRequestBodyTypeEnum string

const (
	PostWorkflowsIDStartRequestBodyTypeEnumWorkflowParameters PostWorkflowsIDStartRequestBodyTypeEnum = "workflow_parameters"
)

type PostWorkflowsIDStartRequestBody struct {
	Files    []PostWorkflowsIDStartRequestBodyFiles    `json:"files"`
	Flow     PostWorkflowsIDStartRequestBodyFlow       `json:"flow"`
	Folder   PostWorkflowsIDStartRequestBodyFolder     `json:"folder"`
	Outcomes []PostWorkflowsIDStartRequestBodyOutcomes `json:"outcomes,omitempty"`
	Type     *PostWorkflowsIDStartRequestBodyTypeEnum  `json:"type,omitempty"`
}

type PostWorkflowsIDStartRequest struct {
	Retries    *utils.RetryConfig
	PathParams PostWorkflowsIDStartPathParams
	Request    *PostWorkflowsIDStartRequestBody `request:"mediaType=application/json"`
}

type PostWorkflowsIDStartResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
