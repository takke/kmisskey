package misskey4j.entity

import kotlinx.serialization.Serializable

@Serializable
open class Poll {
    var multiple = false
    var expiresAt: String? = null
    var choices: List<Choice>? = null
}
