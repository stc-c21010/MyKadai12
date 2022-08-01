package jp.suntech.c21010.mykadai12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bts;
    private Button btcl;
    private Button btco;
    private EditText ma;
    private EditText name;
    private EditText mt;
    private EditText mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bts=findViewById(R.id.bts);
        btcl=findViewById(R.id.btc1);
        btco=findViewById(R.id.btc2);
        ma= findViewById(R.id.etm);
        name=findViewById(R.id.etn);
        mt=findViewById(R.id.etmt);
        mc=findViewById(R.id.etc);
        btcl.setOnClickListener(new OnClick());
        bts.setOnClickListener(new OnClick());
        btco.setOnClickListener(new OnClick());
    }
    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            String n=name.getText().toString();
            String maila=ma.getText().toString();
            String mtitle=mt.getText().toString();
            String mcom=mc.getText().toString();
            int id=view.getId();
            switch (id) {
                case R.id.bts:
                    String is = "この内容で送信します。\n"+"名前:" + n + "\n" + "メールアドレス:" + maila + "\n" + "メールタイトル:" + mtitle + "\n" + "質問内容\n" + mcom;
                    Toast.makeText(MainActivity.this, is, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btc1:
                    name.setText("");
                    ma.setText("");
                    mt.setText("");
                    mc.setText("");
                    break;
                //case R.id.btc2:
                //    DialogFragment.class.
                //    String i = "名前:" + n + "\n" + "メールアドレス:" + maila + "\n" + "メールタイトル:" + mtitle + "\n" + "質問内容\n" + mcom;
                //    Toast.makeText(MainActivity.this, i, Toast.LENGTH_LONG).show();
                //    break;
            }
        }
    }
}