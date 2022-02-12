package com.rushikeshnarkhede.menunotepad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;

import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.file);
        txt2=findViewById(R.id.edit);
        txt3=findViewById(R.id.format);
        txt4=findViewById(R.id.view);
        txt5=findViewById(R.id.help);
        registerForContextMenu(txt1);
        registerForContextMenu(txt2);
        registerForContextMenu(txt3);
        registerForContextMenu(txt4);
        registerForContextMenu(txt5);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        int id=v.getId();
        if(id==R.id.file)
        {
            MenuInflater mi=getMenuInflater();
            mi.inflate(R.menu.file,menu);
        }

        if(id==R.id.edit)
        {
            MenuInflater mi=getMenuInflater();
            mi.inflate(R.menu.edit,menu);
        }
        if(id==R.id.format)
        {
            MenuInflater mi=getMenuInflater();
            mi.inflate(R.menu.format,menu);
        }
        if(id==R.id.view)
        {
            MenuInflater mi=getMenuInflater();
            mi.inflate(R.menu.view,menu);
        }
        if(id==R.id.help)
        {
            MenuInflater mi=getMenuInflater();
            mi.inflate(R.menu.help,menu);
        }

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        super.onContextItemSelected(item);
        int id=item.getItemId();
        Resources r=getResources();
        switch(id)
        {
            case R.id.file1:
                Toast.makeText(this, "New", Toast.LENGTH_SHORT).show();
                break;
            case R.id.file2:
                Toast.makeText(this, "New Window", Toast.LENGTH_SHORT).show();
                break;
            case R.id.file3:
                Toast.makeText(this, "Open", Toast.LENGTH_SHORT).show();
                break;
            case R.id.file4:
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show();
                break;
            case R.id.file5:
                Toast.makeText(this, "Save As", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit1:
                Toast.makeText(this, "Undo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit2:
                Toast.makeText(this, "Cut", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit3:
                Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit4:
                Toast.makeText(this, "Paste", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edit5:
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
                break;
            case R.id.format1:
                Toast.makeText(this, "Word Wrap", Toast.LENGTH_SHORT).show();
                break;
            case R.id.format2:
                Toast.makeText(this, "Font", Toast.LENGTH_SHORT).show();
                break;
            case R.id.view1:
                Toast.makeText(this, "Zoom", Toast.LENGTH_SHORT).show();
                break;
            case R.id.view2:
                Toast.makeText(this, "Status Bar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help1:
                Toast.makeText(this, "View Help", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help2:
                Toast.makeText(this, "Send Feedback", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help3:
                Toast.makeText(this, "About Notepad", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
