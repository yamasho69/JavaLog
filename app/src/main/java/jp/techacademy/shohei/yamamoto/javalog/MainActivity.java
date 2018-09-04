package jp.techacademy.shohei.yamamoto.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("～～",24,"料理");//名前を～～、年齢～～歳で、趣味が料理のHumanのインスタンスを作る
        human.say();
        human.think();
    }
}