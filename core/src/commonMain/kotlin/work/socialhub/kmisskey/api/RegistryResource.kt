package work.socialhub.kmisskey.api

import work.socialhub.kmisskey.api.request.registry.GetAllRegistryRequest
import work.socialhub.kmisskey.api.request.registry.GetRegistryRequest
import work.socialhub.kmisskey.api.request.registry.KeysRegistryRequest
import work.socialhub.kmisskey.api.request.registry.SetRegistryRequest
import work.socialhub.kmisskey.api.response.registry.GetAllRegistryResponse
import work.socialhub.kmisskey.api.response.registry.GetRegistryResponse
import work.socialhub.kmisskey.api.response.registry.ScopesWithDomainResponse
import work.socialhub.kmisskey.entity.share.Response

interface RegistryResource {
    /**
     * https://misskey.io/api-doc#operation/i/registry/get
     */
    fun get(request: GetRegistryRequest): Response<GetRegistryResponse>

    /**
     * https://misskey.io/api-doc#operation/i/registry/get-all
     */
    fun getAll(request: GetAllRegistryRequest): Response<GetAllRegistryResponse>

    /**
     * https://misskey.io/api-doc#operation/i/registry/keys
     */
    fun keys(request: KeysRegistryRequest): Response<Array<String>>

    /**
     * https://misskey.io/api-doc#operation/i/registry/set
     */
    fun set(request: SetRegistryRequest): Response<Unit>

    /**
     * i/registry/scopes-with-domain
     */
    fun scopesWithDomain(): Response<ScopesWithDomainResponse>
}
