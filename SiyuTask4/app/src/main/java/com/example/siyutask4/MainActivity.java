package com.example.siyutask4;

import android.os.Bundle;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.siyutask4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {

    ActivityMainBinding binding;
    RatingBar r1Bar;
    RatingBar r2Bar;
    RatingBar r3Bar;
    RatingBar r4Bar;
    RatingBar r5Bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    // bind event listeners for the rating bars
    private void init() {
        r1Bar = binding.restaurant1.cardViewRatingbar1;
        r1Bar.setOnRatingBarChangeListener(this);

        r2Bar = binding.restaurant2.cardViewRatingbar2;
        r2Bar.setOnRatingBarChangeListener(this);

        r3Bar = binding.restaurant3.cardViewRatingbar3;
        r3Bar.setOnRatingBarChangeListener(this);

        r4Bar = binding.restaurant4.cardViewRatingbar4;
        r4Bar.setOnRatingBarChangeListener(this);

        r5Bar = binding.restaurant5.cardViewRatingbar5;
        r5Bar.setOnRatingBarChangeListener(this);
    }


    // set the rating number by retrieving the data of rating bar
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if (ratingBar.getId() == r1Bar.getId()) {
            binding.restaurant1.cardViewRateNumber.setText(String.valueOf(rating));
        } else if (ratingBar.getId() == r2Bar.getId()) {
            binding.restaurant2.cardViewRateNumber.setText(String.valueOf(rating));
        } else if (ratingBar.getId() == r3Bar.getId()) {
            binding.restaurant3.cardViewRateNumber.setText(String.valueOf(rating));
        } else if (ratingBar.getId() == r4Bar.getId()) {
            binding.restaurant4.cardViewRateNumber.setText(String.valueOf(rating));
        } else if (ratingBar.getId() == r5Bar.getId()) {
            binding.restaurant5.cardViewRateNumber.setText(String.valueOf(rating));
        }
    }
}