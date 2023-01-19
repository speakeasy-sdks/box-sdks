package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type PostCommentsQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PostCommentsRequestBodyItemTypeEnum string

const (
	PostCommentsRequestBodyItemTypeEnumFile    PostCommentsRequestBodyItemTypeEnum = "file"
	PostCommentsRequestBodyItemTypeEnumComment PostCommentsRequestBodyItemTypeEnum = "comment"
)

// PostCommentsRequestBodyItem
// The item to attach the comment to.
type PostCommentsRequestBodyItem struct {
	ID   string                              `json:"id"`
	Type PostCommentsRequestBodyItemTypeEnum `json:"type"`
}

type PostCommentsRequestBody struct {
	Item          *PostCommentsRequestBodyItem `json:"item,omitempty"`
	Message       string                       `json:"message"`
	TaggedMessage *string                      `json:"tagged_message,omitempty"`
}

type PostCommentsRequest struct {
	Retries     *utils.RetryConfig
	QueryParams PostCommentsQueryParams
	Request     *PostCommentsRequestBody `request:"mediaType=application/json"`
}

type PostCommentsResponse struct {
	ClientError *shared.ClientError
	Comment     *shared.Comment
	ContentType string
	StatusCode  int64
}
