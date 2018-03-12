package com.example.stani.fragmentexample;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class DinerMenuFragment extends Fragment {

    //which menu item was clicked

    private long menuItem;

    public void setMenuItem(long menuItem) {
        this.menuItem = menuItem;
    }


    public DinerMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        if (savedInstanceState != null) {
            menuItem = savedInstanceState.getLong("menuID");
        }
        return inflater.inflate(R.layout.fragment_diner_menu, container, false);

    }

    @Override
    public void onStart() {

        super.onStart();

        //get reference to the two textViews
        View view = getView();
        if (view != null) {
            TextView name = (TextView) view.findViewById(R.id.nameTextView);
            TextView description = (TextView) view.findViewById(R.id.descriptiontextView);


            //get the item based on its id
            Diner menu = Diner.dinerMenus[(int) menuItem];
            name.setText(menu.getMenuItem());
            description.setText(menu.getMenuItemDescription());


        }

    }
}

