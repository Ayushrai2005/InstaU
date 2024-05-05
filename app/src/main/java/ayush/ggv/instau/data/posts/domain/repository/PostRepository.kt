package ayush.ggv.instau.data.posts.domain.repository

import ayush.ggv.instau.data.posts.domain.model.PostResultData
import ayush.ggv.instau.model.PostResponse
import ayush.ggv.instau.model.PostTextParams
import ayush.ggv.instau.model.PostsResponse
import ayush.ggv.instau.util.Result

interface PostRepository {
    suspend fun getFeedPosts(currentUserId: Long, page: Int, limit: Int ,token : String ) : Result<PostsResponse>

    suspend fun createPost(postTextParams: PostTextParams, token: String) : Result<PostResponse>
}