package misskey4j.api.request.webhooks

import misskey4j.api.model.TokenRequest

class CreateWebhooksRequest(
    i: String
) : TokenRequest(i) {

    var name: String? = null
    var url: String? = null
    var on: List<String>? = null
    var secret: String? = null
}
