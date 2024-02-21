package misskey4j.api.request.i

import kotlinx.serialization.Serializable
import misskey4j.api.model.TokenRequest

@Serializable
class IFavoritesRequest(
    override var i: String
) : TokenRequest() {

    var limit: Long? = null
    var sinceId: String? = null
    var untilId: String? = null
}
