package org.teamrubiconusa.teamrubicon;

import org.teamrubiconusa.teamrubicon.WallaceModels.Event;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

public class eventListDialog  extends DialogFragment {
	private Event currentEvent;
	private String currentEventName;
	private String currentEventLocation;
	
	private TextView eventNameTextView;
	private TextView eventLocationTextView;
	
	public eventListDialog(){}
	
	public eventListDialog(Event event)
	{
		this.currentEvent = event;
		this.currentEventName = event.getEventName();
		this.currentEventLocation = event.getEventLocation();
	}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
    	getDialog().setCancelable(true);
    	//Get the view
        View view = inflater.inflate(R.layout.list_dialog, container, false);
        
        eventNameTextView = (TextView) view.findViewById(R.id.dialog_label1);
        eventLocationTextView = (TextView) view.findViewById(R.id.dialog_label2);
        
        eventNameTextView.setText(currentEvent.getEventName());
        eventLocationTextView.setText(currentEvent.getEventLocation());
        
        return view;
    }
}

