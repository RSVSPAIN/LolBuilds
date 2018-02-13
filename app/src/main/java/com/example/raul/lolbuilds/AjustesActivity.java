package com.example.raul.lolbuilds;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Locale;

public class AjustesActivity extends AppCompatPreferenceActivity {
    private static final String TAG = AjustesActivity.class.getSimpleName();

    Locale myLocale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.setTitle(getResources().getString(R.string.title_activity_ajustes));

        addPreferencesFromResource(R.xml.pref_ajustes);

        Preference langPreference = getPreferenceScreen().findPreference("idioma_key");
        langPreference.setOnPreferenceChangeListener(languageChangeListener);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        AjustesActivity.this.finish();
    }

    private static void bindPreferenceSummaryToValue(Preference preference) {
        preference.setOnPreferenceChangeListener(sBindPreferenceSummaryToValueListener);

        sBindPreferenceSummaryToValueListener.onPreferenceChange(preference,
                PreferenceManager
                        .getDefaultSharedPreferences(preference.getContext())
                        .getString(preference.getKey(), ""));
    }

    private static Preference.OnPreferenceChangeListener sBindPreferenceSummaryToValueListener = new Preference.OnPreferenceChangeListener() {
        @Override
        public boolean onPreferenceChange(Preference preference, Object newValue) {
            String stringValue = newValue.toString();

            if (preference instanceof ListPreference) {
                // For list preferences, look up the correct display value in
                // the preference's 'entries' list.
                ListPreference listPreference = (ListPreference) preference;
                int index = listPreference.findIndexOfValue(stringValue);

                // Set the summary to reflect the new value.
                preference.setSummary(
                        index >= 0
                                ? listPreference.getEntries()[index]
                                : null);

            }

            return true;
        }
    };

        Preference.OnPreferenceChangeListener languageChangeListener = new Preference.OnPreferenceChangeListener() {

        @Override
        public boolean onPreferenceChange(Preference preference, Object newValue) {

            switch (newValue.toString()) {
                case "0":
                    setLocale("es");
                    Toast.makeText(getApplicationContext(), "Aplicacion en Castellano!", Toast.LENGTH_LONG).show();
                    break;

                case "1":
                    setLocale("ca");
                    Toast.makeText(getApplicationContext(), "Aplicació en Català!", Toast.LENGTH_LONG).show();
                    break;

                case "2":
                    setLocale("en");
                    Toast.makeText(getApplicationContext(), "Application in English!", Toast.LENGTH_LONG).show();
                    break;
                default:
                    setLocale("es");
                    Toast.makeText(getApplicationContext(), "Aplicacion en Castellano!", Toast.LENGTH_LONG).show();
                    break;

            }
            return true;
        }
    };

    public void setLocale(String lang) {
        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, AjustesActivity.class);
        finish();
        startActivity(refresh);
    }
}