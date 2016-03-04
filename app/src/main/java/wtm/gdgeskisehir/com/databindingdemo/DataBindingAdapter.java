package wtm.gdgeskisehir.com.databindingdemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import wtm.gdgeskisehir.com.databindingdemo.databinding.ListItemBinding;

/**
 * Created by mertsimsek on 04/03/16.
 */
public class DataBindingAdapter extends RecyclerView.Adapter<DataBindingAdapter.BindingViewHolder>{

    List<User> users;

    public DataBindingAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BindingViewHolder.create(LayoutInflater.from(parent.getContext()),parent);
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        holder.bindTo(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class BindingViewHolder extends RecyclerView.ViewHolder {

        static BindingViewHolder create(LayoutInflater inflater, ViewGroup parent) {
            ListItemBinding binding = ListItemBinding.inflate(inflater, parent, false);
            return new BindingViewHolder(binding);
        }

        private ListItemBinding binding;

        private BindingViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bindTo(User user){
            binding.setUser(user);
            binding.executePendingBindings();
        }

    }
}
