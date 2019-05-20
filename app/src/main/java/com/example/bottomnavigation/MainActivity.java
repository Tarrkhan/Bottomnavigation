package com.example.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNavigation);
        txt=findViewById(R.id.txtid);

    bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id)
        {
            case R.id.bullhorn:
                txt.setText(getResources().getText(R.string.bullhorn));
                return true;
            case R.id.cannibas:
                txt.setText(getResources().getText(R.string.cannibas));
                return true;
            case R.id.debug:
                txt.setText(getResources().getText(R.string.debug));
                return true;
            case R.id.nearbyid:
                txt.setText(getResources().getText(R.string.nearby));
                return true;
            case R.id.wine:
                txt.setText(getResources().getText(R.string.wine));
                return true;
        }
        return false;
    }
}
