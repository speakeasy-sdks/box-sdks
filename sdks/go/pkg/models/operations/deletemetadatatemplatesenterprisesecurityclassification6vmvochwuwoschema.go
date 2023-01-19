package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type DeleteMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaRequest struct {
	Retries *utils.RetryConfig
}

type DeleteMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaResponse struct {
	ClientError *shared.ClientError
	ContentType string
	StatusCode  int64
}
