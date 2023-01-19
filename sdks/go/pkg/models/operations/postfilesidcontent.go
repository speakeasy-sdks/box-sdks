package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

var PostFilesIDContentServerList = []string{
	"https://upload.box.com/api/2.0",
}

type PostFilesIDContentPathParams struct {
	FileID string `pathParam:"style=simple,explode=false,name=file_id"`
}

type PostFilesIDContentQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PostFilesIDContentHeaders struct {
	ContentMd5 *string `header:"style=simple,explode=false,name=content-md5"`
	IfMatch    *string `header:"style=simple,explode=false,name=if-match"`
}

// PostFilesIDContentRequestBodyAttributes
// The additional attributes of the file being uploaded. Mainly the
// name and the parent folder. These attributes are part of the multi
// part request body and are in JSON format.
//
// <Message warning>
//
//	The `attributes` part of the body must come **before** the
//	`file` part. Requests that do not follow this format when
//	uploading the file will receive a HTTP `400` error with a
//	`metadata_after_file_contents` error code.
//
// </Message>
type PostFilesIDContentRequestBodyAttributes struct {
	ContentModifiedAt *time.Time `json:"content_modified_at,omitempty"`
	Name              string     `json:"name"`
}

type PostFilesIDContentRequestBodyFile struct {
	Content []byte `multipartForm:"content"`
	File    string `multipartForm:"name=file"`
}

type PostFilesIDContentRequestBody struct {
	Attributes PostFilesIDContentRequestBodyAttributes `multipartForm:"name=attributes,json"`
	File       PostFilesIDContentRequestBodyFile       `multipartForm:"file"`
}

type PostFilesIDContentRequest struct {
	Retries     *utils.RetryConfig
	ServerURL   *string
	PathParams  PostFilesIDContentPathParams
	QueryParams PostFilesIDContentQueryParams
	Headers     PostFilesIDContentHeaders
	Request     *PostFilesIDContentRequestBody `request:"mediaType=multipart/form-data"`
}

type PostFilesIDContentResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Files       *shared.Files
	StatusCode  int64
}
