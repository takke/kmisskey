package work.socialhub.kmisskey.api.request.registry

import kotlinx.serialization.Serializable
import work.socialhub.kmisskey.api.model.TokenRequest

@Serializable
class SetRegistryRequest : TokenRequest() {

    var key: String? = null
    var value: Any? = null
    var scope: List<String>? = null
    var domain: String? = null
}
