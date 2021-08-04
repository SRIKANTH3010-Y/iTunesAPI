package com.example.ituneapiintegration;

import android.icu.util.Output;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    EditText ArtistSearch;
    GridView SongDetails;
    String Artist;
    String Output;
    ArrayList<String> SongCollections=new ArrayList<>();
    ArrayList<Model.Results> StoredData=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.ImageView);
        ArtistSearch=findViewById(R.id.EditText);
        SongDetails=findViewById(R.id.GridView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,SongCollections);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> Songs=new ArrayList<>();
                Artist=ArtistSearch.getText().toString().trim();
                Output="\n**********  "+ Artist+"  ************\n";
                ArtistSearch.setText("");
                Method method=RetrofitClient.getRetrofitInstances().create(Method.class);
                Call<Model> call=method.getAllData();
                call.enqueue(new Callback<Model>() {

                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {
                        SongCollections.clear();
                        int flag=1;
                        ArrayList<Model.Results> results=response.body().getResults();
                        for (Model.Results results1:results){
                            if (Artist.toLowerCase().equals(results1.getArtistName().toLowerCase())){
                                Output+=results1.display();
                                SongCollections.add(results1.getCollectionName());
                            }
                        }
                        if (StoredData==null){
                            StoredData=results;
                        }
                        System.out.println(Output);
                        SongDetails.setAdapter(arrayAdapter);
                        System.out.println(SongCollections);
                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {
                        System.out.println("Connection Failed");
                        for (Model.Results results1:StoredData){
                            if (Artist.toLowerCase().equals(results1.getArtistName().toLowerCase())){
                                Output+=results1.display();
                                SongCollections.add(results1.getCollectionName());
                            }
                            else {
                                Toast.makeText(MainActivity.this,"Artist Doesnt Exists!!!",Toast.LENGTH_LONG);
                            }
                        }
                        System.out.println(Output);
                        SongDetails.setAdapter(arrayAdapter);
                        System.out.println(SongCollections);
                    }
                });
            }
        });

    }
}