package com.example.shangzburgers;
import androidx.appcompat.app.AppCompatActivity; import android.content.Intent;
import android.os.Bundle; import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Bundle b; Intent i;
    ImageView v1,v2,v3,v4,v5,v6,v7, v8, v9, v10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = new Bundle();
        i = new Intent(MainActivity.this, MainActivity2.class);
        v1=(ImageView) findViewById(R.id.imageView);
        v2=(ImageView) findViewById(R.id.imageView2);
        v3=(ImageView) findViewById(R.id.imageView3);
        v4=(ImageView) findViewById(R.id.imageView4);
        v5=(ImageView) findViewById(R.id.imageView5);
        v6=(ImageView) findViewById(R.id.imageView6);
        v7=(ImageView) findViewById(R.id.imageView7);
        v8=(ImageView) findViewById(R.id.imageView8);
        v9=(ImageView) findViewById(R.id.imageView9);
        v10=(ImageView) findViewById(R.id.imageView10);

        v1.setOnClickListener(this);
        v2.setOnClickListener(this);
        v3.setOnClickListener(this);
        v4.setOnClickListener(this);
        v5.setOnClickListener(this);
        v6.setOnClickListener(this);
        v7.setOnClickListener(this);
        v8.setOnClickListener(this);
        v9.setOnClickListener(this);
        v10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView) {
            b.putInt("cod", 1);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.imageView2) {
            b.putInt("cod", 2);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.imageView3) {
            b.putInt("cod", 3);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.imageView4) {
            b.putInt("cod", 4);
            i.putExtras(b);
            startActivity(i);
        } else if (v.getId() == R.id.imageView5) {
            b.putInt("cod", 5);
            i.putExtras(b);
            startActivity(i);
        } else if(v.getId() == R.id.imageView6) {
            b.putInt("cod", 6);
            i.putExtras(b);
            startActivity(i);
        } else if(v.getId() == R.id.imageView7) {
            b.putInt("cod", 7);
            i.putExtras(b);
            startActivity(i);
        } else if(v.getId() == R.id.imageView8) {
            b.putInt("cod", 8);
            i.putExtras(b);
            startActivity(i);
        } else if(v.getId() == R.id.imageView9) {
            b.putInt("cod", 9);
            i.putExtras(b);
            startActivity(i);
        } else if(v.getId() == R.id.imageView10) {
            b.putInt("cod", 10);
            i.putExtras(b);
            startActivity(i);
        }
    }
}