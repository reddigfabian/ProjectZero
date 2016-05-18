package udacity.fabianreddig.zero.myappportfolio.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by WillowTree, Inc. on 5/16/16.
 */
public class MyApp {
    private String name;
    private String packageName;

    private MyApp(String name, String packageName) {
        this.name = name;
        this.packageName = name;
    }

    public static class Builder{
        //Required parameters
        @NonNull
        private final String name;

        //Optional parameters
        @Nullable
        private String packageName;

        public Builder(String name) {
            this.name = name;
        }

        public Builder packageName(String packageName){
            this.packageName = packageName;
            return this;
        }

        public MyApp build(){
            return new MyApp(name, packageName);
        }
    }

    public String getName() {
        return name;
    }

    public String getPackageName() {
        return packageName;
    }
}
