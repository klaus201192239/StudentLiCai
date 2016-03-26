package com.bn.financial_assistant;

import com.bn.specification.SprcificationActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class JobActivity extends Activity {
	
	private WebView webview;
	private Button bn_back;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
        webview = (WebView) findViewById(R.id.jobwebView);
        WebSettings webSettings = webview.getSettings();
        //设置WebView属性，能够执行Javascript脚本  
        webSettings.setJavaScriptEnabled(true);  
        //设置可以访问文件
        webSettings.setAllowFileAccess(true);
         //设置支持缩放
        webSettings.setBuiltInZoomControls(true);
        //加载需要显示的网页  
        webview.loadUrl("http://m.jianzhiba.net/bj/");  
        
        //webview.loadUrl("http://caifu.baidu.com/bank?tn=98012088_3_dg&zt=ps&fr=ps&qid=18093045536836519905");
        
        //设置Web视图  
        webview.setWebViewClient(new webViewClient ());  
        
        
        
        bn_back = (Button) this.findViewById(R.id.layout_job_bn_back);
		bn_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(JobActivity.this, MainActivity.class);
				startActivity(intent);
				overridePendingTransition(R.anim.main_back, R.anim.add_back);
				JobActivity.this.finish();
			}
		});
         
    }
      
     
    @Override 
    //设置回退  
    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法  
    public boolean onKeyDown(int keyCode, KeyEvent event) {  
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {  
            webview.goBack(); //goBack()表示返回WebView的上一页面  
            return true;  
        }  
        finish();//结束退出程序
        return false;  
    }  
       
    //Web视图  
    private class webViewClient extends WebViewClient {  
        public boolean shouldOverrideUrlLoading(WebView view, String url) {  
            view.loadUrl(url);  
            return true;  
        }  
    }  
	
}
