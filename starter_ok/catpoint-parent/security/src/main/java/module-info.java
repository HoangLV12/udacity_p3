module security {
    requires java.desktop;
    requires image;
    requires com.google.common;
    requires com.google.gson;
    requires java.prefs;
    requires miglayout.swing;
    opens com.udacity.catpoint.security.data to com.google.gson;
}