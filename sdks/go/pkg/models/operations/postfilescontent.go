package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"time"
)

var PostFilesContentServerList = []string{
	"https://upload.box.com/api/2.0",
}

type PostFilesContentQueryParams struct {
	Fields []string `queryParam:"style=form,explode=false,name=fields"`
}

type PostFilesContentHeaders struct {
	ContentMd5 *string `header:"style=simple,explode=false,name=content-md5"`
}

// PostFilesContentRequestBodyAttributesParent
// The parent folder to upload the file to
type PostFilesContentRequestBodyAttributesParent struct {
	ID string `json:"id"`
}

// PostFilesContentRequestBodyAttributes
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
type PostFilesContentRequestBodyAttributes struct {
	ContentCreatedAt  *time.Time                                  `json:"content_created_at,omitempty"`
	ContentModifiedAt *time.Time                                  `json:"content_modified_at,omitempty"`
	Name              string                                      `json:"name"`
	Parent            PostFilesContentRequestBodyAttributesParent `json:"parent"`
}

type PostFilesContentRequestBodyFile struct {
	Content []byte `multipartForm:"content"`
	File    string `multipartForm:"name=file"`
}

type PostFilesContentRequestBody struct {
	Attributes PostFilesContentRequestBodyAttributes `multipartForm:"name=attributes,json"`
	File       PostFilesContentRequestBodyFile       `multipartForm:"file"`
}

type PostFilesContentRequest struct {
	Retries     *utils.RetryConfig
	ServerURL   *string
	QueryParams PostFilesContentQueryParams
	Headers     PostFilesContentHeaders
	Request     *PostFilesContentRequestBody `request:"mediaType=multipart/form-data"`
}

type PostFilesContentResponse struct {
	ClientError *shared.ClientError
	ContentType string
	Files       *shared.Files
	StatusCode  int64
}
