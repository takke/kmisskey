package misskey4j.api.request.users

import kotlinx.serialization.Serializable
import misskey4j.api.model.TokenRequest

@Serializable
class UsersRelationRequest(
    override var i: String
) : TokenRequest() {

    var userId: List<String>? = null
}
