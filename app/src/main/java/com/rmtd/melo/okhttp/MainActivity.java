package com.rmtd.melo.okhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv_content);
//        //get 请求
//        OkHttpUtils.get(UrlConfig.url_get, new OkHttpUtils.ResultCallback<String>() {
//            @Override
//            public void onSuccess(String response) {
//                String string = response.toString();
//                mTextView.setText(string);
//            }
//
//            @Override
//            public void onFailure(Exception e) {
//
//            }
//        });

        //post请求
        HashMap<String, String> map = new HashMap<>();
        map.put("robotid", "1");
        map.put("token", "1");
        map.put("title", "1");
        map.put("singer", "周杰伦");
        map.put("str", "听周杰伦的歌");
        OkHttpUtils.post(UrlConfig.url_post, new OkHttpUtils.ResultCallback<String>() {
            @Override
            public void onSuccess(String response) {
                String string = response.toString();
                mTextView.setText(string);
            }

            @Override
            public void onFailure(Exception e) {

            }
        }, map);

    }
}
