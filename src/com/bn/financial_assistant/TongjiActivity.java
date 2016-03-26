package com.bn.financial_assistant;

import com.bn.account.IncomeListActivity;
import com.bn.account.PayListActivity;
import com.bn.firstviewpage.GuideActivity;
import com.bn.knowledge.KnowledgeActivity;
import com.bn.specification.SprcificationActivity;
import com.bn.util.FontManager;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class TongjiActivity extends Activity {

	private ListView SpList;
	private Button bn_back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activity_tongji);
		
		SpList = (ListView) this.findViewById(R.id.tongjispecificationlistView1);
		SpList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				if (position == 0) {
					Intent intent = new Intent();
					intent.setClass(TongjiActivity.this,
							PayListActivity.class);
					startActivity(intent);
					overridePendingTransition(R.anim.add_go, R.anim.main_go);
					//TongjiActivity.this.finish();
				}
				if (position == 1) {
					Intent intent = new Intent();
					intent.setClass(TongjiActivity.this,IncomeListActivity.class);
					//intent.setClass(SprcificationActivity.this,AccountItemActivity.class);
					startActivity(intent);
					overridePendingTransition(R.anim.add_go, R.anim.main_go);
					//TongjiActivity.this.finish();
					
					//Toast.makeText(getApplicationContext(), "2222222", Toast.LENGTH_SHORT).show();  
					
				}
			}
		});

		bn_back = (Button) this.findViewById(R.id.layout_tongji_bn_back);
		bn_back.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(TongjiActivity.this, MainActivity.class);
				startActivity(intent);
				overridePendingTransition(R.anim.main_back, R.anim.add_back);
				TongjiActivity.this.finish();
			}
		});

		// ¸ü¸Ä×ÖÌå
		FontManager.initTypeFace(this);
		ViewGroup vg = FontManager.getContentView(this);
		FontManager.changeFonts(vg, this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tongji, menu);
		return true;
	}
	

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK
				|| keyCode == KeyEvent.KEYCODE_HOME
				&& event.getRepeatCount() == 0) {

			Intent intent = new Intent();
			intent.setClass(TongjiActivity.this, MainActivity.class);
			startActivity(intent);
			overridePendingTransition(R.anim.main_back, R.anim.add_back);
			TongjiActivity.this.finish();

			return false;

		}

		return false;

	}

}
