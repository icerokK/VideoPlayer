package com.example.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_player.*

class Player : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        configureVideoView()
    }

    private fun configureVideoView() {
        //val sampleVideo = findViewById<VideoView>(R.id.videoView)
        val path = "android.resource://" + packageName + "/" + R.raw.nature
        //val path = "android.resource://com.example.VideoPlayer/" + R.raw.nature
        videoView.setVideoURI(Uri.parse(path))
        //videoView.setVideoPath("android:resource://" + packageName + "/" + R.raw.nature)
        //videoView.setVideoPath("http://www.ebookfrenzy.com/android_book/nature.mp4")
        videoView.start()
    }
}
