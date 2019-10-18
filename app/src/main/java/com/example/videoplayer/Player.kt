package com.example.videoplayer


import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player.*
import android.widget.MediaController

class Player : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        configureVideoView()
    }
    private var mediaController: MediaController? = null
    private fun configureVideoView() {
        //val sampleVideo = findViewById<VideoView>(R.id.videoView)
        val path = "android.resource://" + packageName + "/" + R.raw.nature
        //val path = "android.resource://com.example.VideoPlayer/" + R.raw.nature
        videoView.setVideoURI(Uri.parse(path))
        //videoView.setVideoPath("http://www.ebookfrenzy.com/android_book/nature.mp4")
        mediaController = MediaController(this)
        mediaController?.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.start()
    }
}
