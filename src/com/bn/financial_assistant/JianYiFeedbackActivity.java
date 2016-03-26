package com.bn.financial_assistant;


import com.bn.assets.dd;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class JianYiFeedbackActivity extends Activity {
	
	
	
	
	// protected static final Activity MailSenderActivity = null;
	private String contentStr;

	private EditText et;
	
	private ProgressDialog progressDialog; 
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activity_jian_yi_feedback);
		Button submit = (Button) findViewById(R.id.submit);

		
		et = (EditText) findViewById(R.id.EditText01);
		
		submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				
				contentStr = et.getText().toString();
				
				
				if(contentStr.length()==0){
					
					Toast.makeText(getApplicationContext(), "请填写内容～", Toast.LENGTH_SHORT).show();  
					return ;
					
				}
				
				
				progressDialog = ProgressDialog.show(JianYiFeedbackActivity.this, "", "正在发送,请稍候！");
				
				
				
				
				
				new Thread(){
					public void run(){
						
						
						
						dd d=new dd();
						d.runn(contentStr);
						
						Message msg_listData = new Message();
						msg_listData.what =0;					
		                handler.sendMessage(msg_listData);
					}
				}.start();
				
				
				
				
				
				
				
			/*	if (isConnect() == false) {
					
					Toast.makeText(getApplicationContext(), "111111111", Toast.LENGTH_SHORT).show();  
					
				} else {
				
					Toast.makeText(getApplicationContext(), "2222222", Toast.LENGTH_SHORT).show();  
				}
				*/
				
				/*EditText et = (EditText) findViewById(R.id.EditText01);
				contentStr = et.getText().toString();

				if (isConnect(JianYiFeedbackActivity.this) == false) {
					
					Toast.makeText(getApplicationContext(), "111111111", Toast.LENGTH_SHORT).show();  
					
				} else {
					// sendThread t = new sendThread();
					// t.start();
					
					System.out.println("hahahah");
					
					Toast.makeText(getApplicationContext(), "2222222", Toast.LENGTH_SHORT).show();  
					
					System.out.println("fdfdfdfdfdfd");
				}

				*/
			}
		});
		
	}
	
	public void abcd(View view){
		
		JianYiFeedbackActivity.this.finish();
		
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK
				|| keyCode == KeyEvent.KEYCODE_HOME
				&& event.getRepeatCount() == 0) {

			JianYiFeedbackActivity.this.finish();

			return false;

		}

		return false;

	}
	
	@SuppressLint("HandlerLeak")
	private Handler handler = new Handler() {
		public void handleMessage(Message message) {
            switch (message.what) {
            case 0:
            	progressDialog.dismiss(); //关闭进度条
            	Toast.makeText(getApplicationContext(), "邮件发送成功", Toast.LENGTH_SHORT).show();  
            	et.setText("");
            	break;
            }
		}
	};

	public  boolean isConnect() {

		// 获取手机所有连接管理对象（包括对wi-fi,net等连接的管理）
		/*
		 * try { ConnectivityManager connectivity = (ConnectivityManager)
		 * context .getSystemService(Context.CONNECTIVITY_SERVICE); if
		 * (connectivity != null) {
		 * 
		 * // 获取网络连接管理的对象 NetworkInfo info =
		 * connectivity.getActiveNetworkInfo();
		 * 
		 * if (info != null && info.isConnected()) { // 判断当前网络是否已经连接 if
		 * (info.getState() == NetworkInfo.State.CONNECTED) { return true; } } }
		 * } catch (Exception e) { e.printStackTrace(); } return false;
		 */

		ConnectivityManager cm = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
		NetworkInfo info = cm.getActiveNetworkInfo();
		if (info != null) {
			return true;
		}
		if (info == null) {
			return false;
		}

		return true;

	}

	class sendThread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			/*
			 * MailSenderInfo mailInfo = new MailSenderInfo();
			 * mailInfo.setMailServerHost("smtp.126.com");
			 * mailInfo.setMailServerPort("25"); mailInfo.setValidate(true);
			 * mailInfo.setUserName("qisucha1988@126.com");
			 * mailInfo.setPassword("maleipeng520");// 您的邮箱密码
			 * mailInfo.setFromAddress("qisucha1988@126.com");
			 * mailInfo.setToAddress("qisucha1988@126.com");
			 * mailInfo.setSubject(""); mailInfo.setContent(contentStr);
			 * SimpleMailSender sms = new SimpleMailSender();
			 * sms.sendTextMail(mailInfo);
			 */

		}

	}
}
