package com.example.shirbruchim.touchcardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CardsPack cardsPack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardsPack = new CardsPack();

        initViews();
        initListeners();

        final Button button = findViewById(R.id.btnStartNewGame);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cardsPack = new CardsPack();
                // Code here executes on main thread after user presses button
                Toast toast = Toast.makeText(getApplicationContext(), "card pack is new", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    private void initViews() {

        titleView = (TextView)findViewById(R.id.event_title);
        dateView = (TextView)findViewById(R.id.event_date);
        addressView = (TextView)findViewById(R.id.event_address);
        invitationInfoView  = (TextView)findViewById(R.id.event_invitation_info);
        spUserStatus = (Spinner)findViewById(R.id.spUserStatus);
        btnEventDate = (Button)findViewById(R.id.btn_event_date);
        btnEventLocation = (Button)findViewById(R.id.btn_event_location);
        tvEventDescription = (TextView)findViewById(R.id.tvEventDescription);
        editEventComment = (EditText) findViewById(R.id.editEventComment);
        btnPostComment = (Button) findViewById(R.id.btnPostComment);

        mCommentsRecycler = (RecyclerView) findViewById(R.id.recycler_event_comments);
        mCommentsRecycler.setHasFixedSize(true);
        mManager = new LinearLayoutManager(this);
        mCommentsRecycler.setLayoutManager(mManager);
        mAdapter = new CommentAdapter(mComments);
        mCommentsRecycler.setAdapter(mAdapter);
    }

    private void onClick_btnStartNewGame(){

    }
}
