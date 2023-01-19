package .models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * PutUsersIdRequestBodyNotificationEmail
 * An alternate notification email address to which email
 * notifications are sent. When it's confirmed, this will be
 * the email address to which notifications are sent instead of
 * to the primary email address.
 * 
 * Set this value to `null` to remove the notification email.
**/
public class PutUsersIdRequestBodyNotificationEmail {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;
    public PutUsersIdRequestBodyNotificationEmail withEmail(String email) {
        this.email = email;
        return this;
    }
}