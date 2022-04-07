package org.jenkinsci.plugins;

import hudson.Extension;
import hudson.model.UnprotectedRootAction;

import java.util.Random;

/**
 * @author Kohsuke Kawaguchi
 */
@Extension
public class Beer implements UnprotectedRootAction {
    private static final Random random = new Random();

    public String getQuote() {
        return MESSAGES[random.nextInt(MESSAGES.length)];
    }
    
    public String getImage() {
        return IMAGES[random.nextInt(IMAGES.length)];
    }
    
    public String getIconFileName() {
        return "symbol-beer plugin-beer";
    }

    public String getDisplayName() {
        return "We Need Beer";
    }

    public String getUrlName() {
        return "beer";
    }

    private final String[] MESSAGES = {
            "Having RVM problems",
            "Maven is downloading the internet",
            "Bundler is fetching the RubyGems index",
            "Jenkins is restarting",
            "Code is compiling",
            "It's 5 o'clock somewhere",
            "Launching Eclipse",
            "Firing up Emacs",
            "Compiling OpenOffice from source",
            "Running Selenium tests",
            "Starting the Android emulator",
            "Launching Amazon RDS"
    };

    private final String[] IMAGES = {
            "beer.gif",
            "bigbeer.png",
            "man.jpg",
            "starwars-beer.gif",
            "drinking-beer.gif",
            "pouring-beer.gif",
            "harpoon.gif"
    };
}
