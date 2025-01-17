package work.socialhub.kmisskey.api.request.notes

import kotlinx.serialization.Serializable
import work.socialhub.kmisskey.api.model.TokenRequest

@Serializable
class NotesLocalTimelineRequest : TokenRequest() {

    var withFiles: Boolean? = null
    var fileType: List<String>? = null

    var excludeNsfw: Boolean? = null
    var limit: Long? = null

    var sinceId: String? = null
    var untilId: String? = null
    var sinceDate: Long? = null
    var untilDate: Long? = null
}
