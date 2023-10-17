package com.manar.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
  private Button btn;
  private Spinner spn;
  private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        spn=findViewById(R.id.spn);
        resultText=findViewById(R.id.Result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cat=spn.getSelectedItem().toString();
                Database db=new Database();
                List<Book> result=db.getBooks(cat);
                String str="";
                for(Book b:result){
                    str+=b.getTitle()+"\n";

                }
                resultText.setText(str);
            }
        });

    }
}