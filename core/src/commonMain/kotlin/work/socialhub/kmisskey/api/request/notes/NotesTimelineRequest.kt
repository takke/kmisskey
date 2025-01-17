package work.socialhub.kmisskey.api.request.notes

import kotlinx.serialization.Serializable
import work.socialhub.kmisskey.api.model.TokenRequest

@Serializable
class NotesTimelineRequest : TokenRequest() {

    var limit: Long? = null
    var sinceId: String? = null
    var untilId: String? = null
    var sinceDate: Long? = null
    var untilDate: Long? = null

    var includeMyRenotes: Boolean? = null
    var includeRenotedMyNotes: Boolean? = null
    var includeLocalRenotes: Boolean? = null
    var withFiles: Boolean? = null
    var withReplies: Boolean? = null
}
