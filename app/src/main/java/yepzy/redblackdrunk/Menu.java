package yepzy.redblackdrunk;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        createListNbPlayer((Spinner) findViewById(R.id.list_nb_player));
    }

    private void createListNbPlayer(Spinner listNbPlayer){
        List<Integer> listNb = new ArrayList<Integer>();
        for (int i=1;i <= 12; i++){
            listNb.add(i);
        }
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(getApplicationContext(),android.R.layout.simple_spinner_item,listNb);
        listNbPlayer.setAdapter(adapter);
    }

    public void play(View v) {
        Intent nextActivity = new Intent(this, Playing.class);
        startActivity(nextActivity);
    }
}
