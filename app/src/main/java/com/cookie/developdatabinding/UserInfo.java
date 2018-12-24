package com.cookie.developdatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class UserInfo extends BaseObservable {
    private String firstName;
    private String lastName;

    public UserInfo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
//        notifyPropertyChanged(BR.lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
//        notifyPropertyChanged(BR.firstName);
    }
}
