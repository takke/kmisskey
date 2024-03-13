package work.socialhub.kmisskey.api.request.registry

import kotlinx.serialization.Serializable
import work.socialhub.kmisskey.api.model.TokenRequest

@Serializable
class GetAllRegistryRequest : TokenRequest() {

    var scope: List<String>? = null
    var domain: String? = null
}
