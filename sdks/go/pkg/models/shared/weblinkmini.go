package shared

type WebLinkMiniTypeEnum string

const (
	WebLinkMiniTypeEnumWebLink WebLinkMiniTypeEnum = "web_link"
)

// WebLinkMini
// Web links are objects that point to URLs. These objects
// are also known as bookmarks within the Box web application.
//
// Web link objects are treated similarly to file objects,
// they will also support most actions that apply to regular files.
type WebLinkMini struct {
	Etag       *string                `json:"etag,omitempty"`
	ID         string                 `json:"id"`
	Name       *string                `json:"name,omitempty"`
	SequenceID map[string]interface{} `json:"sequence_id,omitempty"`
	Type       WebLinkMiniTypeEnum    `json:"type"`
	URL        *string                `json:"url,omitempty"`
}
