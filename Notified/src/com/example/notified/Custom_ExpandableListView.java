package com.example.notified;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
 
public class Custom_ExpandableListView extends Activity {
 
	private ArrayList<String> groups;
	private ArrayList<ArrayList<ArrayList<String>>> childs;
	private int lastExpandedGroupPosition;
	private ExpandableListView l;
 
   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.mededelingoverzicht);

        l = (ExpandableListView) findViewById(R.id.ExpandableList);
 
        loadData();
        
        myExpandableAdapter adapter = new myExpandableAdapter(this, groups, childs);
		l.setAdapter(adapter);
    }
 
    public class myExpandableAdapter extends BaseExpandableListAdapter {
 
    	private ArrayList<String> groups;
 
        private ArrayList<ArrayList<ArrayList<String>>> children;
 
    	private Context context;
 
    	public myExpandableAdapter(Context context, ArrayList<String> groups, ArrayList<ArrayList<ArrayList<String>>> children) {
            this.context = context;
            this.groups = groups;
            this.children = childs;
        }
 
    	public void onGroupExpanded(int groupPosition){
            //collapse the old expanded group, if not the same
            //as new group to expand
            if(groupPosition != lastExpandedGroupPosition){
                l.collapseGroup(lastExpandedGroupPosition);
            }

            super.onGroupExpanded(groupPosition);           
            lastExpandedGroupPosition = groupPosition;
        }
    	
        public boolean areAllItemsEnabled()
        {
            return true;
        }
 
 
        
        public ArrayList<String> getChild(int groupPosition, int childPosition) {
            return children.get(groupPosition).get(childPosition);
        }
 
        
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }
 
 
        
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild,View convertView, ViewGroup parent) {
 
        	String child = (String) ((ArrayList<String>)getChild(groupPosition, childPosition)).get(0);
 
            if (convertView == null) {
                LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = infalInflater.inflate(R.layout.expandablelistview_child, null);
            }
 
            TextView childtxt = (TextView) convertView.findViewById(R.id.TextViewChild01);
 
            childtxt.setText(child);
 
            return convertView;
        }
 
        
        public int getChildrenCount(int groupPosition) {
            return children.get(groupPosition).size();
        }
 
        
        public String getGroup(int groupPosition) {
            return groups.get(groupPosition);
        }
 
        
        public int getGroupCount() {
            return groups.size();
        }
 
        
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }
 
        
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
 
        	String group = (String) getGroup(groupPosition);
 
        	if (convertView == null) {
                LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = infalInflater.inflate(R.layout.expandablelistview_group, null);
            }
 
            TextView grouptxt = (TextView) convertView.findViewById(R.id.TextViewGroup);
 
            grouptxt.setText(group);
 
            return convertView;
        }
 
       
        public boolean hasStableIds() {
            return true;
        }
 
        
        public boolean isChildSelectable(int arg0, int arg1) {
            return true;
        }
 
    }
 
    private void loadData(){
    	groups= new ArrayList<String>();
    	childs= new ArrayList<ArrayList<ArrayList<String>>>();
 
    	groups.add("Iad1");
        groups.add("Ipsen6");
        groups.add("Ifioz");
        groups.add("Ioop2");
        groups.add("Inst");
 
        childs.add(new ArrayList<ArrayList<String>>());
        childs.get(0).add(new ArrayList<String>());
        childs.get(0).get(0).add("De les gaat niet door op 18-05-2015");
        childs.get(0).add(new ArrayList<String>());
        childs.get(0).get(1).add("De les gaat door");
        childs.get(0).add(new ArrayList<String>());
        childs.get(0).get(2).add("Toch niet");
 
        childs.add(new ArrayList<ArrayList<String>>());
        childs.get(1).add(new ArrayList<String>());
        childs.get(1).get(0).add("Dit vak is een project");
        childs.get(1).add(new ArrayList<String>());
        childs.get(1).get(1).add("Je moet app maken");
        childs.get(1).add(new ArrayList<String>());
        childs.get(1).get(2).add("Groepen 4 en 2 om 12:16 op school");
 
        childs.add(new ArrayList<ArrayList<String>>());
        childs.get(2).add(new ArrayList<String>());
        childs.get(2).get(0).add("Geen internet");
        childs.get(2).add(new ArrayList<String>());
        childs.get(2).get(1).add("Geen Leraar");
        childs.get(2).add(new ArrayList<String>());
        childs.get(2).get(2).add("Niet genoeg plaats");
        
        childs.add(new ArrayList<ArrayList<String>>());
        childs.get(3).add(new ArrayList<String>());
        childs.get(3).get(0).add("Geen mededelingen");
        
        childs.add(new ArrayList<ArrayList<String>>());
        childs.get(4).add(new ArrayList<String>());
        childs.get(4).get(0).add("Schrijf je uit");
        childs.get(4).add(new ArrayList<String>());
        childs.get(4).get(1).add("Toch maar niet");


    }
}