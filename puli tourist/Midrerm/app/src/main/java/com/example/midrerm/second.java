package com.example.midrerm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {
    private ListView listLand;

    int[] resId = new int[] {R.drawable.t152,R.drawable.t157,R.drawable.t161};
    String[] mark = new String[] {"恒吉宮媽祖廟","南興打鐵街","靈巖山寺"};
    String[] address = new String[] {"南投縣埔里鎮南興街367號","南投縣埔里鎮南興打鐵街","南投縣埔里鎮中正路105-1號"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Toast.makeText(getApplicationContext(),"onCreate(2)",Toast.LENGTH_LONG).show();

        listLand = findViewById(R.id.lstmark);
        MyAdapter adapter = new MyAdapter(this);
        listLand.setAdapter(adapter);
        listLand.setOnItemClickListener(listLandListener);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart(2)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart(2)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume(2)",Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause(2)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop(2)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy(2)",Toast.LENGTH_LONG).show();
    }

    private AdapterView.OnItemClickListener listLandListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent2 = new Intent();
            intent2.setClass(second.this, third2.class);
            startActivity(intent2);
        }
    };
    private class MyAdapter extends BaseAdapter{
        private LayoutInflater myInflater;
        public MyAdapter(Context c){
            myInflater = LayoutInflater.from(c);
        }
        @Override
        public int getCount() {
            return mark.length;
        }

        @Override
        public Object getItem(int i) {
            return mark[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = myInflater.inflate(R.layout.landmark,null);
            ImageView imgLogo = view.findViewById(R.id.imgLogo);
            TextView txtName = view.findViewById(R.id.txtName);
            TextView txtAddress = view.findViewById(R.id.txtAddress);

            imgLogo.setImageResource(resId[i]);
            txtName.setText(mark[i]);
            txtAddress.setText(address[i]);
            return view;
        }


    }

}
