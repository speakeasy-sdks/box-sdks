package boxsdk

import (
	"context"
	"fmt"
	"net/http"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
	"strings"
)

type LegalHoldPolicyAssignments struct {
	_defaultClient  HTTPClient
	_securityClient HTTPClient
	_serverURL      string
	_language       string
	_sdkVersion     string
	_genVersion     string
}

func NewLegalHoldPolicyAssignments(defaultClient, securityClient HTTPClient, serverURL, language, sdkVersion, genVersion string) *LegalHoldPolicyAssignments {
	return &LegalHoldPolicyAssignments{
		_defaultClient:  defaultClient,
		_securityClient: securityClient,
		_serverURL:      serverURL,
		_language:       language,
		_sdkVersion:     sdkVersion,
		_genVersion:     genVersion,
	}
}

// DeleteLegalHoldPolicyAssignmentsID - Unassign legal hold policy
// Remove a legal hold from an item.
//
// This is an asynchronous process. The policy will not be
// fully removed yet when the response returns.
func (s *LegalHoldPolicyAssignments) DeleteLegalHoldPolicyAssignmentsID(ctx context.Context, request operations.DeleteLegalHoldPolicyAssignmentsIDRequest) (*operations.DeleteLegalHoldPolicyAssignmentsIDResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}", request.PathParams)

	req, err := http.NewRequestWithContext(ctx, "DELETE", url, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

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

	res := &operations.DeleteLegalHoldPolicyAssignmentsIDResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 202:
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

// GetLegalHoldPolicyAssignments - List legal hold policy assignments
// Retrieves a list of items a legal hold policy has been assigned to.
func (s *LegalHoldPolicyAssignments) GetLegalHoldPolicyAssignments(ctx context.Context, request operations.GetLegalHoldPolicyAssignmentsRequest) (*operations.GetLegalHoldPolicyAssignmentsResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/legal_hold_policy_assignments"

	req, err := http.NewRequestWithContext(ctx, "GET", url, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

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

	res := &operations.GetLegalHoldPolicyAssignmentsResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.LegalHoldPolicyAssignments
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.LegalHoldPolicyAssignments = out
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

// GetLegalHoldPolicyAssignmentsID - Get legal hold policy assignment
// Retrieve a legal hold policy assignment.
func (s *LegalHoldPolicyAssignments) GetLegalHoldPolicyAssignmentsID(ctx context.Context, request operations.GetLegalHoldPolicyAssignmentsIDRequest) (*operations.GetLegalHoldPolicyAssignmentsIDResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}", request.PathParams)

	req, err := http.NewRequestWithContext(ctx, "GET", url, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

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

	res := &operations.GetLegalHoldPolicyAssignmentsIDResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.LegalHoldPolicyAssignment
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.LegalHoldPolicyAssignment = out
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

// GetLegalHoldPolicyAssignmentsIDFileVersionsOnHold - List previous file versions for legal hold policy assignment
// Get a list of previous file versions for a legal hold
// assignment.
//
// In some cases you may only need the latest file versions instead. In these
// cases, use the `GET  /legal_hold_policy_assignments/:id/files_on_hold` API
// instead to return any current (latest) versions of a file for this legal hold
// policy assignment.
//
// Due to ongoing re-architecture efforts this API might not return all files
// held for this policy ID. Instead, this API will only return past file versions
// held in the newly developed architecture. The `GET /file_version_legal_holds`
// API can be used to fetch current and past versions of files held within the
// legacy architecture.
//
// The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
// find a list of policy assignments for a given policy ID.
func (s *LegalHoldPolicyAssignments) GetLegalHoldPolicyAssignmentsIDFileVersionsOnHold(ctx context.Context, request operations.GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldRequest) (*operations.GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/file_versions_on_hold", request.PathParams)

	req, err := http.NewRequestWithContext(ctx, "GET", url, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

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

	res := &operations.GetLegalHoldPolicyAssignmentsIDFileVersionsOnHoldResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.FileVersionLegalHolds
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.FileVersionLegalHolds = out
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

// GetLegalHoldPolicyAssignmentsIDFilesOnHold - List current file versions for legal hold policy assignment
// Get a list of current file versions for a legal hold
// assignment.
//
// In some cases you may want to get previous file versions instead. In these
// cases, use the `GET  /legal_hold_policy_assignments/:id/file_versions_on_hold`
// API instead to return any previous versions of a file for this legal hold
// policy assignment.
//
// Due to ongoing re-architecture efforts this API might not return all file
// versions held for this policy ID. Instead, this API will only return the
// latest file version held in the newly developed architecture. The `GET
// /file_version_legal_holds` API can be used to fetch current and past versions
// of files held within the legacy architecture.
//
// The `GET /legal_hold_policy_assignments?policy_id={id}` API can be used to
// find a list of policy assignments for a given policy ID.
func (s *LegalHoldPolicyAssignments) GetLegalHoldPolicyAssignmentsIDFilesOnHold(ctx context.Context, request operations.GetLegalHoldPolicyAssignmentsIDFilesOnHoldRequest) (*operations.GetLegalHoldPolicyAssignmentsIDFilesOnHoldResponse, error) {
	baseURL := s._serverURL
	url := utils.GenerateURL(ctx, baseURL, "/legal_hold_policy_assignments/{legal_hold_policy_assignment_id}/files_on_hold", request.PathParams)

	req, err := http.NewRequestWithContext(ctx, "GET", url, nil)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

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

	res := &operations.GetLegalHoldPolicyAssignmentsIDFilesOnHoldResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 200:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.FileVersionLegalHolds
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.FileVersionLegalHolds = out
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

// PostLegalHoldPolicyAssignments - Assign legal hold policy
// Assign a legal hold to a file, file version, folder, or user.
func (s *LegalHoldPolicyAssignments) PostLegalHoldPolicyAssignments(ctx context.Context, request operations.PostLegalHoldPolicyAssignmentsRequest) (*operations.PostLegalHoldPolicyAssignmentsResponse, error) {
	baseURL := s._serverURL
	url := strings.TrimSuffix(baseURL, "/") + "/legal_hold_policy_assignments"

	bodyReader, reqContentType, err := utils.SerializeRequestBody(ctx, request)
	if err != nil {
		return nil, fmt.Errorf("error serializing request body: %w", err)
	}

	req, err := http.NewRequestWithContext(ctx, "POST", url, bodyReader)
	if err != nil {
		return nil, fmt.Errorf("error creating request: %w", err)
	}

	req.Header.Set("Content-Type", reqContentType)

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

	res := &operations.PostLegalHoldPolicyAssignmentsResponse{
		StatusCode:  int64(httpRes.StatusCode),
		ContentType: contentType,
	}
	switch {
	case httpRes.StatusCode == 201:
		switch {
		case utils.MatchContentType(contentType, `application/json`):
			var out *shared.LegalHoldPolicyAssignment
			if err := utils.UnmarshalJsonFromResponseBody(httpRes.Body, &out); err != nil {
				return nil, err
			}

			res.LegalHoldPolicyAssignment = out
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
