package misskey4j.api.request.users

class UsersSearchRequest {

    var query: String? = null

    var offset: Long? = null
    var limit: Long? = null

    var localOnly: Boolean? = null
    var detail: Boolean? = null
}