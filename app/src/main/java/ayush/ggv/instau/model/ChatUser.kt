package ayush.ggv.instau.model

import java.util.Date

data class User(
    val name: String,
    val avatarUrl: String,
    val isOnline: Boolean,
    val lastOnline: Date,
)