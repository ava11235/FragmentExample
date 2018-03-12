package com.example.stani.fragmentexample;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity implements DescriptionsListFragment.DescriptionListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //DinerMenuFragment frag = (DinerMenuFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
         //frag.setMenuItem(0);  //set default to menu item 0

    }


    @Override
    public void itemsClicked(long id) {

            DinerMenuFragment dinerMenuFragment = new DinerMenuFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        dinerMenuFragment.setMenuItem(id);
        ft.replace(R.id.fragment_container, dinerMenuFragment);
        ft.addToBackStack(null);
        ft.setTransition((FragmentTransaction.TRANSIT_FRAGMENT_FADE));
        ft.commit();

    }
}
