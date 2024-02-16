package misskey4j.api.request.notes

import misskey4j.api.model.TokenRequest

class NotesConversationRequest(
    i:String
) : TokenRequest(i) {

    var noteId: String? = null
    var limit: Long? = null
    var offset: Long? = null
}