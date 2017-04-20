package com.example.livemydemo;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.tencent.TIMCallBack;
import com.tencent.TIMFriendshipManager;
import com.tencent.TIMManager;
import com.tencent.TIMUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                loginQQ();
                break;
        }

    }

    /**
     * 独立模式登录，所有内容是写死的，具体生成usersigner这个请参考腾讯的文档
     */
    private void loginQQ(){
        final TIMUser user = new TIMUser();
        user.setIdentifier("50857");
        user.setAccountType("12001");
        user.setAppIdAt3rd(String.valueOf(Constants.sdkAppId));
        TIMManager.getInstance().login(
                Constants.sdkAppId,                   //sdkAppId，由腾讯分配
                user,
                Constants.UserSig,                    //用户帐号签名，由私钥加密获得，具体请参考文档
                new TIMCallBack() {//回调接口

                    @Override
                    public void onSuccess() {//登录成功
                        Intent i=new Intent(MainActivity.this,LiveActivity.class);
                        i.putExtra("playUrl",
                                "rtmp://8818.liveplay.myqcloud.com/live/8818_0444da35c9");
                        i.putExtra("groupId",Constants.groupId);
                        startActivity(i);
                        setMyNickName("鬼片");

                    }

                    @Override
                    public void onError(int code, String desc) {//登录失败

                        //错误码code和错误描述desc，可用于定位请求失败原因
                        //错误码code含义请参见错误码表


                    }
                });
    }
    public void setMyNickName(String nickName){
        TIMFriendshipManager.getInstance().setNickName(nickName, new TIMCallBack() {
            @Override
            public void onError(int i, String s) {

            }

            @Override
            public void onSuccess() {

            }
        });
    }
}
