package com.example.criminalintent;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    /*
    public static final String EXTRA_CRIME_ID =
            "com.example.criminalintent.crime_id";
     */
    private   static final String EXTRA_CRIME_ID =
            "com.example.criminalintent.crime_id";

    public static Intent newIntent(Context packageContent, UUID crimeID){
        Intent intent = new Intent(packageContent,MainActivity.class);
        intent.putExtra(EXTRA_CRIME_ID,crimeID);
        return intent;
    }
    @Override
    protected Fragment createFragment() {
        //return new CrimeFragment();
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }

}
