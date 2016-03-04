package wtm.gdgeskisehir.com.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by mertsimsek on 27/02/16.
 */
public class User extends BaseObservable{
    String name;
    String surname;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(wtm.gdgeskisehir.com.databindingdemo.BR.name);
    }

    @Bindable
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        notifyPropertyChanged(wtm.gdgeskisehir.com.databindingdemo.BR.surname);
    }
}
