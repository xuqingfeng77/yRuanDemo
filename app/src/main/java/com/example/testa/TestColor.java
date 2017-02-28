package com.example.testa;

import com.imcc.contactActivity.WebChatActivity;
import com.imcc.utils.SPUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import cn.eeepay.yruan.R;

public class TestColor extends Activity {

	Button id_tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.testcolor);
		id_tv = (Button) findViewById(R.id.id_tv);
		id_tv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
//				CustomerManager.createSmallWindow(TestColor.this);
				SPUtil.putString(TestColor.this,"package","cn.eeepay.yruan");//cn.eeepay.yruan是AndroidManifest.xml中的package
				Intent it = new Intent(TestColor.this,WebChatActivity.class);
				it.putExtra("imcc-cust-im-number", "1000@96729823082");//这些数据是假的
				it.putExtra("imcc-host-im-number", "QYeeYw");//这些数据是假的
				startActivity(it);
			}
		});
		
		
		
	}


	public String teset(int id) {
		StringBuffer stringBuffer = new StringBuffer();
		int color = getResources().getColor(id);
		int red = (color & 0xff0000) >> 16;
		int green = (color & 0x00ff00) >> 8;
		int blue = (color & 0x0000ff);
		stringBuffer.append("#");
		stringBuffer.append(Integer.toHexString(red));
		stringBuffer.append(Integer.toHexString(green));
		stringBuffer.append(Integer.toHexString(blue));
		return stringBuffer.toString();
	}


	@Override
	protected void onPause() {
		super.onPause();
	}

}
