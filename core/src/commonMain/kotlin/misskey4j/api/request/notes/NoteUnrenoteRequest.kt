package misskey4j.api.request.notes

import misskey4j.api.model.TokenRequest

class NoteUnrenoteRequest(
    i: String
) : TokenRequest(i) {

    var noteId: String? = null
}