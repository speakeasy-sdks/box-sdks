import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutRetentionPoliciesIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=retention_policy_id" })
  retentionPolicyId: string;
}

export enum PutRetentionPoliciesIdRequestBodyDispositionActionEnum {
    PermanentlyDelete = "permanently_delete",
    RemoveRetention = "remove_retention"
}


export class PutRetentionPoliciesIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=are_owners_notified" })
  areOwnersNotified?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_owner_extend_retention" })
  canOwnerExtendRetention?: boolean;

  @SpeakeasyMetadata({ data: "json, name=custom_notification_recipients", elemType: shared.UserMini })
  customNotificationRecipients?: shared.UserMini[];

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=disposition_action" })
  dispositionAction?: PutRetentionPoliciesIdRequestBodyDispositionActionEnum;

  @SpeakeasyMetadata({ data: "json, name=policy_name" })
  policyName?: string;

  @SpeakeasyMetadata({ data: "json, name=retention_length" })
  retentionLength?: string;

  @SpeakeasyMetadata({ data: "json, name=retention_type" })
  retentionType?: string;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: string;
}


export class PutRetentionPoliciesIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutRetentionPoliciesIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutRetentionPoliciesIdRequestBody;
}


export class PutRetentionPoliciesIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  retentionPolicy?: shared.RetentionPolicy;

  @SpeakeasyMetadata()
  statusCode: number;
}
