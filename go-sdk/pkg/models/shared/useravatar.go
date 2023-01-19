package shared

// UserAvatarPicUrls
// Represents an object with user avatar URLs.
type UserAvatarPicUrls struct {
	Large   *string `json:"large,omitempty"`
	Preview *string `json:"preview,omitempty"`
	Small   *string `json:"small,omitempty"`
}

// UserAvatar
// A resource holding URLs to the
// avatar uploaded to a Box application.
type UserAvatar struct {
	PicUrls *UserAvatarPicUrls `json:"pic_urls,omitempty"`
}
