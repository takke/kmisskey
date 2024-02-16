package misskey4j.api.request.notes

import misskey4j.api.model.TokenRequest

class NotesUserListTimelineRequest(
    i: String
) : TokenRequest(i) {

    var listId: String? = null

    var limit: Long? = null
    var sinceId: String? = null
    var untilId: String? = null
    var sinceDate: Long? = null
    var untilDate: Long? = null

    var includeMyRenotes: Boolean? = null
    var includeRenotedMyNotes: Boolean? = null
    var includeLocalRenotes: Boolean? = null
    var withFiles: Boolean? = null
}