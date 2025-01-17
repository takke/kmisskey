package work.socialhub.kmisskey.api

import work.socialhub.kmisskey.api.request.gallery.*
import work.socialhub.kmisskey.api.request.i.IListGalleryPostsRequest
import work.socialhub.kmisskey.api.request.users.ListUserGalleryPostsRequest
import work.socialhub.kmisskey.api.response.gallery.ListGalleryPostsResponse
import work.socialhub.kmisskey.entity.GalleryPost
import work.socialhub.kmisskey.entity.share.Response

interface GalleriesResource {

    /**
     * Get gallery posts.
     * @see "https://misskey.io/api-doc.operation/gallery/posts"
     */
    fun posts(
        request: ListGalleryPostsRequest
    ): Response<Array<ListGalleryPostsResponse>>

    /**
     * Get my gallery posts.
     * @see "https://misskey.io/api-doc.operation/i/gallery/posts"
     */
    fun posts(
        request: IListGalleryPostsRequest
    ): Response<Array<ListGalleryPostsResponse>>

    /**
     * Get user's gallery posts.
     * @see "https://misskey.io/api-doc.operation/users/gallery/posts"
     */
    fun posts(
        request: ListUserGalleryPostsRequest
    ): Response<Array<ListGalleryPostsResponse>>

    /**
     * Show a gallery post.
     * @see "https://misskey.io/api-doc.operation/gallery/posts/show"
     */
    fun show(
        request: ShowGalleryPostRequest
    ): Response<GalleryPost>

    /**
     * Create a gallery post.
     * @see "https://misskey.io/api-doc.operation/gallery/posts/create"
     */
    fun create(
        request: CreateGalleryPostRequest
    ): Response<GalleryPost>

    /**
     * Delete a gallery post.
     *
     * @see "https://misskey.io/api-doc.operation/gallery/posts/delete"
     */
    fun delete(
        request: DeleteGalleryPostRequest
    ): Response<Unit>

    /**
     * Update a gallery post.
     * @see "https://misskey.io/api-doc.operation/gallery/posts/delete"
     */
    fun update(
        request: UpdateGalleryPostRequest
    ): Response<GalleryPost>

    /**
     * Like a gallery post.
     * @see "https://misskey.io/api-doc.operation/gallery/posts/like"
     */
    fun like(
        request: LikeGalleryPostRequest
    ): Response<Unit>

    /**
     * Unlike a gallery post.
     *
     * @see "https://misskey.io/api-doc.operation/gallery/posts/unlike"
     */
    fun like(
        request: UnlikeGalleryPostRequest
    ): Response<Unit>
}
