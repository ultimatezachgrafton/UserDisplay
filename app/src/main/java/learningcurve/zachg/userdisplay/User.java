package learningcurve.zachg.userdisplay;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class User extends BaseObservable {

    @NonNull
    private String id;
    @NonNull
    private String email;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private String clientName;
    private String birthday;
    @NonNull
    private String password;
    private String confirmPassword;

    private String isAdminString;
    private boolean isAdmin;
    private boolean isLoggedIn;

    private String dateJoined;

    public User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email) {
        this.email = email;
    }

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientName = getClientName();
        this.email = email;
        this.password = password;
        this.id = getId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id; }

    @Bindable
    public String getEmail() { return email; }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged((Integer) BR.email);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged((Integer) BR.password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setClientName(String clientName) {
        this.clientName = clientName;
        notifyPropertyChanged(BR.clientName);
    }

    @Bindable
    public String getClientName() { return clientName; }

    public String concatClientName() {
        this.clientName = (this.firstName + " " + this.lastName);
        return clientName; }

    public boolean getIsLoggedIn() { return isLoggedIn; }

    public void setIsLoggedIn(boolean isLoggedIn) { this.isLoggedIn = false; }

    public void setIsAdmin(boolean isAdmin) { this.isAdmin = isAdmin; }

    public boolean getIsAdmin() { return isAdmin; }

    public String getIsAdminString() { return isAdminString; }

    public void setIsAdminString(boolean isAdmin) {
        if (isAdmin) { this.isAdminString = "Admin"; } else { isAdminString = "User"; }
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setDateJoined(String dateJoined) { this.dateJoined = dateJoined; }

    public String getDateJoined() { return dateJoined; }

    public String getPhotoFilename() { return "IMG_" + getId() + ".jpg"; }

}