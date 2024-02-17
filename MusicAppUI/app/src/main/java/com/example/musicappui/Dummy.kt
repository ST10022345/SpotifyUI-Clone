package com.example.musicappui

import androidx.annotation.DrawableRes

data class lib(@DrawableRes val icon : Int, val name: String)

val libraries = listOf<lib>(
lib(R.drawable.baseline_playlist_add_24, "Playlist"),
    lib(R.drawable.baseline_mic_external_on_24, "Artists"),
    lib(R.drawable.baseline_album_24, "Albums"),
    lib(R.drawable.baseline_music_note_24, "Songs")



)