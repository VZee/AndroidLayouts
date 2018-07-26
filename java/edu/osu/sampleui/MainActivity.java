package edu.osu.sampleui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Sources: http://classes.engr.oregonstate.edu/eecs/spring2018/cs496/module-6/basic-activity.html

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button horizontalViewItem = (Button) findViewById(R.id.Layout1);
        horizontalViewItem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HorizontalViewActivity.class);
                startActivity(intent);
            }
        });

        Button gridViewItem = (Button) findViewById(R.id.Layout2);
        gridViewItem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });

        Button relativeViewItem = (Button) findViewById(R.id.Layout3);
        relativeViewItem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeViewActivity.class);
                startActivity(intent);
            }
        });

        Button tableViewItem = (Button) findViewById(R.id.Layout4);
        tableViewItem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TableViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
