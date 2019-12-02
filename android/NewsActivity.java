package com.example.lvjx17412;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class NewsActivity extends Activity {
    private int[] imgIds;
    private String[] titles;
    private String[] authors;
    private ArrayList<News> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        titles = new String[]{
                "季前赛-汉密尔顿24分林书豪11分 北京胜肯帝亚",
                "上海赛费德勒挽救五赛点仍不敌兹维列夫 无缘四强",
                "这次，NBA倒是立即道歉了",
                "我想学习编程,但是不知道该怎么开始",
                "四国赛-童磊世界波陈彬彬造乌龙 国奥2-0印尼U22",
                "昨晚有人在为五星红旗拼命 有人却在践踏民族尊严"
        };

        authors = new String[]{
                "胡靖航",
                "汉密尔顿",
                "费德勒",
                "休斯顿",
                "樊振东",
                "国安"
        };

        imgIds = new int[]{
                R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,
                R.drawable.a5,
                R.drawable.a6,
        };

        news = new ArrayList<News>();
        News ns;
        for (int j=0;j<20;j++) {
            for (int i=0;i<titles.length;i++) {
                ns = new News();
                ns.title = titles[i];
                ns.author = authors[i];
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                ns.time = sdf.format(new Date());
                news.add(ns);
            }
        }
        ListView lv =  (ListView) findViewById(R.id.lv);
    	lv.setAdapter(new ListViewAdapter());
        
    }
   
    class ListViewAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return news.size();
        }

        @Override
        public News getItem(int position) {
            return news.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view ;
            ViewHolder viewHolder ;
            if (convertView == null) {
                view = View.inflate(com.example.lvjx17412.NewsActivity.this, R.layout.listview_item, null);
                viewHolder = new ViewHolder();
                view.setTag(viewHolder);
            } else {
                view = convertView;
                viewHolder = (ViewHolder) view.getTag();
            }

            viewHolder.title = (TextView) view.findViewById(R.id.tv_title);
            viewHolder.time = (TextView) view.findViewById(R.id.tv_time);
            viewHolder.author = (TextView) view.findViewById(R.id.tv_author);
            viewHolder.img =  (ImageView) view.findViewById(R.id.img);

            News ns = news.get(position);

            viewHolder.title.setText(ns.title);
            viewHolder.time.setText(ns.time);
            viewHolder.author.setText(ns.author);
            viewHolder.img.setImageResource(imgIds[position % imgIds.length]);

            return view;
        }
    }

    class ViewHolder {
        TextView title ;
        TextView time;
        TextView author;
        ImageView img;
    }
}