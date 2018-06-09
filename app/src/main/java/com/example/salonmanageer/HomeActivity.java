package com.example.salonmanageer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    TextView textView_viewcust;
    TextView textView_viewemp;
    TextView textView_viewbook;
    TextView textView_viewservice;
    TextView textView_formcust;
    TextView textView_formbook;
    TextView textView_formemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView_viewcust=(TextView)findViewById(R.id.textView_viewcust);
        textView_viewcust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, view_customer_activity.class));

            }
        });
        textView_viewemp=(TextView)findViewById(R.id.textView_viewemp);
        textView_viewemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, view_employee_activity.class));

            }
        });
        textView_viewbook=(TextView)findViewById(R.id.textView_viewbook);
        textView_viewbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, add_booking_activity.class));

            }
        });
        textView_viewservice=(TextView)findViewById(R.id.textView_viewservice);
        textView_viewservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, add_service_activity.class));

            }
        });
        textView_formcust=(TextView)findViewById(R.id.textView_formcust);
        textView_formcust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, customer_deatil_activity.class));

            }
        });
        textView_formemp=(TextView)findViewById(R.id.textView_formemp);
        textView_formemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, employee_detail_activity.class));

            }
        });
        textView_formbook=(TextView)findViewById(R.id.textView_formbook);
        textView_formbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,
                        booking_detail_activity.class));

            }
        });
    /*







*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.


        switch (item.getItemId()) {
            case R.id.nav_viewcustomer /*2131493098*/:
                startActivity(new Intent(this, view_customer_activity.class));
                break;
            case R.id.nav_viewemployee /*2131493099*/:
                startActivity(new Intent(this, view_employee_activity.class));
                break;
            case R.id.nav_viewservices /*2131493100*/:
                startActivity(new Intent(this, add_service_activity.class));
                break;
            case R.id.nav_viewbooking /*2131493101*/:
                startActivity(new Intent(this, booking_detail_activity.class));
                break;
            case R.id.nav_viewgallary /*2131493102*/:
                startActivity(new Intent(this, content_gallery_activity.class));
                break;
            default:
                Toast.makeText(HomeActivity.this.getApplicationContext(), "Unable to select menu", Toast.LENGTH_SHORT).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onClick(View view) {

    }
}
