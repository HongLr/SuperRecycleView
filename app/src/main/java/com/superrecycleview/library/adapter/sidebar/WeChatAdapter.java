
package com.superrecycleview.library.adapter.sidebar;

import android.content.Context;

import com.superrecycleview.library.R;
import com.superrecycleview.library.bean.sidebar.WeChatBean;
import com.superrecycleview.superlibrary.adapter.SuperBaseAdapter;

import java.util.List;

/**
 * Created by super南仔 on 2017-05-04. 类备注： 需要传入的参数:
 */
public class WeChatAdapter extends SuperBaseAdapter<WeChatBean> {

    public WeChatAdapter(Context context, List<WeChatBean> data) {
        super(context, data);
    }

    @Override
    protected void convert(com.superrecycleview.superlibrary.adapter.BaseViewHolder holder,
            WeChatBean item, int position) {
        holder.setText(R.id.super_tv_name, item.getName());
    }

    @Override
    protected int getItemViewLayoutId(int position, WeChatBean item) {
        return R.layout.adapter_wechat_layout;
    }
}
