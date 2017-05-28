package in.vaibhav.com.recyclerviewadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by vaibhav on 28/5/17.
 */
//Item class for recycler view holding purpose

public class Item extends RecyclerView.ViewHolder {
    TextView tv;
    Button btn;
    LinearLayout linearLayout;

    public Item(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.item);
        btn = (Button) itemView.findViewById(R.id.btn);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.each_item);
    }
}