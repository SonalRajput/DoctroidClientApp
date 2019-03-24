package apps.abhibhardwaj.com.doctriod.patient.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import apps.abhibhardwaj.com.doctriod.patient.R;
import java.util.ArrayList;

public class HomeGridAdapter extends BaseAdapter {

  Context context;
  private int  icons [] = {R.drawable.ic_find_doctor, R.drawable.ic_appointments, R.drawable.ic_hospitals, R.drawable.ic_shop, R.drawable.ic_medicine, R.drawable.ic_emergency};
  private String labels [] = {"Find Doctor", "Appointments", "Nearby", "Buy Medicine", "Medicines", "Emergency"};

  public HomeGridAdapter (Context context) {
    this.context = context;
  }

  @Override
  public int getCount() {
    return icons.length;
  }

  @Override
  public Object getItem(int position) {
    return null;
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }

  @Override
  public View getView(int position, View view, ViewGroup parent) {
    view = LayoutInflater.from(context).inflate(R.layout.layout_home_grid_view_single_item, parent, false);

    ImageView icon = view.findViewById(R.id.iv_icon);
    TextView label = view.findViewById(R.id.tv_label);

    icon.setImageResource(icons[position]);
    label.setText(labels[position]);

    return view;
  }
}
