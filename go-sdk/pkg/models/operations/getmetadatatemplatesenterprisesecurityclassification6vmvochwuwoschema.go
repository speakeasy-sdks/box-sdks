package operations

import (
	"openapi/pkg/models/shared"
	"openapi/pkg/utils"
)

type GetMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaRequest struct {
	Retries *utils.RetryConfig
}

type GetMetadataTemplatesEnterpriseSecurityClassification6VMVochwUWoSchemaResponse struct {
	ClassificationTemplate *shared.ClassificationTemplate
	ClientError            *shared.ClientError
	ContentType            string
	StatusCode             int64
}
