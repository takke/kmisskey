package misskey4j.api.request.i

import misskey4j.api.model.TokenRequest

class IFavoritesRequest(
    i: String
) : TokenRequest(i) {

    var limit: Long? = null
    var sinceId: String? = null
    var untilId: String? = null
}
