package com.example.stani.fragmentexample;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionsListFragment extends ListFragment {

    static interface DescriptionListListener{
        void itemsClicked(long id);
    }

    private DescriptionListListener listener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity );
        this.listener = (DescriptionListListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if(listener != null){
            listener.itemsClicked(id);
        }
        super.onListItemClick(l, v, position, id);
    }

    public DescriptionsListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String [] menuItems = new String [Diner.dinerMenus.length];
        for(int i = 0; i < menuItems.length; i++){
           menuItems[i] = Diner.dinerMenus[i].getMenuItem();
           //to work with list we create an ArrayAdapter
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, menuItems);
                    setListAdapter(adapter);




        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
