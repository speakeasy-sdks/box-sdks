package boxsdk

import (
	"context"
	"fmt"
	"net/http"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type TransferFolders struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewTransferFolders(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *TransferFolders {
	return &TransferFolders{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// PutUsersIDFolders0 - Transfer owned folders
// Move all of the items (files, folders and workflows) owned by a user into
// another user's account
//
// Only the root folder (`0`) can be transferred.
//
// Folders can only be moved across users by users with administrative
// permissions.
//
// All existing shared links and folder-level collaborations are transferred
// during the operation. Please note that while collaborations at the individual
// file-level are transferred during the operation, the collaborations are
// deleted when the original user is deleted.
//
// This call will be performed synchronously which might lead to a slow response
// when the source user has a large number of items in all of its folders.
//
// If the destination path has a metadata cascade policy attached to any of
// the parent folders, a metadata cascade operation will be kicked off
// asynchronously.
//
// There is currently no way to check for when this operation is finished.
//
// The destination folder's name will be in the format `{User}'s Files and
// Folders`, where `{User}` is the display name of the user.
//
// To make this API call your application will need to have the "Read and write
// all files and folders stored in Box" scope enabled.
//
// Please make sure the destination user has access to `Relay` or `Relay Lite`,
// and has access to the files and folders involved in the workflows being
// transferred.
//
// Admins will receive an email when the operation is completed.
func (s *TransferFolders) PutUsersIDFolders0(ctx context.Context, request operations.PutUsersIDFolders0Request) (*operations.PutUsersIDFolders0Response, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/users/{user_id}/folders/0", request.PathParams)

	bodyReader, reqContentType, err := utils.SerializeRequestBody(ctx, request)
	if err != nil {
		return nil, fmt.Errorf("error serializing request body: %w", err)
	}

	req, err := http.NewRequestWithContext(ctx, "PUT", url, bodyReader)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

	req.Header.Set("Content-Type", reqContentType)

	utils.PopulateQueryParams(ctx, req, request.QueryParams)

	client := s._securityClient

	retryConfig := request.Retries
	if retryConfig == nil {
		retryConfig = &utils.RetryConfig{
			Strategy: "backoff",
			Backoff: &utils.BackoffStrategy{
				InitialInterval: 500,
				MaxInterval:     60000,
				Exponent:        1.5,
				MaxElapsedTime:  3600000,
			},
			RetryConnectionErrors: true,
		}
	}

	httpRes, err := utils.Retry(ctx, utils.Retries{
		Config: retryConfig,
		StatusCodes: []string{
			"5XX",
		},
	}, func() (*http.Response, error) {
		return client.Do(req)
	})
	if err != nil {
		return nil, fmt.Errorf("error sending request: %w", err)
	}
	defer httpRes.Body.Close()

	contentType := httpRes.Header.Get("Content-Type")

	res := &operations.PutUsersIDFolders0Response{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.Folder
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.Folder = out
		}
	case httpRes.StatusCode == 403:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.ClientError
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.ClientError = out
		}
	default:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.ClientError
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.ClientError = out
		}
	}

	return res, nil
}
