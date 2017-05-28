package in.vaibhav.com.recyclerviewadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vaibhav on 17/2/17.
 */

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    String[] items;

    public Adapter(Context ctx, String[] itms) {
        context = ctx;
        items = itms;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(context);
        View row = inflator.inflate(R.layout.custom_row, parent, false);
        Item item = new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ((Item) holder).tv.setText(items[position]);
        //for setting onClicklistener
        ((Item) holder).btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked name is : " + ((Item) holder).tv.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        ((Item) holder).linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked name is : " + ((Item) holder).tv.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.length;//return no.of items
    }


//
//    public class Item extends RecyclerView.ViewHolder {
//        TextView tv;
//        Button btn;
//        LinearLayout linearLayout;
//
//        public Item(View itemView) {
//            super(itemView);
//            tv = (TextView) itemView.findViewById(R.id.item);
//            btn = (Button) itemView.findViewById(R.id.btn);
//            linearLayout = (LinearLayout) itemView.findViewById(R.id.each_item);
//        }
//    }
}
