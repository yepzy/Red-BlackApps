package yepzy.redblackdrunk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Cyril on 30/05/2016.
 */
public class Playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        ImageView cardShow = (ImageView) findViewById(R.id.cardShow);
        cardShow.setImageResource(R.drawable.carreau_1);
    }
}
