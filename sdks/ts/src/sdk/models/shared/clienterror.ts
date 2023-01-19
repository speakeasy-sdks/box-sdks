import { SpeakeasyMetadata, SpeakeasyBase } from "../../../internal/utils";


export enum ClientErrorCodeEnum {
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


// ClientErrorContextInfo
/** 
 * A free-form object that contains additional context
 * about the error. The possible fields are defined on
 * a per-endpoint basis. `message` is only one example.
**/
export class ClientErrorContextInfo extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;
}

export enum ClientErrorTypeEnum {
    Error = "error"
}


// ClientError
/** 
 * A generic error
**/
export class ClientError extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=code" })
  code?: ClientErrorCodeEnum;

  @SpeakeasyMetadata({ data: "json, name=context_info" })
  contextInfo?: ClientErrorContextInfo;

  @SpeakeasyMetadata({ data: "json, name=help_url" })
  helpUrl?: string;

  @SpeakeasyMetadata({ data: "json, name=message" })
  message?: string;

  @SpeakeasyMetadata({ data: "json, name=request_id" })
  requestId?: string;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status?: number;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: ClientErrorTypeEnum;
}
