import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";


export enum PostRetentionPoliciesRequestBodyDispositionActionEnum {
    PermanentlyDelete = "permanently_delete",
    RemoveRetention = "remove_retention"
}

export enum PostRetentionPoliciesRequestBodyPolicyTypeEnum {
    Finite = "finite",
    Indefinite = "indefinite"
}

export enum PostRetentionPoliciesRequestBodyRetentionTypeEnum {
    Modifiable = "modifiable",
    NonModifiable = "non-modifiable"
}


export class PostRetentionPoliciesRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=are_owners_notified" })
  areOwnersNotified?: boolean;

  @SpeakeasyMetadata({ data: "json, name=can_owner_extend_retention" })
  canOwnerExtendRetention?: boolean;

  @SpeakeasyMetadata({ data: "json, name=custom_notification_recipients", elemType: shared.UserMini })
  customNotificationRecipients?: shared.UserMini[];

  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=disposition_action" })
  dispositionAction: PostRetentionPoliciesRequestBodyDispositionActionEnum;

  @SpeakeasyMetadata({ data: "json, name=policy_name" })
  policyName: string;

  @SpeakeasyMetadata({ data: "json, name=policy_type" })
  policyType: PostRetentionPoliciesRequestBodyPolicyTypeEnum;

  @SpeakeasyMetadata({ data: "json, name=retention_length" })
  retentionLength?: string;

  @SpeakeasyMetadata({ data: "json, name=retention_type" })
  retentionType?: PostRetentionPoliciesRequestBodyRetentionTypeEnum;
}


export class PostRetentionPoliciesRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PostRetentionPoliciesRequestBody;
}


export class PostRetentionPoliciesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  retentionPolicy?: shared.RetentionPolicy;

  @SpeakeasyMetadata()
  statusCode: number;
}
