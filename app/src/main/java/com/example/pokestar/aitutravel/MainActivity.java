package com.example.pokestar.aitutravel;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.pokestar.aitutravel.base.BaseActivity;
import com.example.pokestar.aitutravel.ui.CardFragment;
import com.example.pokestar.aitutravel.ui.CircleFragment;
import com.example.pokestar.aitutravel.ui.DiscoveryFragment;
import com.example.pokestar.aitutravel.ui.HomeFragment;
import com.example.pokestar.aitutravel.ui.MineFragment;
import com.example.pokestar.aitutravel.utils.ToastUtil;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends BaseActivity {

    BottomNavigationViewEx bnve;


    @Override
    protected Fragment createFragment() {
        return HomeFragment.newInstance();
    }

    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    public int getContainerId() {
        return R.id.fragment_container;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnve = (BottomNavigationViewEx) findViewById(R.id.bnve);
        initBNView();
        initEvent();
    }



    private void initBNView() {
        bnve.enableItemShiftingMode(false);
        bnve.enableShiftingMode(false);
        bnve.enableAnimation(false);

    }

    private void initEvent() {

        bnve.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.i_circle:
                        replaceFragment(CircleFragment.newInstance());
                        return true;
                    case R.id.i_discover:
                        replaceFragment(DiscoveryFragment.newInstance());
                        return true;
                    case R.id.i_homepage:
                        replaceFragment(HomeFragment.newInstance());
                        return true;
                    case R.id.i_card:
                        replaceFragment(CardFragment.newInstance());
                        return true;
                    case R.id.i_mine:
                        replaceFragment(MineFragment.newInstance());
                        return true;
                }
                return false;
            }
        });


    }
}