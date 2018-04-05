package com.example.raul.lolbuilds.view.activities;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import com.example.raul.lolbuilds.R;

public class ContactoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    public void enviarFormulario (View view){

        EditText nameField = findViewById(R.id.nombre);
        String name = nameField.getText().toString();
        EditText asuntoField = findViewById(R.id.asunto);
        String asunto = asuntoField.getText().toString();
        EditText textField = findViewById(R.id.mensaje);
        String text = textField.getText().toString();
        String mensaje = createForm(name,text);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:rsaavedra@elpuig.xeill.net"));
        intent.putExtra(Intent.EXTRA_SUBJECT,asunto);
        intent.putExtra(Intent.EXTRA_TEXT,mensaje);

        if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }

    }

    private String createForm(String name, String text)
    {
        String mensaje = "Nombre: " + name;
        mensaje = mensaje + "\nTexto: " + text;
        return mensaje;
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        ContactoActivity.this.finish();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_build) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            ContactoActivity.this.finish();
        } else if (id == R.id.nav_bans) {
            Intent intent = new Intent(this, BansActivity.class);
            startActivity(intent);
            ContactoActivity.this.finish();
        }
        else if (id == R.id.nav_help) {
            Intent intent = new Intent(this, HelpActivity.class);
            startActivity(intent);
            ContactoActivity.this.finish();
        }
        else if (id == R.id.nav_ajustes) {
            Intent intent = new Intent(this, AjustesActivity.class);
            startActivity(intent);
            ContactoActivity.this.finish();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
