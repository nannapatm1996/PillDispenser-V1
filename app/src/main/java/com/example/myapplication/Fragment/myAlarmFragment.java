package com.example.myapplication.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class myAlarmFragment extends alarmListFragment{

    public myAlarmFragment(){}

    @Override
    public Query getQuery(DatabaseReference databaseReference){
        return databaseReference.child("user-alarms").child(getUid());
    }
}
