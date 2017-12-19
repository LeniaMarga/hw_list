package com.example.user.mytodolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoList_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToDoList toDoList = new ToDoList();
        ArrayList<ToDo> list = toDoList.getList();

        ToDoAdapter toDoAdapter = new ToDoAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(toDoAdapter);

    }

    public void getToDo(View listItem){
        ToDo toDo = (ToDo) listItem.getTag();
        Log.d("Title:", toDo.getTitle());

        Intent intent = new Intent(this, ToDo_activity.class );
        intent.putExtra("to Do", toDo);
        startActivity(intent);
    }
}
