package work.socialhub.kmisskey.internal.api

import work.socialhub.kmisskey.MisskeyAPI
import work.socialhub.kmisskey.api.RegistryResource
import work.socialhub.kmisskey.api.request.registry.GetAllRegistryRequest
import work.socialhub.kmisskey.api.request.registry.GetRegistryRequest
import work.socialhub.kmisskey.api.request.registry.KeysRegistryRequest
import work.socialhub.kmisskey.api.request.registry.ScopesWithDomainRequest
import work.socialhub.kmisskey.api.request.registry.SetRegistryRequest
import work.socialhub.kmisskey.api.response.registry.GetAllRegistryResponse
import work.socialhub.kmisskey.api.response.registry.GetRegistryResponse
import work.socialhub.kmisskey.api.response.registry.ScopesWithDomainResponse
import work.socialhub.kmisskey.entity.share.Response

class RegistryResourceImpl(uri: String, i: String) : AbstractResourceImpl(uri, i), RegistryResource {

    /**
     * {@inheritDoc}
     */
    override fun get(request: GetRegistryRequest): Response<GetRegistryResponse> {
        return post(MisskeyAPI.IRegistryGet.path, request)
    }

    /**
     * {@inheritDoc}
     */
    override fun getAll(request: GetAllRegistryRequest): Response<GetAllRegistryResponse> {
        return post(MisskeyAPI.IRegistryGetAll.path, request)
    }

    /**
     * {@inheritDoc}
     */
    override fun keys(request: KeysRegistryRequest): Response<Array<String>> {
        return post(MisskeyAPI.IRegistryKeys.path, request)
    }

    /**
     * {@inheritDoc}
     */
    override fun set(request: SetRegistryRequest): Response<Unit> {
        return post(MisskeyAPI.IRegistrySet.path, request)
    }

    /**
     * {@inheritDoc}
     */
    override fun scopesWithDomain(): Response<ScopesWithDomainResponse> {
        return post(MisskeyAPI.IRegistryScopesWithDomain.path, ScopesWithDomainRequest())
    }
}
