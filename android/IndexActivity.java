package com.example.lvjx17412;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
		Button button_index = (Button)findViewById(R.id.button_index);
		Button button_help = (Button)findViewById(R.id.button_help);
		Button button_news = (Button)findViewById(R.id.button_news);
		Button button_set = (Button)findViewById(R.id.button_set);
		//��ҳ��ת
		button_index.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(IndexActivity.this,IndexActivity.class);
				startActivity(intent);
			}
		});
		//���������ת
		button_help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(IndexActivity.this,HelpActivity.class);
				startActivity(intent);
			}
		});
		//����ҳ����ת
		button_set.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(IndexActivity.this,SetActivity.class);
				startActivity(intent);
			}
		});
		//����������ת
		button_news.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(IndexActivity.this,NewsActivity.class);
				startActivity(intent);
			}
		});
	}
}
