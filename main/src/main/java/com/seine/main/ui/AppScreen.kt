package com.seine.main.ui

enum class AppMainScreen {
    Room,
    Moment,
    Message,
    RoomRelatedRecently,
    RoomRelatedJoined,
    RoomRelatedFollowing,
    RoomAllPopular,
    RoomAllNew,
    RoomExplore,
    MomentFollowing,
    MomentFeatured,
    MomentTopics,
    MessageList,
    MessageFriends
}

fun AppMainScreen.convertAppMainScreen() = when (this) {
    AppMainScreen.MessageList, AppMainScreen.MessageFriends -> AppMainScreen.Message
    AppMainScreen.MomentFollowing, AppMainScreen.MomentFeatured -> AppMainScreen.Moment
    else -> AppMainScreen.Room
}
