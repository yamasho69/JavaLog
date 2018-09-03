package jp.techacademy.shohei.yamamoto.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("トム",25,"料理");//名前をトム、年齢25歳で、趣味が料理のHumanのインスタンスを作る
        human.say();
        human.think();

        Human human2 = new Human("クルーズ",38,"映画");//名前をクルーズ、年齢38歳で、趣味が映画のHumanのインスタンスを作る
        human2.say();
        human2.think();
    }
}