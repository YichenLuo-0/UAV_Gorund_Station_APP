package com.uav_app.front_end.map_activity.managers;

import android.widget.Button;
import android.widget.FrameLayout;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.uav_app.back_end.uav_manager.R;
import com.uav_app.front_end.map_activity.MapActivity;
import com.uav_app.front_end.map_activity.MapActivityState;

public class ButtonManager extends Manager implements MapActivityState.StateChangeListener {
    // 母面板
    private final FrameLayout buttons;
    // 菜单按钮
    private final Button menuButton;
    // 定位地面站按钮
    private final Button locationButton;

    public ButtonManager(MapActivity activity) {
        super(activity, 0x03);
        buttons = activity.findViewById(R.id.button);
        menuButton = activity.findViewById(R.id.menu);
        locationButton = activity.findViewById(R.id.location);
    }

    public void init(Connector connector, int topMargin, int bottomMargin) {
        super.init(connector);
        // 重设控件面板位置和大小
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) buttons.getLayoutParams();
        params.topMargin = topMargin;
        params.bottomMargin = bottomMargin;
        buttons.requestLayout();
        // 设置菜单按钮点击事件
        menuButton.setOnClickListener(v -> {
        });
    }

    @Override
    public void onStateChange(MapActivityState mapActivityState) {
    }
}
