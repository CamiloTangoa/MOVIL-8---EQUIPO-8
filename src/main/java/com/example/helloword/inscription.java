package com.example.helloword;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx. navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloword.databinding.ActivityIncripcionBinding;

public class inscription extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityIncripcionBinding binding;
    private Spinner spinnerGroup,spinnerRH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityIncripcionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_incripcion);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        spinnerGroup= findViewById(R.id.SpinnerGrupo);
        String[] grupos={"O","A","B","AB"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,grupos);
        spinnerGroup.setAdapter(adapter);

        spinnerGroup= findViewById(R.id.spinnerRH);
        String[] rhs={"+","-"};
        ArrayAdapter<String>adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,rhs);
        spinnerGroup.setAdapter(adapter2);

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_incripcion);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}