import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";
import { FileConflict } from "./fileconflict";


export enum ConflictErrorCodeEnum {
    Created = "created",
    Accepted = "accepted",
    NoContent = "no_content",
    Redirect = "redirect",
    NotModified = "not_modified",
    BadRequest = "bad_request",
    Unauthorized = "unauthorized",
    Forbidden = "forbidden",
    NotFound = "not_found",
    MethodNotAllowed = "method_not_allowed",
    Conflict = "conflict",
    PreconditionFailed = "precondition_failed",
    TooManyRequests = "too_many_requests",
    InternalServerError = "internal_server_error",
    Unavailable = "unavailable",
    ItemNameInvalid = "item_name_invalid",
    InsufficientScope = "insufficient_scope"
}


export class ConflictErrorContextInfo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=conflicts", elemType: FileConflict })
  conflicts?: FileConflict[];
}

export enum ConflictErrorTypeEnum {
    Error = "error"
}


// ConflictError
/** 
 * A generic error
**/
export class ConflictError extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code?: ConflictErrorCodeEnum;

  @SpeakeasyMetadata({ data: "json, name=context_info" })
  contextInfo?: ConflictErrorContextInfo;

  @SpeakeasyMetadata({ data: "json, name=help_url" })
  helpUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;

  @SpeakeasyMetadata({ data: "json, name=request_id" })
  requestId?: string;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: number;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ConflictErrorTypeEnum;
}
