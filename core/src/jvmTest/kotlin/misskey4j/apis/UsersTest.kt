package misskey4j.apis

import misskey4j.AbstractTest
import misskey4j.api.request.i.IRequest
import misskey4j.api.request.users.*
import kotlin.test.Test

class UsersTest : AbstractTest() {

    @Test
    fun testUsersFollowings() {
        val misskey = misskey()

        val i = misskey.accounts().i(IRequest(misskey.i!!))
        val followings =
            misskey.users().followings(
                UsersFollowingsRequest().also {
                    it.userId = i.data.id
                })

        for (following in followings.data) {
            println(following.followee!!.id + " : " + following.followee!!.name)
        }
    }

    @Test
    fun testUsersRelation() {
        val misskey = misskey()

        val relations =
            misskey.users().relation(
                UsersRelationRequest(misskey.i!!).also {
                    it.userId = listOf(
                        "7rkrarq81i",
                        "7rkrg1wo1a",
                    )
                })

        for (relation in relations.data) {
            println(relation.id + " : " + relation.isFollowing)
        }
    }

    @Test
    fun testUsersSearch() {
        val misskey = misskey()

        val users = misskey.users().search(
            UsersSearchRequest().also {
                it.query = "Cat"
            })

        for (user in users.data) {
            println(user.username)
        }
    }

    @Test
    fun testShowUsers() {
        val misskey = misskey()

        val users = misskey.users().show(
            UsersShowMultipleRequest(misskey.i!!).also {
                it.userIds = listOf(
                    "7rkrarq81i",
                    "7rkrg1wo1a",
                )
            })

        println(users.data[0].username)
    }

    @Test
    fun testShowUser() {
        val misskey = misskey()

        run {
            val users = misskey.users().show(
                UsersShowSingleRequest(misskey.i!!).also {
                    it.userId = "7rkrarq81i"
                    it.host = "misskey.io"
                })
            println(users.data.username)
        }

        run {
            val users = misskey.users().show(
                UsersShowSingleRequest(misskey.i!!).also {
                    it.userId = "7rkrarq81i"
                })
            println(users.data.username)
        }
    }
}
