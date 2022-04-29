package com.example.reconquista;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class Begining_the_game extends AppCompatActivity {
One_list One_list = new One_list();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.begining_the_game);
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final ImageView imageView1 = (ImageView) findViewById(R.id.imageview1);
        final ImageView crusaders_die = (ImageView) findViewById(R.id.crusaders_die);
        final ImageView death_arrow = (ImageView) findViewById(R.id.death_arrow);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        final TextView textView6 = (TextView) findViewById(R.id.textView6);
        final TextView textView7 = (TextView) findViewById(R.id.textView7);
        final TextView textView8 = (TextView) findViewById(R.id.textView8);
        final TextView textView9 = (TextView) findViewById(R.id.textView9);
        final TextView textView10 = (TextView) findViewById(R.id.textView10);
        final TextView textView11 = (TextView) findViewById(R.id.textView11);
        final TextView textView12 = (TextView) findViewById(R.id.textView12);
        final TextView textView13 = (TextView) findViewById(R.id.textView13);
        final TextView textView14 = (TextView) findViewById(R.id.textView14);
        final TextView textView14_5 = (TextView) findViewById(R.id.textView14_5);
        final TextView textView15 = (TextView) findViewById(R.id.textView15);
        final TextView textView16 = (TextView) findViewById(R.id.textView16);
        final TextView textView16_5 = (TextView) findViewById(R.id.textView16_5);
        final TextView textView16__5 = (TextView) findViewById(R.id.textView16__5);
        final TextView textView17 = (TextView) findViewById(R.id.textView17);
        final TextView textView18 = (TextView) findViewById(R.id.textView18);
        final TextView textView18_25 = (TextView) findViewById(R.id.textView18_25);
        final TextView textView18_50 = (TextView) findViewById(R.id.textView18_50);
        final TextView textView18_500 = (TextView) findViewById(R.id.textView18_500);
        final TextView textView18_5 = (TextView) findViewById(R.id.textView18_5);
        final TextView textView19 = (TextView) findViewById(R.id.textView19);
        final TextView textView20 = (TextView) findViewById(R.id.textView20);
        final TextView textView21 = (TextView) findViewById(R.id.textView21);
        final TextView textView22 = (TextView) findViewById(R.id.textView22);
        final TextView textView23 = (TextView) findViewById(R.id.textView23);
        final TextView textView24 = (TextView) findViewById(R.id.textView24);
        final TextView textView25 = (TextView) findViewById(R.id.textView25);
        final TextView textView26 = (TextView) findViewById(R.id.textView26);
        final TextView textView27 = (TextView) findViewById(R.id.textView27);
        final TextView textView28 = (TextView) findViewById(R.id.textView28);
        final TextView textView29 = (TextView) findViewById(R.id.textView29);
        final TextView textView30 = (TextView) findViewById(R.id.textView30);
        final Button peasant_button = (Button) findViewById(R.id.peasant_button);
        final Button aristocracy_button = (Button) findViewById(R.id.aristocracy_button);
        final Button defend = (Button) findViewById(R.id.defend);
        final Button attack = (Button) findViewById(R.id.attack);
        final Button all_pay_button = (Button) findViewById(R.id.all_pay_button);
        final Button reach_pay_button = (Button) findViewById(R.id.reach_pay_button);
        final Button return_home_button = (Button) findViewById(R.id.return_home_button);
        final Button go_hunt_button = (Button) findViewById(R.id.go_hunt_button);
        final Button go_main_activity_button = (Button) findViewById(R.id.go_main_activity_button);

        textView1.setText(One_list.one_scenario[0]);
        textView2.setText(One_list.one_scenario[1]);
        textView3.setText(One_list.one_scenario[2]);
        textView4.setText(One_list.one_scenario[3]);
        textView5.setText(One_list.one_scenario[4]);
        textView6.setText(One_list.one_scenario[5]);
        textView7.setText(One_list.one_scenario[6]);
        textView8.setText(One_list.one_scenario[7]);
        textView9.setText(One_list.one_scenario[8]);
        textView10.setText(One_list.one_scenario[9]);
        textView11.setText(One_list.one_scenario[10]);
        textView12.setText(One_list.one_scenario[11]);
        textView13.setText(One_list.one_scenario[12]);
        textView14.setText(One_list.one_scenario[13]);
        textView14_5.setText(One_list.one_scenario[14]);
        reach_pay_button.setVisibility(Button.GONE);
        all_pay_button.setVisibility(Button.GONE);
        defend.setVisibility(Button.GONE);
        attack.setVisibility(Button.GONE);
        textView15.setVisibility(View.GONE);
        textView16.setVisibility(View.GONE);
        textView16_5.setVisibility(View.GONE);
        textView16__5.setVisibility(View.GONE);
        textView17.setVisibility(View.GONE);
        textView18.setVisibility(View.GONE);
        textView19.setVisibility(View.GONE);
        textView20.setVisibility(View.GONE);
        textView21.setVisibility(View.GONE);
        textView22.setVisibility(View.GONE);
        textView23.setVisibility(View.GONE);
        textView24.setVisibility(View.GONE);
        textView25.setVisibility(View.GONE);
        textView26.setVisibility(View.GONE);
        textView27.setVisibility(View.GONE);
        textView28.setVisibility(View.GONE);
        textView29.setVisibility(View.GONE);
        textView30.setVisibility(View.GONE);
        textView18_5.setVisibility(View.GONE);
        textView18_25.setVisibility(View.GONE);
        textView18_50.setVisibility(View.GONE);
        textView18_500.setVisibility(View.GONE);
        crusaders_die.setVisibility(View.GONE);
        death_arrow.setVisibility(View.GONE);
        return_home_button.setVisibility(View.GONE);
        go_hunt_button.setVisibility(View.GONE);
        go_main_activity_button.setVisibility(Button.GONE);

        aristocracy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peasant_button.setVisibility(Button.GONE);
                textView15.setVisibility(View.VISIBLE);
                textView16.setVisibility(View.VISIBLE);
                all_pay_button.setVisibility(View.VISIBLE);
                reach_pay_button.setVisibility(View.VISIBLE);
            }
        });
            all_pay_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reach_pay_button.setVisibility(View.GONE);
                    textView16_5.setVisibility(View.VISIBLE);
                    textView16__5.setVisibility(View.VISIBLE);
                    defend.setVisibility(View.VISIBLE);
                    attack.setVisibility(View.VISIBLE);
                }
            });
            reach_pay_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    all_pay_button.setVisibility(View.GONE);
                    textView17.setVisibility(View.VISIBLE);
                    textView18.setVisibility(View.VISIBLE);
                    textView18_5.setVisibility(View.VISIBLE);
                    textView18_50.setVisibility(View.VISIBLE);
                    textView18_500.setVisibility(View.VISIBLE);
                    defend.setVisibility(View.VISIBLE);
                    attack.setVisibility(View.VISIBLE);

                }
            });
            defend.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    attack.setVisibility(View.GONE);
                    textView18_25.setVisibility(View.VISIBLE);
                    death_arrow.setVisibility(View.VISIBLE);
                    go_main_activity_button.setVisibility(Button.VISIBLE);
                }
            });
            attack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defend.setVisibility(View.GONE);
                    textView19.setVisibility(View.VISIBLE);
                    textView20.setVisibility(View.VISIBLE);
                    go_main_activity_button.setVisibility(Button.VISIBLE);
                }
            });
            peasant_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView21.setVisibility(View.VISIBLE);
                    textView22.setVisibility(View.VISIBLE);
                    textView23.setVisibility(View.VISIBLE);
                    textView24.setVisibility(View.VISIBLE);
                    return_home_button.setVisibility(Button.VISIBLE);
                    go_hunt_button.setVisibility(Button.VISIBLE);
                }
            });
            return_home_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    go_hunt_button.setVisibility(Button.GONE);
                    textView25.setVisibility(View.VISIBLE);
                    textView26.setVisibility(View.VISIBLE);
                    textView27.setVisibility(View.VISIBLE);
                    go_main_activity_button.setVisibility(Button.VISIBLE);
                }
            });
            go_hunt_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    return_home_button.setVisibility(Button.GONE);
                    textView28.setVisibility(View.VISIBLE);
                    textView29.setVisibility(View.VISIBLE);
                    textView30.setVisibility(View.VISIBLE);
                    crusaders_die.setVisibility(View.VISIBLE);
                    go_main_activity_button.setVisibility(Button.VISIBLE);
                }
            });
        go_main_activity_button.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Begining_the_game.this, MainActivity.class); startActivity(intent);finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    };
}
