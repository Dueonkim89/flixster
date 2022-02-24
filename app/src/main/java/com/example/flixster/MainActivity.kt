package com.example.flixster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers

private const val URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var client = AsyncHttpClient()
        client.get(URL, object: JsonHttpResponseHandler() {
            override fun onFailure(
                statusCode: Int,
                headers: Headers?,
                response: String?,
                throwable: Throwable?
            ) {
                TODO("Not yet implemented")
            }

            override fun onSuccess(statusCode: Int, headers: Headers?, json: JSON?) {
                TODO("Not yet implemented")
            }

        })
    }
}