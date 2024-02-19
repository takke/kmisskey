package misskey4j.api.response.notes

import kotlinx.serialization.Serializable
import misskey4j.entity.Note
import misskey4j.entity.User

@Serializable
class UsersReactionsResponse {

    var id: String? = null
    var createdAt: String? = null
    var user: User? = null
    var type: String? = null
    var note: Note? = null
}