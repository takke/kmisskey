package work.socialhub.kmisskey.api.request.blocks

import kotlinx.serialization.Serializable
import work.socialhub.kmisskey.api.model.TokenRequest

@Serializable
class BlocksCreateRequest : TokenRequest() {

    var userId: String? = null
}
