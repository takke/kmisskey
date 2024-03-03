package work.socialhub.kmisskey.api.request.users

import kotlinx.serialization.Serializable

@Serializable
class UsersFollowersRequest {

    var userId: String? = null
    var username: String? = null
    var host: String? = null

    var sinceId: String? = null
    var untilId: String? = null
    var limit: Long? = null
}