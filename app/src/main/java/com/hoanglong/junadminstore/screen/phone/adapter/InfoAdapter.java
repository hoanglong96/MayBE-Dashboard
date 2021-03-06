package com.hoanglong.junadminstore.screen.phone.adapter;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hoanglong.junadminstore.R;
import com.hoanglong.junadminstore.data.model.phone_product.Parameter;

import java.util.List;


public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoHolder> {

    private List<Parameter> mParameterList;
    private LayoutInflater mInflater;

    public InfoAdapter(List<Parameter> parameterList) {
        mParameterList = parameterList;
    }

    @NonNull
    @Override
    public InfoHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if(mInflater==null){
            mInflater = LayoutInflater.from(viewGroup.getContext());
        }
        View view = mInflater.inflate(R.layout.item_info_product,viewGroup,false);
        return new InfoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InfoHolder infoHolder, int i) {
        Parameter parameter = mParameterList.get(i);
        infoHolder.bindData(parameter);
        if(i%2==1){
            infoHolder.mLinearInfo.setBackgroundColor(Color.parseColor("#fafafa"));
        }
    }

    @Override
    public int getItemCount() {
        return mParameterList!=null?mParameterList.size():0;
    }

    class InfoHolder extends RecyclerView.ViewHolder {

        private TextView mTextInfo;
        private TextView mTextDetail;
        private LinearLayout mLinearInfo;

        InfoHolder(@NonNull View itemView) {
            super(itemView);
            mTextInfo = itemView.findViewById(R.id.text_title_info);
            mTextDetail = itemView.findViewById(R.id.text_detail_info);
            mLinearInfo = itemView.findViewById(R.id.linear_info);
        }

        void bindData(Parameter parameter) {
            if(parameter ==null){
                return;
            }
            mTextDetail.setText(parameter.getContentPara());
            mTextInfo.setText(parameter.getTitlePara());
        }
    }
}
