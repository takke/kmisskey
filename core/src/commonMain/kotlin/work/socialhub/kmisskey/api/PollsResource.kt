package work.socialhub.kmisskey.api

import work.socialhub.kmisskey.api.request.polls.PollsVoteRequest
import work.socialhub.kmisskey.entity.share.Response

interface PollsResource {

    /**
     * 指定した投稿のアンケートに投票します。
     * (注釈：複数回答が可能な投票については回答毎にこの API をコールする)
     * https://misskey.io/api-doc#operation/notes/polls/vote
     */
    fun pollsVote(
        request: PollsVoteRequest
    ): Response<Unit>
}
