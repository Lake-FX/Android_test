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
		//首页跳转
		button_index.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(IndexActivity.this,IndexActivity.class);
				startActivity(intent);
			}
		});
		//服务帮助跳转
		button_help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(IndexActivity.this,HelpActivity.class);
				startActivity(intent);
			}
		});
		//设置页面跳转
		button_set.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(IndexActivity.this,SetActivity.class);
				startActivity(intent);
			}
		});
		//新闻中心跳转
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
