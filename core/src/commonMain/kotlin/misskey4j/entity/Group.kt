package misskey4j.entity

import kotlinx.serialization.Serializable

@Serializable
class Group {

    var id: String? = null
    var createdAt: String? = null

    var name: String? = null
    var ownerId: String? = null
    var userIds: List<String>? = null
}


