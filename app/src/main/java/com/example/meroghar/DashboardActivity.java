package com.example.meroghar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.meroghar.Fragments.FavoritesFragment;
import com.example.meroghar.Fragments.DashboardFragment;
import com.example.meroghar.Fragments.ProfileFragment;
import com.example.meroghar.Fragments.PropertiesFragment;
import com.example.meroghar.Models.Wishlist;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    public static List<Wishlist> wishlistList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        getSupportActionBar().hide();
        wishlistList = new ArrayList<>();
        wishlistList.add(new Wishlist("Beautiful house for sell", "12345", "Nayapaati", R.drawable.background3));
      // wishlistList.add(new Wishlist("get your dream house", "15000", "dillibazar", R.drawable.wishlist2));
//
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);



        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListner);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new DashboardFragment()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListner =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectFragment = null;
                    switch (item.getItemId()){

                        case R.id.nav_dashboard:
                            selectFragment = new DashboardFragment();
                            break;
                        case R.id.nav_favorite:
                            selectFragment = new FavoritesFragment();
                            break;

                        case R.id.nav_properties:
                            selectFragment = new PropertiesFragment();
                            break;

                        case R.id.nav_profile:
                            selectFragment = new ProfileFragment();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectFragment).commit();
                    return true;
                }
            };



}
