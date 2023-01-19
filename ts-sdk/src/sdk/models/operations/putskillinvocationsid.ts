import { SpeakeasyMetadata, SpeakeasyBase, RetryConfig } from "../../../internal/utils";
import * as shared from "../shared";



export class PutSkillInvocationsIdPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=skill_id" })
  skillId: string;
}

export enum PutSkillInvocationsIdRequestBodyFileTypeEnum {
    File = "file"
}


// PutSkillInvocationsIdRequestBodyFile
/** 
 * The file to assign the cards to.
**/
export class PutSkillInvocationsIdRequestBodyFile extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PutSkillInvocationsIdRequestBodyFileTypeEnum;
}

export enum PutSkillInvocationsIdRequestBodyFileVersionTypeEnum {
    FileVersion = "file_version"
}


// PutSkillInvocationsIdRequestBodyFileVersion
/** 
 * The optional file version to assign the cards to.
**/
export class PutSkillInvocationsIdRequestBodyFileVersion extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=id" })
  id?: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: PutSkillInvocationsIdRequestBodyFileVersionTypeEnum;
}


// PutSkillInvocationsIdRequestBodyMetadata
/** 
 * The metadata to set for this skill. This is a list of
 * Box Skills cards. These cards will overwrite any existing Box
 * skill cards on the file.
**/
export class PutSkillInvocationsIdRequestBodyMetadata extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cards" })
  cards?: any[];
}

export enum PutSkillInvocationsIdRequestBodyStatusEnum {
    Invoked = "invoked",
    Processing = "processing",
    Success = "success",
    TransientFailure = "transient_failure",
    PermanentFailure = "permanent_failure"
}


// PutSkillInvocationsIdRequestBodyUsage
/** 
 * A descriptor that defines what items are affected by this call.
 * 
 * Set this to the default values when setting a card to a `success`
 * state, and leave it out in most other situations.
**/
export class PutSkillInvocationsIdRequestBodyUsage extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=unit" })
  unit?: string;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: number;
}


export class PutSkillInvocationsIdRequestBody extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=file" })
  file: PutSkillInvocationsIdRequestBodyFile;

  @SpeakeasyMetadata({ data: "json, name=file_version" })
  fileVersion?: PutSkillInvocationsIdRequestBodyFileVersion;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata: PutSkillInvocationsIdRequestBodyMetadata;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status: PutSkillInvocationsIdRequestBodyStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=usage" })
  usage?: PutSkillInvocationsIdRequestBodyUsage;
}


export class PutSkillInvocationsIdRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  retries?: RetryConfig;

  @SpeakeasyMetadata()
  pathParams: PutSkillInvocationsIdPathParams;

  @SpeakeasyMetadata({ data: "request, media_type=application/json" })
  request?: PutSkillInvocationsIdRequestBody;
}


export class PutSkillInvocationsIdResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  clientError?: shared.ClientError;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}
