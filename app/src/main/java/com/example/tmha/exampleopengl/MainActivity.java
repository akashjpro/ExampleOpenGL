package com.example.tmha.exampleopengl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tmha.exampleopengl.lesson1.TriangleColorActivity;
import com.example.tmha.exampleopengl.lesson2.LessonTwoActivity;
import com.example.tmha.exampleopengl.lesson3.LessonThreeActivity;
import com.example.tmha.exampleopengl.lesson4.LessonFourActivity;
import com.example.tmha.exampleopengl.lesson5.LessonFiveActivity;
import com.example.tmha.exampleopengl.lesson6.LessonSixActivity;
import com.example.tmha.exampleopengl.lesson7.LessonSevenActivity;
import com.example.tmha.exampleopengl.lesson8.LessonEightActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lessonOneClick(View view) {
        startActivity(new Intent(this, TriangleColorActivity.class));
    }

    public void lessonTwoClick(View view) {
        startActivity(new Intent(this, LessonTwoActivity.class));
    }

    public void lessonThreeClick(View view) {
        startActivity(new Intent(this, LessonThreeActivity.class));
    }

    public void lessonFourClick(View view) {
        startActivity(new Intent(this, LessonFourActivity.class));
    }

    public void lessonFiveClick(View view) {
        startActivity(new Intent(this, LessonFiveActivity.class));
    }

    public void lessonSixClick(View view) {
        startActivity(new Intent(this, LessonSixActivity.class));
    }

    public void lessonSevenClick(View view) {
        startActivity(new Intent(this, LessonSevenActivity.class));
    }

    public void lessonEightClick(View view) {
        startActivity(new Intent(this, LessonEightActivity.class));
    }
}
