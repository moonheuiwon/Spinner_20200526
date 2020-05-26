package com.example.spinner_20200526;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.spinner_20200526.adapters.OccupationSpinnerAdapter;
import com.example.spinner_20200526.databinding.ActivityMainBinding;
import com.example.spinner_20200526.datas.Occupation;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    List<Occupation> occupations = new ArrayList<>();
    OccupationSpinnerAdapter osa;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        addOccupations();
        osa = new OccupationSpinnerAdapter(mContext, R.layout.occupation_spinner_list_item, occupations);
        binding.occSpinner.setAdapter(osa);
    }
    void addOccupations() {
        occupations.add(new Occupation("안드로이드", R.drawable.android_icon));
        occupations.add(new Occupation("iOS", R.drawable.ios_icon));
        occupations.add(new Occupation("웹프론트", R.drawable.web));
        occupations.add(new Occupation("서버", R.drawable.server));

    }
}
