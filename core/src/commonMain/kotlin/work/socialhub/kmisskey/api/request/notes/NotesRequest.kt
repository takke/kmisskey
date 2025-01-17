package work.socialhub.kmisskey.api.request.notes

import kotlinx.serialization.Serializable
import work.socialhub.kmisskey.api.model.TokenRequest

@Serializable
class NotesRequest : TokenRequest() {

    var local: Boolean? = null
    var reply: Boolean? = null
    var renote: Boolean? = null
    var withFiles: Boolean? = null
    var poll: Boolean? = null

    var limit: Long? = null
    var sinceId: String? = null
    var untilId: String? = null
}


